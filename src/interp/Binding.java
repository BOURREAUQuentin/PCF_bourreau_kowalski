package interp;

import java.util.Optional;

public class Binding extends Env {
    private final String id;
    private final Value value;
    private final Env previous;

    public Binding(String id, Value value, Env previous) {
        this.id = id;
        this.value = value;
        this.previous = previous;
    }

    @Override
    public Env add(String id, Value v) {
        return new Binding(id, v, this);
    }

    @Override
    public Optional<Value> lookup(String name) {
        if (name.equals(this.id)) {
            return Optional.of(this.value);
        }
        return previous.lookup(name);
    }
}