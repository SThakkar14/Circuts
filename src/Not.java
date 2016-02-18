/**
 * Created by Shubham on 2/17/2016.
 */
public class Not extends Gate {

    public Not(Gate... gate) {
        super(gate);
    }

    @Override
    public int getNumInputs() {
        return 1;
    }

    @Override
    public boolean evaluate() {
        return !inputs[0].evaluate();
    }

    @Override
    public String toString() {
        return "Not";
    }
}
