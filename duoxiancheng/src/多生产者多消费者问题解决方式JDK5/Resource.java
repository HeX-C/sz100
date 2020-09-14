package 多生产者多消费者问题解决方式JDK5;
/*
jdk1.5以后将同步和锁封装成了对象，
并将操作锁的隐式方式定义到了该对象中
将隐式动作变成了显式动作。

Lock接口：替代了同步代码块或者同步函数，将同步的隐式锁操作变成了
显式锁操作，同时更为灵活，可以一个锁上加上多组监视器。
lock（）：获取锁；
unlock();释放锁，通常需要定义在finally代码块中；

Condition：替代了Object中的wait、notify、notifyAll方法
            将这些监视器方法进行单独的封装，变成了Condition监视器对象
            可以与任意锁进行组合；
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    private String name;
    private int count = 1;
    boolean flag = false;
    //创建一个锁对象
    Lock lock = new ReentrantLock();
    //通过已有的锁获取两组监视器，一组监视消费者，一组监视消费者
    Condition producer_con = lock.newCondition();
    Condition consumer_con = lock.newCondition();
    public  void set(String name) {
        lock.lock();
        try{
            while (flag)
                try{producer_con.await();
                }catch (InterruptedException e){
                }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者" + this.name);
            flag = true;
            consumer_con.signal();
        }finally {
            lock.unlock();
        }
    }
    public void out(){
        lock.lock();
        try {
           while (!flag)
                try{consumer_con.await();
                }catch (InterruptedException e){
                }
            System.out.println(Thread.currentThread().getName() + "..........消费者" + this.name);
            flag = false;
            producer_con.signal();
        }finally {
            lock.unlock();
        }
    }
}
