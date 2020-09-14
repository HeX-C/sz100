package 同步代码块;

import java.util.function.ObjDoubleConsumer;

public class Ticket implements Runnable {
    private int num = 100;
    //为创建同步代码块sychronized建立对象
    //定义在run方法外是为了保证多个线程使用同一把锁，也是同步的前提
      Object obj = new Object();
    public void run(){
        while (true){
            //同步代码块
            synchronized (obj){
        if (num>0) {
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException I) {
            }
        }
        System.out.println(Thread.currentThread().getName()+",,,,,,,,,,,,sale..."+num--);
    }
}
    }

}
