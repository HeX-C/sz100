package 多生产者多消费者问题解决方式;

public class Resource {
    private String name;
    private int count = 1;
    boolean flag = false;
    public synchronized void set(String name) {
        while (flag)
             try{this.wait();
        }catch (InterruptedException e){
             }
        this.name = name + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "...生产者" + this.name);
        flag = true;
        notifyAll();
    }
    public synchronized void out(){
        while (!flag)
            try{this.wait();
        }catch (InterruptedException e){
            }
        System.out.println(Thread.currentThread().getName() + "..........消费者" + this.name);
        flag = false;
        notifyAll();   ;
    }
}
