package ast;

import interp.Env;
import interp.IntVal;
import interp.Value;

public class Lit extends Term {
    public int value;

    public Lit(int value) {
        this.value = value;
    }

    @Override
    public Value interp(Env e) {
        // Règle : un littéral s'évalue en sa valeur entière [cite: 22]
        return new IntVal(this.value);
    }
}