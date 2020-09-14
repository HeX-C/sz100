package 多线程同步函数;

public class Customs implements Runnable {
   private Bank b = new Bank();
    public void run() {
        for (int i = 0; i <3 ; i++) {
            b.add(100);
        }

    }
}
