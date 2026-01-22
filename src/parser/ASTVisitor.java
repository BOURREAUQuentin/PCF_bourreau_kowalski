package parser;

import ast.*;

public class ASTVisitor extends PCFBaseVisitor<AST> {

    @Override
    public AST visitLit(PCFParser.LitContext ctx) {
        return new Lit(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitVar(PCFParser.VarContext ctx) {
        return new Var(ctx.ID().getText());
    }

    @Override
    public AST visitParens(PCFParser.ParensContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public AST visitSimpleTerm(PCFParser.SimpleTermContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public AST visitSimpleExpr(PCFParser.SimpleExprContext ctx) {
        return visit(ctx.factor());
    }

    @Override
    public AST visitBinOpExpr(PCFParser.BinOpExprContext ctx) {
        OP op = OP.parseOP(ctx.OPLast().getText());
        Term t1 = (Term) visit(ctx.expr());
        Term t2 = (Term) visit(ctx.factor());
        return new BinOp(op, t1, t2);
    }

    @Override
    public AST visitSimpleFactor(PCFParser.SimpleFactorContext ctx) {
        return visit(ctx.application());
    }

    @Override
    public AST visitBinOpFactor(PCFParser.BinOpFactorContext ctx) {
        OP op = OP.parseOP(ctx.OPFirst().getText());
        Term t1 = (Term) visit(ctx.factor());
        Term t2 = (Term) visit(ctx.application());
        return new BinOp(op, t1, t2);
    }

    @Override
    public AST visitSimpleApp(PCFParser.SimpleAppContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public AST visitApp(PCFParser.AppContext ctx) {
        Term fun = (Term) visit(ctx.application());
        Term arg = (Term) visit(ctx.atom());
        return new App(fun, arg);
    }

    @Override
    public AST visitLet(PCFParser.LetContext ctx) {
        String id = ctx.ID().getText();
        Term definition = (Term) visit(ctx.term(0));
        Term body = (Term) visit(ctx.term(1));
        return new Let(id, definition, body);
    }

    @Override
    public AST visitCond(PCFParser.CondContext ctx) {
        Term test = (Term) visit(ctx.term(0));
        Term thenBranch = (Term) visit(ctx.term(1));
        Term elseBranch = (Term) visit(ctx.term(2));
        return new Cond(test, thenBranch, elseBranch);
    }

    @Override
    public AST visitFun(PCFParser.FunContext ctx) {
        String arg = ctx.ID().getText();
        Term body = (Term) visit(ctx.term());
        return new Fun(arg, body);
    }

    @Override
    public AST visitFix(PCFParser.FixContext ctx) {
        String id = ctx.ID().getText();
        Term term = (Term) visit(ctx.term());
        return new Fix(id, term);
    }
}