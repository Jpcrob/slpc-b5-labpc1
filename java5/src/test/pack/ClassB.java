package test.pack;
import com.medusa.example.*;
import java.util.Random;

public class ClassB {
    public static void main(String[] args) {
        ClassA ca =new ClassA();
        ClassA aa = ca;
//        System.out.println(aa instanceof ClassA);
        ClassC cc=new ClassC();
        System.out.println("hello "+ca.name);
        System.out.println("you are now "+cc.age);
        ClassC ccc = new ClassC();
        ClassC cccc=cc;
        ca.name = "Pedro";
        System.out.println("hello "+ca.name);

        System.out.println(cc instanceof ClassC);

    }
}
