package chapter1.section1;

public class Exercises {
    public static int lg(int n) {
        if(n<1) {
            throw new IllegalArgumentException(STR."Need n > 1: \{n}");
        }
        int count = 0;
        int value = 1;
        while(value < n) {
            value *=2;
            ++count;
        }
        return count > 0 ? --count : count;
    }
}
