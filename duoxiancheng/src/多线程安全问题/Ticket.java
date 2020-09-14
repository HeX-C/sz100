package 多线程安全问题;

public class Ticket implements Runnable {
    private int num = 100;
    public void run(){
        while (true){
        if (num>0){
            //解决异常问题
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException I){
            }
        System.out.println(Thread.currentThread().getName()+",,,,,,,,,,,,sale..."+num--);
    }
}
    }

}
