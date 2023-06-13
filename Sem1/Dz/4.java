public class Main {
    public static void main(String[] args) {
        int q, w, e;

        for (q = 0; q <= 9; q++) {
            for (w = 0; w <= 9; w++) {
                if (isValid(q, w)) {
                    e = q + w;
                    System.out.printf("%d%d + %d%d = %d%d\n", q, w, w, q, e, e);
                }
            }
        }
    }


    public static boolean isValid(int q, int w) {
        return q + w == 4 && q >= 0 && w >= 0 && q <= 9 && w <= 9;
    }
}