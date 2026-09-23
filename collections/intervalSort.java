    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;

    class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + "," + end + "]";
        }
    }

    public class intervalSort {
        public static void main(String[] args) {
            List<Interval> intervals = new ArrayList<>(Arrays.asList(
                    new Interval(1, 6),
                    new Interval(3, 8),
                    new Interval(0, 3),
                    new Interval(2, 5),
                    new Interval(7, 9)
            ));

            List<Interval> byStart = new ArrayList<>(intervals);
            Collections.sort(byStart, Comparator.comparingInt(interval -> interval.start));
            System.out.println("Start ascending: " + byStart);

            List<Interval> byEnd = new ArrayList<>(intervals);
            byEnd.sort(Comparator.comparingInt((Interval interval) -> interval.end).reversed());
            System.out.println("End descending: " + byEnd);

            List<Interval> byStartThenEnd = new ArrayList<>(intervals);
            byStartThenEnd.sort(
                    Comparator.comparingInt((Interval interval) -> interval.start)
                            .thenComparing(Comparator.comparingInt((Interval interval) -> interval.end).reversed())
            );
            System.out.println("Start ascending, end descending: " + byStartThenEnd);
        }
    }