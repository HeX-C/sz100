package 多线程之join方法;

public class Join implements Runnable {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().toString()+ "......" + i);
            Thread.yield();//临时暂停正在执行的线程对象，并执行其他线程
            //获取执行权后又释放
        }
    }
}
