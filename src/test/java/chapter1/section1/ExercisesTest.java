package chapter1.section1;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Random;

import static chapter1.section1.Exercises.lg;
import static java.lang.StringTemplate.STR;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercisesTest {
    final static double LOG2BASE = Math.log(2);
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
}
