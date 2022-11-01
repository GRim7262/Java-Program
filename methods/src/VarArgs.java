import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(54, 64, 545 ,667 ,43);
        multiple(23,  25,"Vinal", "Pawar", "dghdrft");
    }
    static void multiple(int a, int b, String ...v) {
        System.out.print(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
