/*
* generated by Xtext
*/
package com.jaspersoft.studio.data.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.jaspersoft.studio.data.services.SqlGrammarAccess;

public class SqlParser extends AbstractContentAssistParser {
	
	@Inject
	private SqlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.jaspersoft.studio.data.ui.contentassist.antlr.internal.InternalSqlParser createParser() {
		com.jaspersoft.studio.data.ui.contentassist.antlr.internal.InternalSqlParser result = new com.jaspersoft.studio.data.ui.contentassist.antlr.internal.InternalSqlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSelectSubSetAccess().getOpAlternatives_0_0(), "rule__SelectSubSet__OpAlternatives_0_0");
					put(grammarAccess.getColumnOrAliasAccess().getAlternatives(), "rule__ColumnOrAlias__Alternatives");
					put(grammarAccess.getTableOrAliasAccess().getAlternatives_0(), "rule__TableOrAlias__Alternatives_0");
					put(grammarAccess.getOrderByColumnFullAccess().getDirectionAlternatives_1_0(), "rule__OrderByColumnFull__DirectionAlternatives_1_0");
					put(grammarAccess.getExpressionFragmentSecondAccess().getCAlternatives_0_0(), "rule__ExpressionFragmentSecond__CAlternatives_0_0");
					put(grammarAccess.getExpressionFragmentAccess().getAlternatives(), "rule__ExpressionFragment__Alternatives");
					put(grammarAccess.getExpressionFragmentAccess().getXexpAlternatives_2_0(), "rule__ExpressionFragment__XexpAlternatives_2_0");
					put(grammarAccess.getExpressionAccess().getAlternatives_1(), "rule__Expression__Alternatives_1");
					put(grammarAccess.getExpressionAccess().getIsnullAlternatives_1_0_0(), "rule__Expression__IsnullAlternatives_1_0_0");
					put(grammarAccess.getComparisonAccess().getOperatorAlternatives_0_0(), "rule__Comparison__OperatorAlternatives_0_0");
					put(grammarAccess.getComparisonAccess().getSubOperatorAlternatives_1_0(), "rule__Comparison__SubOperatorAlternatives_1_0");
					put(grammarAccess.getLikeAccess().getOpLikeAlternatives_0_0(), "rule__Like__OpLikeAlternatives_0_0");
					put(grammarAccess.getLikeOperandAccess().getAlternatives(), "rule__LikeOperand__Alternatives");
					put(grammarAccess.getBetweenAccess().getOpBetweenAlternatives_0_0(), "rule__Between__OpBetweenAlternatives_0_0");
					put(grammarAccess.getInOperatorAccess().getOpAlternatives_1_0(), "rule__InOperator__OpAlternatives_1_0");
					put(grammarAccess.getInOperatorAccess().getAlternatives_3(), "rule__InOperator__Alternatives_3");
					put(grammarAccess.getOperandAccess().getAlternatives_1_0(), "rule__Operand__Alternatives_1_0");
					put(grammarAccess.getOperandFragmentAccess().getAlternatives(), "rule__OperandFragment__Alternatives");
					put(grammarAccess.getOperandFunctionAccess().getAlternatives_2(), "rule__OperandFunction__Alternatives_2");
					put(grammarAccess.getOpFunctionArgOperandAccess().getOpAlternatives_0(), "rule__OpFunctionArgOperand__OpAlternatives_0");
					put(grammarAccess.getOpFunctionArgAgregateAccess().getAlternatives_0(), "rule__OpFunctionArgAgregate__Alternatives_0");
					put(grammarAccess.getXOperandFragmentAccess().getAlternatives(), "rule__XOperandFragment__Alternatives");
					put(grammarAccess.getScalarOperandAccess().getAlternatives(), "rule__ScalarOperand__Alternatives");
					put(grammarAccess.getJoinTypeAccess().getAlternatives_1(), "rule__JoinType__Alternatives_1");
					put(grammarAccess.getJoinTypeAccess().getAlternatives_1_1_0(), "rule__JoinType__Alternatives_1_1_0");
					put(grammarAccess.getDBIDAccess().getAlternatives(), "rule__DBID__Alternatives");
					put(grammarAccess.getXFunctionAccess().getAlternatives(), "rule__XFunction__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getSelectQueryAccess().getGroup(), "rule__SelectQuery__Group__0");
					put(grammarAccess.getSelectSubSetAccess().getGroup(), "rule__SelectSubSet__Group__0");
					put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
					put(grammarAccess.getSelectAccess().getGroup_5(), "rule__Select__Group_5__0");
					put(grammarAccess.getSelectAccess().getGroup_6(), "rule__Select__Group_6__0");
					put(grammarAccess.getSelectAccess().getGroup_7(), "rule__Select__Group_7__0");
					put(grammarAccess.getColumnsAccess().getGroup(), "rule__Columns__Group__0");
					put(grammarAccess.getColumnsAccess().getGroup_1(), "rule__Columns__Group_1__0");
					put(grammarAccess.getColumnsAccess().getGroup_1_1(), "rule__Columns__Group_1_1__0");
					put(grammarAccess.getColumnOrAliasAccess().getGroup_0(), "rule__ColumnOrAlias__Group_0__0");
					put(grammarAccess.getColumnFullAccess().getGroup(), "rule__ColumnFull__Group__0");
					put(grammarAccess.getColumnFullAccess().getGroup_1(), "rule__ColumnFull__Group_1__0");
					put(grammarAccess.getColumnFullAccess().getGroup_1_1(), "rule__ColumnFull__Group_1_1__0");
					put(grammarAccess.getTablesAccess().getGroup(), "rule__Tables__Group__0");
					put(grammarAccess.getTablesAccess().getGroup_1(), "rule__Tables__Group_1__0");
					put(grammarAccess.getTablesAccess().getGroup_1_1(), "rule__Tables__Group_1_1__0");
					put(grammarAccess.getFromTableAccess().getGroup(), "rule__FromTable__Group__0");
					put(grammarAccess.getFromTableJoinAccess().getGroup(), "rule__FromTableJoin__Group__0");
					put(grammarAccess.getTableOrAliasAccess().getGroup(), "rule__TableOrAlias__Group__0");
					put(grammarAccess.getTableFullAccess().getGroup(), "rule__TableFull__Group__0");
					put(grammarAccess.getTableFullAccess().getGroup_1(), "rule__TableFull__Group_1__0");
					put(grammarAccess.getTableFullAccess().getGroup_1_1(), "rule__TableFull__Group_1_1__0");
					put(grammarAccess.getDbObjectNameAllAccess().getGroup(), "rule__DbObjectNameAll__Group__0");
					put(grammarAccess.getOrderByColumnsAccess().getGroup(), "rule__OrderByColumns__Group__0");
					put(grammarAccess.getOrderByColumnsAccess().getGroup_1(), "rule__OrderByColumns__Group_1__0");
					put(grammarAccess.getOrderByColumnsAccess().getGroup_1_1(), "rule__OrderByColumns__Group_1_1__0");
					put(grammarAccess.getOrderByColumnFullAccess().getGroup(), "rule__OrderByColumnFull__Group__0");
					put(grammarAccess.getGroupByColumnsAccess().getGroup(), "rule__GroupByColumns__Group__0");
					put(grammarAccess.getGroupByColumnsAccess().getGroup_1(), "rule__GroupByColumns__Group_1__0");
					put(grammarAccess.getGroupByColumnsAccess().getGroup_1_1(), "rule__GroupByColumns__Group_1_1__0");
					put(grammarAccess.getFullExpressionAccess().getGroup(), "rule__FullExpression__Group__0");
					put(grammarAccess.getFullExpressionAccess().getGroup_1(), "rule__FullExpression__Group_1__0");
					put(grammarAccess.getExpressionFragmentSecondAccess().getGroup(), "rule__ExpressionFragmentSecond__Group__0");
					put(grammarAccess.getExpressionGroupAccess().getGroup(), "rule__ExpressionGroup__Group__0");
					put(grammarAccess.getXExpressionAccess().getGroup(), "rule__XExpression__Group__0");
					put(grammarAccess.getXExpressionAccess().getGroup_6(), "rule__XExpression__Group_6__0");
					put(grammarAccess.getXExpression_Access().getGroup(), "rule__XExpression___Group__0");
					put(grammarAccess.getXExpression_Access().getGroup_6(), "rule__XExpression___Group_6__0");
					put(grammarAccess.getXExpressionParamsAccess().getGroup(), "rule__XExpressionParams__Group__0");
					put(grammarAccess.getXExpressionParamsAccess().getGroup_1(), "rule__XExpressionParams__Group_1__0");
					put(grammarAccess.getXExpressionParamsAccess().getGroup_1_1(), "rule__XExpressionParams__Group_1_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getLikeAccess().getGroup(), "rule__Like__Group__0");
					put(grammarAccess.getBetweenAccess().getGroup(), "rule__Between__Group__0");
					put(grammarAccess.getInOperatorAccess().getGroup(), "rule__InOperator__Group__0");
					put(grammarAccess.getOperandListAccess().getGroup(), "rule__OperandList__Group__0");
					put(grammarAccess.getOperandListAccess().getGroup_1(), "rule__OperandList__Group_1__0");
					put(grammarAccess.getOperandListAccess().getGroup_1_1(), "rule__OperandList__Group_1_1__0");
					put(grammarAccess.getOperandAccess().getGroup(), "rule__Operand__Group__0");
					put(grammarAccess.getOperandAccess().getGroup_1(), "rule__Operand__Group_1__0");
					put(grammarAccess.getOperandAccess().getGroup_1_0_0(), "rule__Operand__Group_1_0_0__0");
					put(grammarAccess.getOperandAccess().getGroup_1_0_1(), "rule__Operand__Group_1_0_1__0");
					put(grammarAccess.getOperandAccess().getGroup_1_0_2(), "rule__Operand__Group_1_0_2__0");
					put(grammarAccess.getOperandAccess().getGroup_1_0_3(), "rule__Operand__Group_1_0_3__0");
					put(grammarAccess.getOperandAccess().getGroup_1_0_4(), "rule__Operand__Group_1_0_4__0");
					put(grammarAccess.getOperandFunctionAccess().getGroup(), "rule__OperandFunction__Group__0");
					put(grammarAccess.getOpFunctionArgAccess().getGroup(), "rule__OpFunctionArg__Group__0");
					put(grammarAccess.getOpFunctionArgAccess().getGroup_1(), "rule__OpFunctionArg__Group_1__0");
					put(grammarAccess.getOpFunctionArgAccess().getGroup_1_1(), "rule__OpFunctionArg__Group_1_1__0");
					put(grammarAccess.getOpFunctionCastAccess().getGroup(), "rule__OpFunctionCast__Group__0");
					put(grammarAccess.getOpFunctionCastAccess().getGroup_4(), "rule__OpFunctionCast__Group_4__0");
					put(grammarAccess.getOpFunctionCastAccess().getGroup_4_2(), "rule__OpFunctionCast__Group_4_2__0");
					put(grammarAccess.getOpFunctionArgAgregateAccess().getGroup(), "rule__OpFunctionArgAgregate__Group__0");
					put(grammarAccess.getSubQueryOperandAccess().getGroup(), "rule__SubQueryOperand__Group__0");
					put(grammarAccess.getSQLCASEAccess().getGroup(), "rule__SQLCASE__Group__0");
					put(grammarAccess.getSQLCaseWhensAccess().getGroup(), "rule__SQLCaseWhens__Group__0");
					put(grammarAccess.getSQLCaseWhensAccess().getGroup_1(), "rule__SQLCaseWhens__Group_1__0");
					put(grammarAccess.getSqlCaseWhenAccess().getGroup(), "rule__SqlCaseWhen__Group__0");
					put(grammarAccess.getSqlCaseWhenAccess().getGroup_4(), "rule__SqlCaseWhen__Group_4__0");
					put(grammarAccess.getJoinTypeAccess().getGroup(), "rule__JoinType__Group__0");
					put(grammarAccess.getJoinTypeAccess().getGroup_1_1(), "rule__JoinType__Group_1_1__0");
					put(grammarAccess.getFNAMEAccess().getGroup(), "rule__FNAME__Group__0");
					put(grammarAccess.getModelAccess().getQueryAssignment_0(), "rule__Model__QueryAssignment_0");
					put(grammarAccess.getModelAccess().getOrderByEntryAssignment_1_1(), "rule__Model__OrderByEntryAssignment_1_1");
					put(grammarAccess.getSelectQueryAccess().getOpAssignment_1(), "rule__SelectQuery__OpAssignment_1");
					put(grammarAccess.getSelectSubSetAccess().getOpAssignment_0(), "rule__SelectSubSet__OpAssignment_0");
					put(grammarAccess.getSelectSubSetAccess().getAllAssignment_1(), "rule__SelectSubSet__AllAssignment_1");
					put(grammarAccess.getSelectSubSetAccess().getQueryAssignment_2(), "rule__SelectSubSet__QueryAssignment_2");
					put(grammarAccess.getSelectAccess().getSelectAssignment_0(), "rule__Select__SelectAssignment_0");
					put(grammarAccess.getSelectAccess().getColsAssignment_2(), "rule__Select__ColsAssignment_2");
					put(grammarAccess.getSelectAccess().getTblAssignment_4(), "rule__Select__TblAssignment_4");
					put(grammarAccess.getSelectAccess().getWhereExpressionAssignment_5_1(), "rule__Select__WhereExpressionAssignment_5_1");
					put(grammarAccess.getSelectAccess().getGroupByEntryAssignment_6_1(), "rule__Select__GroupByEntryAssignment_6_1");
					put(grammarAccess.getSelectAccess().getHavingEntryAssignment_7_1(), "rule__Select__HavingEntryAssignment_7_1");
					put(grammarAccess.getColumnsAccess().getEntriesAssignment_1_1_1(), "rule__Columns__EntriesAssignment_1_1_1");
					put(grammarAccess.getColumnOrAliasAccess().getCeAssignment_0_0(), "rule__ColumnOrAlias__CeAssignment_0_0");
					put(grammarAccess.getColumnOrAliasAccess().getAliasAssignment_0_1(), "rule__ColumnOrAlias__AliasAssignment_0_1");
					put(grammarAccess.getColumnOrAliasAccess().getColAliasAssignment_0_2(), "rule__ColumnOrAlias__ColAliasAssignment_0_2");
					put(grammarAccess.getColumnOrAliasAccess().getAllColsAssignment_1(), "rule__ColumnOrAlias__AllColsAssignment_1");
					put(grammarAccess.getColumnOrAliasAccess().getDbAllColsAssignment_2(), "rule__ColumnOrAlias__DbAllColsAssignment_2");
					put(grammarAccess.getColumnFullAccess().getEntriesAssignment_1_1_1(), "rule__ColumnFull__EntriesAssignment_1_1_1");
					put(grammarAccess.getTablesAccess().getEntriesAssignment_1_1_1(), "rule__Tables__EntriesAssignment_1_1_1");
					put(grammarAccess.getFromTableAccess().getTableAssignment_0(), "rule__FromTable__TableAssignment_0");
					put(grammarAccess.getFromTableAccess().getFjoinAssignment_1(), "rule__FromTable__FjoinAssignment_1");
					put(grammarAccess.getFromTableJoinAccess().getJoinAssignment_0(), "rule__FromTableJoin__JoinAssignment_0");
					put(grammarAccess.getFromTableJoinAccess().getOnTableAssignment_1(), "rule__FromTableJoin__OnTableAssignment_1");
					put(grammarAccess.getFromTableJoinAccess().getJoinExprAssignment_3(), "rule__FromTableJoin__JoinExprAssignment_3");
					put(grammarAccess.getTableOrAliasAccess().getTfullAssignment_0_0(), "rule__TableOrAlias__TfullAssignment_0_0");
					put(grammarAccess.getTableOrAliasAccess().getSqAssignment_0_1(), "rule__TableOrAlias__SqAssignment_0_1");
					put(grammarAccess.getTableOrAliasAccess().getAliasAssignment_1(), "rule__TableOrAlias__AliasAssignment_1");
					put(grammarAccess.getTableOrAliasAccess().getTblAliasAssignment_2(), "rule__TableOrAlias__TblAliasAssignment_2");
					put(grammarAccess.getTableFullAccess().getEntriesAssignment_1_1_1(), "rule__TableFull__EntriesAssignment_1_1_1");
					put(grammarAccess.getDbObjectNameAllAccess().getDbnameAssignment_0(), "rule__DbObjectNameAll__DbnameAssignment_0");
					put(grammarAccess.getDbObjectNameAccess().getDbnameAssignment(), "rule__DbObjectName__DbnameAssignment");
					put(grammarAccess.getOrderByColumnsAccess().getEntriesAssignment_1_1_1(), "rule__OrderByColumns__EntriesAssignment_1_1_1");
					put(grammarAccess.getOrderByColumnFullAccess().getColOrderAssignment_0(), "rule__OrderByColumnFull__ColOrderAssignment_0");
					put(grammarAccess.getOrderByColumnFullAccess().getDirectionAssignment_1(), "rule__OrderByColumnFull__DirectionAssignment_1");
					put(grammarAccess.getGroupByColumnsAccess().getEntriesAssignment_1_1_1(), "rule__GroupByColumns__EntriesAssignment_1_1_1");
					put(grammarAccess.getGroupByColumnFullAccess().getColGrByAssignment(), "rule__GroupByColumnFull__ColGrByAssignment");
					put(grammarAccess.getFullExpressionAccess().getEntriesAssignment_1_1(), "rule__FullExpression__EntriesAssignment_1_1");
					put(grammarAccess.getExpressionFragmentSecondAccess().getCAssignment_0(), "rule__ExpressionFragmentSecond__CAssignment_0");
					put(grammarAccess.getExpressionFragmentSecondAccess().getEfragAssignment_1(), "rule__ExpressionFragmentSecond__EfragAssignment_1");
					put(grammarAccess.getExpressionFragmentAccess().getExpgroupAssignment_0(), "rule__ExpressionFragment__ExpgroupAssignment_0");
					put(grammarAccess.getExpressionFragmentAccess().getExpAssignment_1(), "rule__ExpressionFragment__ExpAssignment_1");
					put(grammarAccess.getExpressionFragmentAccess().getXexpAssignment_2(), "rule__ExpressionFragment__XexpAssignment_2");
					put(grammarAccess.getExpressionGroupAccess().getExprAssignment_2(), "rule__ExpressionGroup__ExprAssignment_2");
					put(grammarAccess.getXExpressionAccess().getXfAssignment_3(), "rule__XExpression__XfAssignment_3");
					put(grammarAccess.getXExpressionAccess().getColAssignment_5(), "rule__XExpression__ColAssignment_5");
					put(grammarAccess.getXExpressionAccess().getPrmAssignment_6_1(), "rule__XExpression__PrmAssignment_6_1");
					put(grammarAccess.getXExpression_Access().getXfAssignment_3(), "rule__XExpression___XfAssignment_3");
					put(grammarAccess.getXExpression_Access().getColAssignment_5(), "rule__XExpression___ColAssignment_5");
					put(grammarAccess.getXExpression_Access().getPrmAssignment_6_1(), "rule__XExpression___PrmAssignment_6_1");
					put(grammarAccess.getXExpressionParamsAccess().getEntriesAssignment_1_1_1(), "rule__XExpressionParams__EntriesAssignment_1_1_1");
					put(grammarAccess.getJRParameterAccess().getJrprmAssignment(), "rule__JRParameter__JrprmAssignment");
					put(grammarAccess.getExpressionAccess().getOp1Assignment_0(), "rule__Expression__Op1Assignment_0");
					put(grammarAccess.getExpressionAccess().getIsnullAssignment_1_0(), "rule__Expression__IsnullAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getInAssignment_1_1(), "rule__Expression__InAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getBetweenAssignment_1_2(), "rule__Expression__BetweenAssignment_1_2");
					put(grammarAccess.getExpressionAccess().getLikeAssignment_1_3(), "rule__Expression__LikeAssignment_1_3");
					put(grammarAccess.getExpressionAccess().getCompAssignment_1_4(), "rule__Expression__CompAssignment_1_4");
					put(grammarAccess.getComparisonAccess().getOperatorAssignment_0(), "rule__Comparison__OperatorAssignment_0");
					put(grammarAccess.getComparisonAccess().getSubOperatorAssignment_1(), "rule__Comparison__SubOperatorAssignment_1");
					put(grammarAccess.getComparisonAccess().getOp2Assignment_2(), "rule__Comparison__Op2Assignment_2");
					put(grammarAccess.getLikeAccess().getOpLikeAssignment_0(), "rule__Like__OpLikeAssignment_0");
					put(grammarAccess.getLikeAccess().getOp2Assignment_1(), "rule__Like__Op2Assignment_1");
					put(grammarAccess.getLikeOperandAccess().getOp2Assignment_0(), "rule__LikeOperand__Op2Assignment_0");
					put(grammarAccess.getLikeOperandAccess().getFop2Assignment_1(), "rule__LikeOperand__Fop2Assignment_1");
					put(grammarAccess.getLikeOperandAccess().getFcastAssignment_2(), "rule__LikeOperand__FcastAssignment_2");
					put(grammarAccess.getBetweenAccess().getOpBetweenAssignment_0(), "rule__Between__OpBetweenAssignment_0");
					put(grammarAccess.getBetweenAccess().getOp2Assignment_1(), "rule__Between__Op2Assignment_1");
					put(grammarAccess.getBetweenAccess().getOp3Assignment_3(), "rule__Between__Op3Assignment_3");
					put(grammarAccess.getInOperatorAccess().getOpAssignment_1(), "rule__InOperator__OpAssignment_1");
					put(grammarAccess.getInOperatorAccess().getSubqueryAssignment_3_0(), "rule__InOperator__SubqueryAssignment_3_0");
					put(grammarAccess.getInOperatorAccess().getOpListAssignment_3_1(), "rule__InOperator__OpListAssignment_3_1");
					put(grammarAccess.getOperandListAccess().getEntriesAssignment_1_1_1(), "rule__OperandList__EntriesAssignment_1_1_1");
					put(grammarAccess.getOperandAccess().getOp1Assignment_0(), "rule__Operand__Op1Assignment_0");
					put(grammarAccess.getOperandAccess().getRightAssignment_1_1(), "rule__Operand__RightAssignment_1_1");
					put(grammarAccess.getOperandFragmentAccess().getColumnAssignment_0(), "rule__OperandFragment__ColumnAssignment_0");
					put(grammarAccess.getOperandFragmentAccess().getXopAssignment_1(), "rule__OperandFragment__XopAssignment_1");
					put(grammarAccess.getOperandFragmentAccess().getSubqAssignment_2(), "rule__OperandFragment__SubqAssignment_2");
					put(grammarAccess.getOperandFragmentAccess().getFcastAssignment_3(), "rule__OperandFragment__FcastAssignment_3");
					put(grammarAccess.getOperandFragmentAccess().getFuncAssignment_4(), "rule__OperandFragment__FuncAssignment_4");
					put(grammarAccess.getOperandFragmentAccess().getSqlcaseAssignment_5(), "rule__OperandFragment__SqlcaseAssignment_5");
					put(grammarAccess.getOperandFunctionAccess().getFnameAssignment_1(), "rule__OperandFunction__FnameAssignment_1");
					put(grammarAccess.getOperandFunctionAccess().getArgsAssignment_2_1(), "rule__OperandFunction__ArgsAssignment_2_1");
					put(grammarAccess.getOpFunctionArgAccess().getEntriesAssignment_1_1_1(), "rule__OpFunctionArg__EntriesAssignment_1_1_1");
					put(grammarAccess.getOpFunctionArgOperandAccess().getOpAssignment(), "rule__OpFunctionArgOperand__OpAssignment");
					put(grammarAccess.getOpFunctionCastAccess().getOpAssignment_1(), "rule__OpFunctionCast__OpAssignment_1");
					put(grammarAccess.getOpFunctionCastAccess().getTypeAssignment_3(), "rule__OpFunctionCast__TypeAssignment_3");
					put(grammarAccess.getOpFunctionCastAccess().getPAssignment_4_1(), "rule__OpFunctionCast__PAssignment_4_1");
					put(grammarAccess.getOpFunctionCastAccess().getP2Assignment_4_2_1(), "rule__OpFunctionCast__P2Assignment_4_2_1");
					put(grammarAccess.getXOperandFragmentAccess().getParamAssignment_0(), "rule__XOperandFragment__ParamAssignment_0");
					put(grammarAccess.getXOperandFragmentAccess().getEparamAssignment_1(), "rule__XOperandFragment__EparamAssignment_1");
					put(grammarAccess.getXOperandFragmentAccess().getScalarAssignment_2(), "rule__XOperandFragment__ScalarAssignment_2");
					put(grammarAccess.getParameterOperandAccess().getPrmAssignment(), "rule__ParameterOperand__PrmAssignment");
					put(grammarAccess.getExclamationParameterOperandAccess().getPrmAssignment(), "rule__ExclamationParameterOperand__PrmAssignment");
					put(grammarAccess.getColumnOperandAccess().getCfullAssignment(), "rule__ColumnOperand__CfullAssignment");
					put(grammarAccess.getSubQueryOperandAccess().getSelAssignment_2(), "rule__SubQueryOperand__SelAssignment_2");
					put(grammarAccess.getScalarOperandAccess().getSointAssignment_0(), "rule__ScalarOperand__SointAssignment_0");
					put(grammarAccess.getScalarOperandAccess().getSostrAssignment_1(), "rule__ScalarOperand__SostrAssignment_1");
					put(grammarAccess.getScalarOperandAccess().getSodblAssignment_2(), "rule__ScalarOperand__SodblAssignment_2");
					put(grammarAccess.getScalarOperandAccess().getSodateAssignment_3(), "rule__ScalarOperand__SodateAssignment_3");
					put(grammarAccess.getScalarOperandAccess().getSotimeAssignment_4(), "rule__ScalarOperand__SotimeAssignment_4");
					put(grammarAccess.getScalarOperandAccess().getSodtAssignment_5(), "rule__ScalarOperand__SodtAssignment_5");
					put(grammarAccess.getSQLCASEAccess().getExprAssignment_1(), "rule__SQLCASE__ExprAssignment_1");
					put(grammarAccess.getSQLCASEAccess().getWhenAssignment_2(), "rule__SQLCASE__WhenAssignment_2");
					put(grammarAccess.getSQLCaseWhensAccess().getEntriesAssignment_1_1(), "rule__SQLCaseWhens__EntriesAssignment_1_1");
					put(grammarAccess.getSqlCaseWhenAccess().getExprAssignment_1(), "rule__SqlCaseWhen__ExprAssignment_1");
					put(grammarAccess.getSqlCaseWhenAccess().getTexpAssignment_3(), "rule__SqlCaseWhen__TexpAssignment_3");
					put(grammarAccess.getSqlCaseWhenAccess().getEexpAssignment_4_1(), "rule__SqlCaseWhen__EexpAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.jaspersoft.studio.data.ui.contentassist.antlr.internal.InternalSqlParser typedParser = (com.jaspersoft.studio.data.ui.contentassist.antlr.internal.InternalSqlParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
