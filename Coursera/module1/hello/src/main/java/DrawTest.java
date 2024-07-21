import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class DrawTest {
    static void pointLine() {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.point(0., 1.);
        StdDraw.point(0., 0.);
        StdDraw.point(1., 0.);
        StdDraw.point(1., 1.);

        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
    }
    static void circle() {
        StdDraw.circle(0.5, 0.5, 0.5);
    }
    static void circleWithPoints(int N){
        StdDraw.setScale(-1.2, 1.2);
        StdDraw.circle(0, 0, 1);
        StdDraw.setPenRadius(0.05);
        final var step = 2*Math.PI/N;
        for(int i=0; i<N; ++i) {
            var angle = i*step;
            StdDraw.point(Math.cos(angle), Math.sin(angle));
        }
    }
    public static void main(String[] args) {
//        pointLine();
//        circle();
        final int N = StdIn.readInt();
        circleWithPoints(N);
    }
}
