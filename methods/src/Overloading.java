public class Overloading {
    public static void main(String[] args) {
        fun(23);
        fun("Vinal");
    }
    static void fun(int age) {
        System.out.println(age);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
