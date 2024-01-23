package academy.devdojo.maratonajava.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

    }


    private static <T, R> List<R> map(List<T> list, Function<T, R> funciton) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = funciton.apply(e);
            result.add(r);
        }
        return result;
    }

}
