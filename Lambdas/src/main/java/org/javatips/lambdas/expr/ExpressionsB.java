package org.javatips.lambdas.expr;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface IPiValue {
    double getPiValue();
}

public class ExpressionsB {
    public static void main( String[] args ) {
        IPiValue ref;
        ref = () -> 3.1415;
        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}
