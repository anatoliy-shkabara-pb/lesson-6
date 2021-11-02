package s04reflection;

import s01inheritance.Computer;
import s01inheritance.Notebook;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Notebook nb = new Notebook();
        Class clazz = nb.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        Class compClazz = Class.forName("s01inheritance.Computer");
        //Class cl = Notebook.class;

        // создание объекта через рефлексию
        Constructor constr = compClazz.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Asus");
        if (obj instanceof Computer) {
            ((Computer) obj).on();
        }
    }
}
