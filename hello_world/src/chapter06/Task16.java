package chapter06;

public class Task16 {
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        return true;
    }

    void pet() {
        // pet at your own risk
    }

    void groom() {
        // lather, rinse, repeat
    }
}
