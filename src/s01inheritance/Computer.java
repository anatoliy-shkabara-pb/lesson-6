package s01inheritance;

public class Computer {

    private String name;
    private int hddSize;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void on() {
        System.out.println(name + " включаюсь...");
    }

    public void load() {
        System.out.println(name + " загружаюсь...");
    }

    public void off() {
        System.out.println(name + " выключаюсь...");
    }
}
