public class MyRunning implements Runnable {
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("child class");
        }
    }
}
class Demo3{
    public static void main(String[] args) {
        MyRunning r=new MyRunning();
        Thread t=new Thread(r);
        for (int i=0;i<10;i++){
            System.out.println("main class");
        }
    }
}
