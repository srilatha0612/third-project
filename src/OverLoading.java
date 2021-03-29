public class OverLoading extends Thread {
    public void run() {
        System.out.println("child class");
    }

    public void run(int i) {
        System.out.println("main class");
    }
}
class Test{
    public static void main(String[] args) {
        OverLoading l=new OverLoading();
        l.start();
    }
}
