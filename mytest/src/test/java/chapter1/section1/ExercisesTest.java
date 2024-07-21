package chapter1.section1;

import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static chapter1.section1.Exercises.*;
import static java.lang.StringTemplate.STR;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class ExercisesTest {
    final static double LOG2BASE = Math.log(2);
    final static String testDir = "src/test/testData";
    final static String tinyT = testDir + "/tinyT.txt";
    final static String tinyW = testDir + "/tinyW.txt";
    @Test
    void e14lg() {
        var random = new Random();
        for(int i =0; i<3; ++i) {
            final int n = random.nextInt(1000_0000)+1;
            out.println(STR."n: \{n}");
            final int expected = expectedlg(n);
            out.println(STR."expected: \{expected}");
            assertEquals(expected, lg(n), STR."failed to check \{n}");
        }
        assertEquals(0, lg(1));
        assertEquals(0, lg(2));
        assertEquals(1, lg(3));

    }
    int expectedlg(int n) {
        return (int)(Math.log(n)/LOG2BASE);
    }
    @Test
    void e16() {
//        out.println(STR."n=6: \{exR1(6)}";);
        assertEquals("311361142246", exR1(6));
    }
    private static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3) + n +exR1(n-2) +n;
    }
    @Test
    void e15() {
        record Check(int[] a, int M, int[] expect){}
        List<Check> checks = List.of(
            new Check(new int[]{1, 2, 2, 3, 4, 4, 4}, 5, new int[]{0, 1, 2, 1, 3}),
            new Check(new int[]{}, 5, new int[]{0, 0, 0, 0, 0}),
            new Check(new int[]{1, 2, 2, 3, 4, 4, 4, 5, -1}, 5, new int[]{0, 1, 2, 1, 3}),
            new Check(new int[]{0, 0, 0, 0, 0}, 1, new int[]{5}),
            new Check(new int[]{100, 200, 300}, 5, new int[]{0, 0, 0, 0, 0}),
            new Check(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                5,
                new int[]{0, 1, 1, 1, 1}
            )
        );
        for(var check : checks) {
            assertArrayEquals(
                check.expect,
                historigram(check.a, check.M),
                STR."Failed to check: \{Arrays.toString(check.a)}"
            );
        }
    }
    @Test
    void binaryBasic() {
        assertTrue(new File(tinyT).exists());
        assertTrue(new File(tinyW).exists());
    }

    @Test
    void e22() {
        final int[] whiteLists = In.readInts(tinyW);
        Arrays.sort(whiteLists);
        List<Integer>  whiteLists2 = new ArrayList<>();
        for(int v : whiteLists)  whiteLists2.add(v);
        final int[] keys = In.readInts(tinyT);
        for(final var key : keys) {
            if(rank_22(key, whiteLists) == -1) {
                assertFalse(whiteLists2.contains(key));
                out.println(key);
            }
        }
    }
    @Test
    void e23() {
        final int[] whiteLists = In.readInts(tinyW);
        Arrays.sort(whiteLists);
        List<Integer>  whiteLists2 = new ArrayList<>();
        for(int v : whiteLists)  whiteLists2.add(v);
        final int[] keys = In.readInts(tinyT);
        List<Integer> inList = new ArrayList<>();
        List<Integer> notInList = new ArrayList<>();
        for(final var key : keys) {
            if(rank_23(key, whiteLists) == -1) {
                assertFalse(whiteLists2.contains(key));
                notInList.add(key);
            } else {
                inList.add(key);
            }
        }
        assertEquals(List.of(50, 99, 13), notInList);
    }

}
