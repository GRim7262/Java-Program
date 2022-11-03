public class Overloading {
    public static void main(String[] args) {
//        fun(23);
//        fun("Vinal");
        int ans = sum(23, 25, 2);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static void fun(int age) {
        System.out.println("First One");
        System.out.println(age);
    }
    static void fun(String name) {
        System.out.println("Second One");
        System.out.println(name);
    }
}
