package chapter1.section1;

import static java.lang.System.out;

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
    public static int[] historigram(int[] a, int M){
        int[] result = new int[M];
        for(var value : a) {
            if (value >=0 && value <M) {
                ++result[value];
            }
        }
        return result;
    }
    public static int rank_22(int key, int[] a) {
        return rank_22(key, a, 0, a.length-1, 0) ;
    }
    private static int rank_22(int key, int[] a, int low, int high, int depth) {
        out.println(STR."\{" ".repeat(depth)}low: \{low}, high: \{high}");
        if(low > high) return -1;
        final var mid = (low + high) / 2;
        final var nextDepth = ++depth;
        if(key < a[mid]) {
            return rank_22(key, a, low, mid-1, nextDepth);
        } else if(key > a[mid]) {
            return rank_22(key, a, mid+1, high, nextDepth);
        } else {
            return key;
        }
    }
    public static int rank_23(int key, int[] a) {
        return rank_23(key, a, 0, a.length-1, 0) ;
    }
    private static int rank_23(int key, int[] a, int low, int high, int depth) {
//        out.println(STR."\{" ".repeat(depth)}low: \{low}, high: \{high}");
        if(low > high) return -1;
        final var mid = (low + high) / 2;
        final var nextDepth = ++depth;
        if(key < a[mid]) {
            return rank_23(key, a, low, mid-1, nextDepth);
        } else if(key > a[mid]) {
            return rank_23(key, a, mid+1, high, nextDepth);
        } else {
            return key;
        }
    }

}
