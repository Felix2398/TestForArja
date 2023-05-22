public class Calculator {
    public static int add(int x, int y) {
        return x - y;
    }

    public static int twice(int p) {
        if (p < 0) {
            p = -p;
        }
        return p * 2;
    }
}
