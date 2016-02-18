/**
 * Created by Shubham on 2/17/2016.
 */
public class InputPort extends Gate {

    boolean value;

    public InputPort(boolean value) {
        super();
        this.value = value;
    }

    @Override
    public int getNumInputs() {
        return 0;
    }

    @Override
    public boolean evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "InputPort{" +
                "value=" + value +
                '}';
    }
}
