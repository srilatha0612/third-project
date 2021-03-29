public class SetPriority extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child thread");
        }
    }
}
class Demoo{
    public static void main(String[] args) {
        SetPriority s=new SetPriority();
        s.setPriority(10);
        s.start();
        for (int i=0;i<10;i++){
            System.out.println("main class");
        }
    }
}
