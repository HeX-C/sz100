package 死锁模式;

public class Test implements Runnable {
    private  boolean flag;
    Test(boolean flag){
        this.flag = flag;
    }
    public void run(){
        if(flag){
            while (true)//重复执行直至锁上(死循环）
            synchronized (Mylock.locka)
            {
                System.out.println("if  locka...");
                synchronized (Mylock.lockb)
                {
                    System.out.println("if   lockb...");
                }
            }
        }
        else {
            while (true)
            synchronized (Mylock.lockb){
                System.out.println("else  locka...");
                synchronized (Mylock.locka)
                {
                    System.out.println("else    lockb...");
                }
            }
        }
    }

}
