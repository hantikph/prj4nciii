import java.util.function.*;
public class Climb {
    int age;

    public static void main(String[] args) {
        Climb p1 = new Climb();
        p1.age = 1;
        check(p1, p -> p1.age < 5); //h1
    }
    private static void check(Climb panda, Predicate<Climb> pred) { //h2
        String result = pred.test(panda) ? "match": "not match"; //h3
        System.out.println(result);
    }
}