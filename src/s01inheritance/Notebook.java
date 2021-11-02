package s01inheritance;

public class Notebook extends Computer {

    private int batteryLevel;

    public Notebook() {
        super("Notebook");
    }


    public void charge() {
        batteryLevel = 100;
        System.out.println(getName() + " заряжаюсь...");
    }

    @Override
    public void on() {
        System.out.println(getName() + " открываю экран");
        super.on();
    }
}
