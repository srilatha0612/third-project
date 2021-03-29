public class MyThread1 extends Thread {
    public void run(){

            Thread.currentThread().setPriority(10);

            System.out.println("child class");
        }
    }

class De{
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.start();
        Thread.currentThread().setPriority(2);
        Thread.yield();
        System.out.println("main class");
    }
}
