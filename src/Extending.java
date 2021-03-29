public class Extending extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child class");
        }
    }
}
class Demo4{
    public static void main(String[] args) {
        Extending e=new Extending();
        e.start();
        for (int i=0;i<10;i++){
            System.out.println("main class");
        }
    }
}
