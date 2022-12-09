public class Task7 {

    public static int addUpTo(int x) {
        int result = 0;
        while (x > 0)
            result += x--; // x - 1
        return result;
    }

    public static void main(String[] args) {
        System.out.println("addUpTo(3) -> " + addUpTo(3));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("addUpTo(7) -> " + addUpTo(7));
    }
}
