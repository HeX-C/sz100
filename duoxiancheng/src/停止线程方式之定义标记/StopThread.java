package 停止线程方式之定义标记;

import java.util.Random;

public class StopThread implements Runnable {
    private boolean flag = true;
    public void run(){
        while (flag){
            System.out.println(Thread.currentThread().getName() + ".....");
        }
    }
    public void setFlag(){
        flag = false;
    }
}
