public class Task5 {
    public static String operation(int N, int a, int b) {
        if (a + b == N)
            return "added";
        else if (a - b == N)
            return "subtracted";
        else if (a * b == N)
            return "multiplied";
        else if (a / b == N && a % b == 0)
            return "divided";
        else
            return "none";
    }
    public static void main(String[] args) {
        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("operation(24, 26, 2) -> " + operation(24, 26, 2));
        System.out.println("operation(15, 11, 11) -> " + operation(15, 11, 11));
    }
}
