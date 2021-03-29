public class Rnnble implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child class");
        }
    }
}
class Dem{
    public static void main(String[] args) {
        Rnnble r=new Rnnble();
        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("main class");
        }
    }
}
