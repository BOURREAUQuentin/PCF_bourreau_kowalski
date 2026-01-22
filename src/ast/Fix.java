package ast;

import interp.Env;
import interp.IceCube;
import interp.Value;

public class Fix extends Term {
    public String id;   // Le nom de la variable récursive
    public Term term;   // Le corps

    public Fix(String id, Term term) {
        this.id = id;
        this.term = term;
    }

    @Override
    public Value interp(Env e) {
        // On crée un glaçon qui capture l'environnement actuel
        return new IceCube(id, term, e);
    }

    @Override
    public String toString() {
        return "fix " + id + " " + term;
    }
}