interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            return true;
        }
        return false;
    }

    @Override
    public void groom() {}

    @Override
    public void pet() {}
}
