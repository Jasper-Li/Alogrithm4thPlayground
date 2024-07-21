public class HelloGoodbye {
    public static void main(String[] args) {
        final var name1 = args[0];
        final var name2 = args[1];
        System.out.printf("Hello %s and %s.\nGoodbye %s and %s.",
            name1, name2, name2, name1);
    }
}
