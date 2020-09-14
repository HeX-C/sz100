package 创建线程方式二;

public class Test2 {
    public static void main(String[] args) {
        Demo1 r= new Demo1("嘻嘻");
        Thread d1 = new Thread(r);
        Thread d2 = new Thread(r);
        d1.start();
        d2.start();
        System.out.println("over.........+" + Thread.currentThread().getName());
    }
}
