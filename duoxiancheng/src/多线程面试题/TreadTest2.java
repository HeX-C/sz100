package 多线程面试题;

public class TreadTest2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Runnable run");
            }
        }) {
//            public void run() {
//                System.out.println("subThread run");
//            }
        }.start();
    }
}
//程序会不会出错？如果不出错，打印结果是什么？
//打印结果为subThread ，子类run方法覆写了父类的run方法
//如果去掉子类run方法，则打印结果为Runnable