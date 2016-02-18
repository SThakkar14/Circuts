/**
 * Created by Shubham on 2/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        Gate a = new InputPort(true);
        Gate b = new InputPort(false);
        Gate c = new InputPort(true);

        Gate and1 = new And(a, b);
        Gate and2 = new And(and1);
        and2.getInputFrom(c);

        Gate or1 = new Or();

        or1.getInputFrom(a, and2);

        Gate not1 = new Not(or1);

        Gate and3 = new And(a,a);

        Gate op1 = new OutputPort(and3);


        System.out.println(not1.evaluate());
        System.out.println(Gate.hashSet);
        System.out.println(Gate.sourceHashSet);
        System.out.println(or1.isValid());
        System.out.println(Gate.circuitIsValid());
        System.out.println(Gate.evaluateCircuit());
    }
}
