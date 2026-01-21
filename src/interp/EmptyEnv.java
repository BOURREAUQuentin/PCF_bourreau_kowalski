package interp;

import java.util.Optional;

public class EmptyEnv extends Env {

    @Override
    public Env add(String id, Value v) {
        return new Binding(id, v, this);
    }

    @Override
    public Optional<Value> lookup(String id) {
        return Optional.empty();
    }
}