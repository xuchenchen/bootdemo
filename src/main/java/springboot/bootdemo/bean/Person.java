package springboot.bootdemo.bean;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1983614078639990758L;
    public static int wight=15;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getWight() {
        return wight;
    }

    public static void setWight(int wight) {
        Person.wight = wight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + "\"weight==" +wight+
                '}';
    }
}
