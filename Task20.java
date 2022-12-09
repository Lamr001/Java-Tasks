public class Task20 {
    public static int boxSeq(int step) {
        if (step == 0) {
            return 0;
        }
        int boxes = 3;
        for (int i = 2; i < step + 1; i++) {
            if (i % 2 == 0) {
                boxes -= 1;
            } else {
                boxes += 3;
            }
        }
        return boxes;

    }

    public static void main(String[] args) {
        System.out.println("boxSeq(0) -> " + boxSeq(0));
        System.out.println("boxSeq(1) -> " + boxSeq(1));
        System.out.println("boxSeq(2) -> " + boxSeq(2));
    }
}
