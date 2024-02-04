package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100_000_000;
        sumFor(num);

        sumStreamIterate(num);

        sumStreamParallelIterate(num);

        sumStreamLongIterate(num);

        sumStreamLongParallelIterate(num);
    }

    private static void sumFor(long numb) {
        System.out.println("Sum For Iterate");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0 ; i < numb; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long numb) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(numb).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamParallelIterate(long numb) {
        System.out.println("Sum StreamParallelIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(numb).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }


    private static void sumStreamLongIterate(long numb) {
        System.out.println("Sum StreamLongIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, numb).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamLongParallelIterate(long numb) {
        System.out.println("Sum StreamLongParallelIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, numb).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
