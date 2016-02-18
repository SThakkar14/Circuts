/**
 * Created by Shubham on 2/17/2016.
 */
public class Or extends Gate {

    public Or(Gate... gate) {
        super(gate);
    }

    @Override
    public int getNumInputs() {
        return 2;
    }

    @Override
    public boolean evaluate() {
        return inputs[0].evaluate() || inputs[1].evaluate();
    }

    @Override
    public String toString() {
        return "Or";
    }
}
