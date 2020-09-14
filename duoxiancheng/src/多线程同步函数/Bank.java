package 多线程同步函数;
//需求：两个储户，每个人去银行存钱每次100元，共存三次；
public class Bank {
    private int sum;
    //private Object  obj = new Object();
    //建立同步函数，与同步代码块一样，都可以解决安全问题
    public synchronized void add(int num){
            sum = sum + num;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("sum=" + sum);
        }
}

