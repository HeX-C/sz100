package 卖票例子;

public class Ticket implements Runnable {
    private int num = 100;

    public void run() {
        while (true) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + ",,,,,,,,,,,,sale..." + num--);
            }else {
                break;
            }
        }
    }

}
