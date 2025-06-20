
public class MultiThreadingExample {
    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start();

        T2 t2 = new T2();
        Thread thread = new Thread(t2);
        thread.start();

        for (int i = 1; i <= 20; i++) {
            System.out.println("MAIN : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//thread can br create 1.by using Thread class 2.by implimenting runable interface

//way 1 by using thread class
class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("T1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//way 2 by using runnable interface

class T2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("T2 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}