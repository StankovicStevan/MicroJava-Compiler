// generated with ast extension for cup
// version 0.8
// 29/5/2021 2:52:51


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Unmatched Unmatched);
    public void visit(Mulop Mulop);
    public void visit(Matched Matched);
    public void visit(Relop Relop);
    public void visit(Assignop Assignop);
    public void visit(FormalParamDecl FormalParamDecl);
    public void visit(StatementList StatementList);
    public void visit(Addop Addop);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(ConstList ConstList);
    public void visit(DeclList DeclList);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(VarDeclIdent VarDeclIdent);
    public void visit(ActParsList ActParsList);
    public void visit(ActualParamList ActualParamList);
    public void visit(CondExpr CondExpr);
    public void visit(ExprList ExprList);
    public void visit(ExtendsType ExtendsType);
    public void visit(MethodDeclListBracket MethodDeclListBracket);
    public void visit(VarDeclList VarDeclList);
    public void visit(FormalParamList FormalParamList);
    public void visit(Expr Expr);
    public void visit(Case Case);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(DeclLists DeclLists);
    public void visit(Statement Statement);
    public void visit(VarDeclListHelp VarDeclListHelp);
    public void visit(ConstDecl ConstDecl);
    public void visit(CondFact CondFact);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(FormPars FormPars);
    public void visit(AddopTermList AddopTermList);
    public void visit(Modop Modop);
    public void visit(Divop Divop);
    public void visit(Multiplyop Multiplyop);
    public void visit(SubopMinus SubopMinus);
    public void visit(AddopPlus AddopPlus);
    public void visit(Lesseqop Lesseqop);
    public void visit(Lessop Lessop);
    public void visit(Grteqop Grteqop);
    public void visit(Grtop Grtop);
    public void visit(Differop Differop);
    public void visit(Equalsop Equalsop);
    public void visit(Equalop Equalop);
    public void visit(DesignatorName DesignatorName);
    public void visit(DesignatorMulti DesignatorMulti);
    public void visit(DesignatorSingle DesignatorSingle);
    public void visit(NoCase NoCase);
    public void visit(CaseStmt CaseStmt);
    public void visit(ExprFactor ExprFactor);
    public void visit(NewType NewType);
    public void visit(BoolConstF BoolConstF);
    public void visit(CharConstF CharConstF);
    public void visit(NumConstF NumConstF);
    public void visit(NoDesignatorAct NoDesignatorAct);
    public void visit(DesignatorAct DesignatorAct);
    public void visit(TermStmtOnly TermStmtOnly);
    public void visit(TermStmt TermStmt);
    public void visit(AddopTermListTerm AddopTermListTerm);
    public void visit(AddopTermListStmt AddopTermListStmt);
    public void visit(TermExpStmt TermExpStmt);
    public void visit(ExprMinusStmt ExprMinusStmt);
    public void visit(CondFactExprRelExprStmt CondFactExprRelExprStmt);
    public void visit(CondFactExprStmt CondFactExprStmt);
    public void visit(CondTermAnd CondTermAnd);
    public void visit(CondTermFactStmt CondTermFactStmt);
    public void visit(ConditionoR ConditionoR);
    public void visit(ConditionTermStmt ConditionTermStmt);
    public void visit(Condition Condition);
    public void visit(ActualParam ActualParam);
    public void visit(ActualParams ActualParams);
    public void visit(NoActuals NoActuals);
    public void visit(Actuals Actuals);
    public void visit(Dec Dec);
    public void visit(Inc Inc);
    public void visit(ActPars ActPars);
    public void visit(AssignopExpr AssignopExpr);
    public void visit(Else Else);
    public void visit(StatementListLR StatementListLR);
    public void visit(NoNumPrint NoNumPrint);
    public void visit(Print Print);
    public void visit(Read Read);
    public void visit(NoRetun NoRetun);
    public void visit(Return Return);
    public void visit(Continue Continue);
    public void visit(Break Break);
    public void visit(Switch Switch);
    public void visit(YIELD YIELD);
    public void visit(DoWhile DoWhile);
    public void visit(IfCond IfCond);
    public void visit(ErrorStmt ErrorStmt);
    public void visit(DesignatorStmt DesignatorStmt);
    public void visit(UnmatchedIfElse UnmatchedIfElse);
    public void visit(UnmatchedIf UnmatchedIf);
    public void visit(UnmachedStmt UnmachedStmt);
    public void visit(MatchedStmt MatchedStmt);
    public void visit(NoStmt NoStmt);
    public void visit(Statements Statements);
    public void visit(FormalParamDeclStmt2 FormalParamDeclStmt2);
    public void visit(FormalParamDeclStmt FormalParamDeclStmt);
    public void visit(SingleFormalParamDecl SingleFormalParamDecl);
    public void visit(FormalParamDecls FormalParamDecls);
    public void visit(NoFormParam NoFormParam);
    public void visit(FormParams FormParams);
    public void visit(VoidMethodTypeName VoidMethodTypeName);
    public void visit(WithMethodTypeName WithMethodTypeName);
    public void visit(MethodName MethodName);
    public void visit(MethodDecl MethodDecl);
    public void visit(NoMethodDecl NoMethodDecl);
    public void visit(MethodDeclarations MethodDeclarations);
    public void visit(NoMethodDeclListBracket NoMethodDeclListBracket);
    public void visit(MethodDeclListBracketStmt MethodDeclListBracketStmt);
    public void visit(NoVarDeclListHelpStmt NoVarDeclListHelpStmt);
    public void visit(VarDeclListHelpStmt VarDeclListHelpStmt);
    public void visit(NoExtendsType NoExtendsType);
    public void visit(ExtendsTypeStmt ExtendsTypeStmt);
    public void visit(ClassDeclList ClassDeclList);
    public void visit(ErrorVarStmt ErrorVarStmt);
    public void visit(VarDeclIdentStmt2 VarDeclIdentStmt2);
    public void visit(VarDeclIdentStmt VarDeclIdentStmt);
    public void visit(VarDeclSingle VarDeclSingle);
    public void visit(VarDeclMulti VarDeclMulti);
    public void visit(VarDecl VarDecl);
    public void visit(NoConstDecl NoConstDecl);
    public void visit(ConstDeclStmt ConstDeclStmt);
    public void visit(BoolConst BoolConst);
    public void visit(CharConst CharConst);
    public void visit(NumConst NumConst);
    public void visit(Type Type);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(ClassDeclListD ClassDeclListD);
    public void visit(VarDeclListD VarDeclListD);
    public void visit(ConstDeclListD ConstDeclListD);
    public void visit(NoDeclLists NoDeclLists);
    public void visit(DeclListsStmt DeclListsStmt);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}