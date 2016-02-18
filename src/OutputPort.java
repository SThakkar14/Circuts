/**
 * Created by Shubham on 2/17/2016.
 */
public class OutputPort extends Gate {

    public OutputPort(Gate gate) {
        inputs[0] = gate;
    }

    @Override
    public int getNumInputs() {
        return 1;
    }

    @Override
    public boolean evaluate() {
        return inputs[0].evaluate();
    }

    @Override
    public String toString() {
        return "OutputPort";
    }
}
