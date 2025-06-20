import java.util.ArrayList;
import java.util.List;

// Interface can be implemented in many ways
public class LambdaExpressionExample {

    // 1 - Implementation Class
    Test2 t2 = new Test3();

    // 2 - Anonymous Inner Class
    Test2 t3 = new Test2() {
        @Override
        public void show() {
            System.out.println("Hello from Anonymous Inner Class");
        }
    };

    // 3 - Lambda Expression
    Test2 t4 = () -> System.out.println("HIII from Lambda Expression");

    // Constructor or method to invoke the objects
    public LambdaExpressionExample() {
        t2.show();
        t3.show();
        t4.show();
    }

    public static void main(String[] args) {
        // Create an object to run the constructor
        new LambdaExpressionExample();
    }
}

interface Test2 {
    void show();
}

// 1 - Implementation Class
class Test3 implements Test2 {
    @Override
    public void show() {
        System.out.println("Hello from Implementation Class");
    }
}