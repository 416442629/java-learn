public class Demo02 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();
        new MyThread2().start();
        new MyThread2().start();
        System.out.println(Thread.currentThread().getName());

    }
}
