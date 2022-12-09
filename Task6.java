public class Task6 {
    public static int ctoa(char c) {
        return (int) c;
    }

    public static void main(String[] args) {
        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("ctoa('m') -> " + ctoa('m'));
        System.out.println("ctoa('[') -> " + ctoa('['));
        System.out.println("ctoa('\\') -> " + ctoa('\\'));
    }
}
