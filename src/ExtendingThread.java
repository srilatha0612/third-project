public class ExtendingThread extends Thread {
    public void run(){

        System.out.println("child class");
    }
}
class Tests{
    public static void main(String[] args) {
        ExtendingThread t=new ExtendingThread();
        t.start();
        System.out.println("main class");
    }
}
