
class mathUtils {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}


public class Main3 {
    public static void main(String[] args) {
        System.out.println(mathUtils.square(3));
        System.out.println(mathUtils.cube(3));
    }
}
