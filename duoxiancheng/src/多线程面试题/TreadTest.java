package 多线程面试题;

public class TreadTest {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName() + "...X=" + i);
                }
            }
        }.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "...Y=" + i);
        }
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName() + "...Z=" + i);
                }
            }
        };
        new Thread(r).start();
    }
}