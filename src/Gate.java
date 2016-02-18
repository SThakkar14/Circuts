import java.util.HashSet;

/**
 * Created by Shubham on 2/17/2016.
 */
public abstract class Gate {

    public static HashSet<Gate> hashSet = new HashSet<>();
    public static HashSet<Gate> sourceHashSet = new HashSet<>();

    Gate[] inputs;

    public Gate(Gate... gates) {
        inputs = new Gate[getNumInputs()];

        if (gates.length > getNumInputs()) {
            throw new IllegalArgumentException();
        }

        this.getInputFrom(gates);

        hashSet.add(this);
        sourceHashSet.add(this);
    }

    public static String evaluateCircuit() {
        StringBuilder sb = new StringBuilder();
        for (Gate gate : sourceHashSet) {
            sb.append(gate).append(": ").append(gate.evaluate()).append("\n");
        }
        return sb.toString();
    }

    public static boolean circuitIsValid() {
        for (Gate gate : hashSet) {
            if (!gate.isValid()) {
                return false;
            }
        }
        return true;
    }

    public abstract int getNumInputs();

    public abstract boolean evaluate();

    public void getInputFrom(Gate... gates) {

        if (gates.length > getNumInputs()) {
            throw new IllegalArgumentException();
        }

        for (Gate gate : gates) {
            boolean done = false;
            for (int i = 0; i < inputs.length && !done; i++) {
                if (inputs[i] == null) {
                    if (sourceHashSet.contains(gate)) {
                        sourceHashSet.remove(gate);
                    }
                    inputs[i] = gate;
                    done = true;
                }
            }
            if (!done) {
                throw new IllegalArgumentException();
            }
        }
    }

    public boolean isValid() {
        for (Gate gate : inputs) {
            if (gate == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public abstract String toString();
}
