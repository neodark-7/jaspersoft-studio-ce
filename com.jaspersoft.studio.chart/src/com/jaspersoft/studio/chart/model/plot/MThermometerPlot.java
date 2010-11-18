/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of iReport.
 * 
 * iReport is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * iReport is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with iReport. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.chart.model.plot;

import java.util.List;
import java.util.Map;

import net.sf.jasperreports.charts.JRThermometerPlot;
import net.sf.jasperreports.charts.design.JRDesignDataRange;
import net.sf.jasperreports.charts.design.JRDesignThermometerPlot;
import net.sf.jasperreports.charts.design.JRDesignValueDisplay;
import net.sf.jasperreports.charts.type.ValueLocationEnum;
import net.sf.jasperreports.engine.JRExpression;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import com.jaspersoft.studio.model.MExpression;
import com.jaspersoft.studio.model.text.MFont;
import com.jaspersoft.studio.property.descriptor.NullEnum;
import com.jaspersoft.studio.property.descriptor.color.ColorPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.expression.JRExpressionPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.FontPropertyDescriptor;
import com.jaspersoft.studio.property.descriptor.text.NTextPropertyDescriptor;
import com.jaspersoft.studio.utils.Colors;
import com.jaspersoft.studio.utils.EnumHelper;

public class MThermometerPlot extends MChartPlot {
	public MThermometerPlot(JRThermometerPlot value) {
		super(value);
	}
	public String getDisplayText() {
		return Messages.MThermometerPlot_thermometer_plot;
	}
	private static IPropertyDescriptor[] descriptors;
	private static Map<String, Object> defaultsMap;

	@Override
	public Map<String, Object> getDefaultsMap() {
		return defaultsMap;
	}

	@Override
	public IPropertyDescriptor[] getDescriptors() {
		return descriptors;
	}

	@Override
	public void setDescriptors(IPropertyDescriptor[] descriptors1, Map<String, Object> defaultsMap1) {
		descriptors = descriptors1;
		defaultsMap = defaultsMap1;
	}

	@Override
	public void createPropertyDescriptors(List<IPropertyDescriptor> desc, Map<String, Object> defaultsMap) {
		super.createPropertyDescriptors(desc, defaultsMap);

		ColorPropertyDescriptor mercuryColorD = new ColorPropertyDescriptor(JRDesignThermometerPlot.PROPERTY_MERCURY_COLOR,
				Messages.MThermometerPlot_mercury_color, NullEnum.NULL);
		mercuryColorD.setDescription(Messages.MThermometerPlot_mercury_color_description);
		desc.add(mercuryColorD);

		ColorPropertyDescriptor valueColorD = new ColorPropertyDescriptor(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY
				+ "." + JRDesignValueDisplay.PROPERTY_COLOR, Messages.MThermometerPlot_value_color, NullEnum.NULL); //$NON-NLS-1$
		valueColorD.setDescription(Messages.MThermometerPlot_value_color_description);
		desc.add(valueColorD);

		FontPropertyDescriptor valueFontD = new FontPropertyDescriptor(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." //$NON-NLS-1$
				+ JRDesignValueDisplay.PROPERTY_FONT, Messages.MThermometerPlot_value_font);
		valueFontD.setDescription(Messages.MThermometerPlot_value_font_description);
		desc.add(valueFontD);

		NTextPropertyDescriptor maskD = new NTextPropertyDescriptor(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." //$NON-NLS-1$
				+ JRDesignValueDisplay.PROPERTY_MASK, Messages.MThermometerPlot_value_mask);
		maskD.setDescription(Messages.MThermometerPlot_value_mask_description);
		desc.add(maskD);

		JRExpressionPropertyDescriptor dataRangeHighExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_data_range_high_expression);
		dataRangeHighExprD.setDescription(Messages.MThermometerPlot_data_range_high_expression_description);
		desc.add(dataRangeHighExprD);

		JRExpressionPropertyDescriptor dataRangeLowExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_data_range_low_expression);
		dataRangeLowExprD.setDescription(Messages.MThermometerPlot_data_range_low_expression_description);
		desc.add(dataRangeLowExprD);

		JRExpressionPropertyDescriptor highRangeHighExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_high_range_high_expression);
		highRangeHighExprD.setDescription(Messages.MThermometerPlot_high_range_high_expression_description);
		desc.add(highRangeHighExprD);

		JRExpressionPropertyDescriptor highRangeLowExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_high_range_low_expression);
		highRangeLowExprD.setDescription(Messages.MThermometerPlot_high_range_low_expression_description);
		desc.add(highRangeLowExprD);

		JRExpressionPropertyDescriptor lowRangeHighExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_low_range_high_expression);
		lowRangeHighExprD.setDescription(Messages.MThermometerPlot_low_range_high_expression_description);
		desc.add(lowRangeHighExprD);

		JRExpressionPropertyDescriptor lowRangeLowExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_low_range_low_expression);
		lowRangeLowExprD.setDescription(Messages.MThermometerPlot_low_range_low_expression_description);
		desc.add(lowRangeLowExprD);

		JRExpressionPropertyDescriptor medRangeHighExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_medium_range_high_expression);
		medRangeHighExprD.setDescription(Messages.MThermometerPlot_medium_range_high_expression_description);
		desc.add(medRangeHighExprD);

		JRExpressionPropertyDescriptor medRangeLowExprD = new JRExpressionPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION, //$NON-NLS-1$
				Messages.MThermometerPlot_medium_range_low_expression);
		medRangeLowExprD.setDescription(Messages.MThermometerPlot_medium_range_low_expression_description);
		desc.add(medRangeLowExprD);

		ComboBoxPropertyDescriptor positionTypeD = new ComboBoxPropertyDescriptor(
				JRDesignThermometerPlot.PROPERTY_VALUE_LOCATION, Messages.MThermometerPlot_value_location, EnumHelper.getEnumNames(
						ValueLocationEnum.values(), NullEnum.NOTNULL));
		positionTypeD.setDescription(Messages.MThermometerPlot_value_location_description);
		desc.add(positionTypeD);

	}

	private MExpression drhAnchorExpression;
	private MExpression drlAnchorExpression;
	private MExpression hrhAnchorExpression;
	private MExpression hrlAnchorExpression;
	private MExpression lrhAnchorExpression;
	private MExpression lrlAnchorExpression;
	private MExpression mrhAnchorExpression;
	private MExpression mrlAnchorExpression;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		JRDesignThermometerPlot jrElement = (JRDesignThermometerPlot) getValue();
		if (id.equals(JRDesignThermometerPlot.PROPERTY_MERCURY_COLOR))
			return Colors.getSWTRGB4AWTGBColor(jrElement.getMercuryColor());
		if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." + JRDesignValueDisplay.PROPERTY_COLOR)) //$NON-NLS-1$
			return Colors.getSWTRGB4AWTGBColor(jrElement.getValueDisplay().getColor());

		if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." + JRDesignValueDisplay.PROPERTY_MASK)) //$NON-NLS-1$
			return jrElement.getValueDisplay().getMask();
		if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_LOCATION))
			return EnumHelper.getValue(jrElement.getValueLocationValue(), 0, false);

		if (id.equals(JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)) { //$NON-NLS-1$
			if (drhAnchorExpression == null)
				drhAnchorExpression = new MExpression(jrElement.getDataRange().getHighExpression());
			return drhAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)) { //$NON-NLS-1$
			if (drlAnchorExpression == null)
				drlAnchorExpression = new MExpression(jrElement.getDataRange().getLowExpression());
			return drlAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)) { //$NON-NLS-1$
			if (hrhAnchorExpression == null)
				hrhAnchorExpression = new MExpression(jrElement.getHighRange().getHighExpression());
			return hrhAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)) { //$NON-NLS-1$
			if (hrlAnchorExpression == null)
				hrlAnchorExpression = new MExpression(jrElement.getHighRange().getLowExpression());
			return hrlAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)) { //$NON-NLS-1$
			if (lrhAnchorExpression == null)
				lrhAnchorExpression = new MExpression(jrElement.getLowRange().getHighExpression());
			return lrhAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)) { //$NON-NLS-1$
			if (lrlAnchorExpression == null)
				lrlAnchorExpression = new MExpression(jrElement.getLowRange().getLowExpression());
			return lrlAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." + JRDesignDataRange.PROPERTY_HIGH_EXPRESSION)) { //$NON-NLS-1$
			if (mrhAnchorExpression == null)
				mrhAnchorExpression = new MExpression(jrElement.getMediumRange().getHighExpression());
			return mrhAnchorExpression;
		}
		if (id.equals(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." + JRDesignDataRange.PROPERTY_LOW_EXPRESSION)) { //$NON-NLS-1$
			if (mrlAnchorExpression == null)
				mrlAnchorExpression = new MExpression(jrElement.getMediumRange().getLowExpression());
			return mrlAnchorExpression;
		}

		if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." + JRDesignValueDisplay.PROPERTY_FONT)) { //$NON-NLS-1$
			if (vtFont == null)
				vtFont = new MFont(jrElement.getValueDisplay().getFont());
			return vtFont;
		}

		return super.getPropertyValue(id);
	}

	private MFont vtFont;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		JRDesignThermometerPlot jrElement = (JRDesignThermometerPlot) getValue();
		if (id.equals(JRDesignThermometerPlot.PROPERTY_MERCURY_COLOR) && value instanceof RGB)
			jrElement.setMercuryColor(Colors.getAWT4SWTRGBColor((RGB) value));
		else if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." + JRDesignValueDisplay.PROPERTY_COLOR) //$NON-NLS-1$
				&& value instanceof RGB) {
			JRDesignValueDisplay jrDesignValueDisplay = new JRDesignValueDisplay(jrElement.getValueDisplay(),
					jrElement.getChart());
			jrDesignValueDisplay.setColor(Colors.getAWT4SWTRGBColor((RGB) value));
			jrElement.setValueDisplay(jrDesignValueDisplay);

		}

		else if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_DISPLAY + "." + JRDesignValueDisplay.PROPERTY_MASK)) { //$NON-NLS-1$
			JRDesignValueDisplay jrDesignValueDisplay = new JRDesignValueDisplay(jrElement.getValueDisplay(),
					jrElement.getChart());
			jrDesignValueDisplay.setMask((String) value);
			jrElement.setValueDisplay(jrDesignValueDisplay);
		} else if (id.equals(JRDesignThermometerPlot.PROPERTY_VALUE_LOCATION))
			jrElement
					.setValueLocation((ValueLocationEnum) EnumHelper.getSetValue(ValueLocationEnum.values(), value, 0, false));

		else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION))) {
			if (value instanceof MExpression) {
				drhAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) drhAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getDataRange()).setHighExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_DATA_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION))) {
			if (value instanceof MExpression) {
				drlAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) drlAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getDataRange()).setLowExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION))) {
			if (value instanceof MExpression) {
				hrhAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) hrhAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getHighRange()).setHighExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_HIGH_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION))) {
			if (value instanceof MExpression) {
				hrlAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) hrlAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getHighRange()).setLowExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION))) {
			if (value instanceof MExpression) {
				lrhAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) lrhAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getLowRange()).setHighExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_LOW_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION))) {
			if (value instanceof MExpression) {
				lrlAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) lrlAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getLowRange()).setLowExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_HIGH_EXPRESSION))) {
			if (value instanceof MExpression) {
				mrhAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mrhAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getMediumRange()).setHighExpression(expression);
			}
		} else if (id.equals(id.equals(JRDesignThermometerPlot.PROPERTY_MEDIUM_RANGE + "." //$NON-NLS-1$
				+ JRDesignDataRange.PROPERTY_LOW_EXPRESSION))) {
			if (value instanceof MExpression) {
				mrlAnchorExpression = (MExpression) value;
				JRExpression expression = (JRExpression) mrlAnchorExpression.getValue();
				((JRDesignDataRange) jrElement.getMediumRange()).setLowExpression(expression);
			}
		} else
			super.setPropertyValue(id, value);
	}
}
