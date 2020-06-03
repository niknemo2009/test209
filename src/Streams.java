package com.max.idea;
import java.time.DayOfWeek;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.*;
import java.time.*;

public class Streams {

    IntStream getGeometProgr(int start, int end, int koeff) {
        IntStream result = IntStream.of();
        for (int i = start; i <= end; i = i * koeff) {
            result = IntStream.concat(result, IntStream.of(i));
        }
        return result;
    }


    public int sumForCondition(int start, int end, int koeff, IntPredicate condition) {
        int result = 0;
        result = getGeometProgr(start, end, koeff).filter(condition).sum();
        return result;
    }

    public static List<LocalDate> getDaysInJava8(LocalDate start, int days)  {
        return Stream.of(start)
                .limit(days)
                .collect(Collectors.toList());
    }
}
