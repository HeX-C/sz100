package 创建线程方式一;

public class Test1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1("嘻嘻");
        Demo1 d2 = new Demo1("哈哈");
        d1.run();
        d2.run();
    }
}
