public class StaticExample {
    static int a = 80;
    static int b;

    static void func(int c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b = 20);
        func(40);
    }
}
