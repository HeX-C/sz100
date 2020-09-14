package 多线程之join方法;
//join会让线程处于冻结状态，也会抛出异常
//toString打印线程名称、优先级（获取cpu的概率）和线程组
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Join j = new Join();
        Thread t1 = new Thread(j);
        Thread t2 = new Thread(j);

        t1.start();
//       t1.join();//t1线程要申请加入运行，当遇到t1join时，cpu会释放执行资
                  // 格和执行权，等待t1线程结束之后再执行主函数线程

        t2.start();
//        t1.join();t1线程要申请加入运行，当遇到t1join时，cpu会释放执行资格和执行权，等待t1线程结束之后再执行主函数线程
        for (int i = 0; i < 50; i++) {
//            System.out.println(Thread.currentThread().toString() + "..." + i);
        }
    }
}