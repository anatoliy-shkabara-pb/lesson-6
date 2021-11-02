package s01inheritance;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Asus");
        //comp.setName("Asus");
        comp.on();
        //comp.charge()

        Notebook note = new Notebook();
        note.on();
        note.charge();

        // Computer comp1 = note;
        // comp1.on();

        //Computer c1 = new Notebook();


        Computer[] comps = new Computer[] {comp, note};
        System.out.println("----------------------");
        for (Computer c: comps) {
            //c.on();
            use(c);
        }
    }

    public static void use(Computer computer) {
        computer.on();
        if (computer instanceof Notebook) {
            Notebook note = (Notebook) computer;
            note.charge();
        }
        computer.load();
        computer.off();
    }
}
