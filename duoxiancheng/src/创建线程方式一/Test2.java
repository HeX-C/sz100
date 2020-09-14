package 创建线程方式一;

public class Test2 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1("嘻嘻");
        Demo1 d2 = new Demo1("哈哈");
        d1.start();
        d2.start();
        System.out.println("over.........+" + Thread.currentThread().getName());
    }
}
