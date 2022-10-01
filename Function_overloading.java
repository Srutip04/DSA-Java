import java.util.jar.Attributes.Name;

class Student {
    String name;
    int age;

    public void info(String name) {
        System.out.println(name);
    }

    public void info(int age) {
        System.out.println(age);
    }

    public void info(String name, String age) {
        System.out.println(name + " " + age);
    }

}

public class Function_overloading {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "deepak";
        S1.age = 21;
        S1.info(S1.age);

    }

}
