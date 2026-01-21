package ast;

public class Cond extends Term {
    public Term test, branchTrue, branchFalse ;

    public Cond(Term test, Term branchTrue, Term branchFalse) {
        this.test = test;
        this.branchTrue = branchTrue;
        this.branchFalse = branchFalse;
    }
}
