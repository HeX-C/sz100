package 多生产者多消费者问题解决JDK5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    private String name;
    private int count = 1;
    boolean flag = false;
    //创建一个人锁对象
    Lock lock = new ReentrantLock();
    //通过已有的锁获取该锁上的监视器对象
    Condition con = lock.newCondition();
    public  void set(String name) {
        lock.lock();
        try{
            while (flag)
                try{con.await();
                }catch (InterruptedException e){
                }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "...生产者" + this.name);
            flag = true;
            con.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void out(){
        lock.lock();
        try {
           while (!flag)
                try{con.await();
                }catch (InterruptedException e){
                }
            System.out.println(Thread.currentThread().getName() + "..........消费者" + this.name);
            flag = false;
            con.signalAll();
        }
        finally {//使用finally代码块是为了无论怎样都释放锁
            lock.unlock();
        }
    }
}
