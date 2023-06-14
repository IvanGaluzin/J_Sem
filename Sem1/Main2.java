public class Main2 {

    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int current = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                current += 1;
            } else {
                if (current > count) {
                    count = current;
                }
                current = 0;
            }
        }
        if (current > count) {
            count = current;
        }
        System.out.println(count);
    
    }
}