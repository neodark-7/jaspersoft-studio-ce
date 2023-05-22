/*******************************************************************************
 * Copyright © 2010-2023. Cloud Software Group, Inc. All rights reserved.
 *******************************************************************************/
package com.jaspersoft.studio.formatting.actions;

import java.util.List;

import net.sf.jasperreports.engine.design.JRDesignElement;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;

import com.jaspersoft.studio.JSSCompoundCommand;
import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.messages.Messages;
import com.jaspersoft.studio.model.APropertyNode;
import com.jaspersoft.studio.property.SetValueCommand;

public class JoinRightAction extends AbstractFormattingAction {

	/** The Constant ID. */
	public static final String ID = "joinright"; //$NON-NLS-1$
	
	public JoinRightAction(IWorkbenchPart part) {
		super(part);
		setText(Messages.JoinRightAction_actionName);
		setToolTipText(Messages.JoinRightAction_actionDescription);
		setId(ID);
		setImageDescriptor(JaspersoftStudioPlugin.getInstance().getImageDescriptor("icons/resources/joinright.png"));  //$NON-NLS-1$
	}
	
	public static JSSCompoundCommand generateCommand(List<APropertyNode> nodes){
		JSSCompoundCommand command = new JSSCompoundCommand(null);

    if (nodes.isEmpty()) return command;
    List<APropertyNode> sortedElements = sortXY( nodes, true);
    
    JRDesignElement jrElement = (JRDesignElement)sortedElements.get(0).getValue();
    int actualX = jrElement.getX() + jrElement.getWidth();
    for (APropertyNode element : sortedElements)
    {
  	 		command.setReferenceNodeIfNull(element);
    	 	jrElement = (JRDesignElement)element.getValue();
        actualX -= jrElement.getWidth();
        SetValueCommand setCommand = new SetValueCommand();
  			setCommand.setTarget(element);
  			setCommand.setPropertyId(JRDesignElement.PROPERTY_X);
  			setCommand.setPropertyValue(actualX);
	      command.add(setCommand);
    }
    
    return command;
	}

	@Override
	protected Command createCommand() {
		List<APropertyNode> nodes = getOperationSet();
		JSSCompoundCommand command = null;
		if (!nodes.isEmpty()){
			command = generateCommand(nodes);
			command.setDebugLabel(getText());
		}
		return command;
	}

	@Override
	protected boolean calculateEnabled() {
		return getOperationSet().size()>1;
	}

}
