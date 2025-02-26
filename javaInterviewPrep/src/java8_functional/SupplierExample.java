package java8_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println(s);
        String[] s={"srikanth","samantha","aparna"};
        for (String v:s){
            c.accept(v);
        }
    }
}
