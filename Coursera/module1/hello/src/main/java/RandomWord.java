import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        int count = 0;
        String champion = null;
        boolean isEmpty = StdIn.isEmpty();
        while (!isEmpty) {
            final var word = StdIn.readString();
            ++count;
            if (StdRandom.bernoulli(1.0 / count)) {
                champion = word;
            }
            isEmpty = StdIn.isEmpty();
        }
        System.out.println(champion);
    }
}
