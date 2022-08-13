package codewars.kyu7.parallel_resistors;

import java.util.stream.DoubleStream;

class ParallelResistors {
    public static double resistance(double... r) {
        return 1.0 / DoubleStream.of(r).map(x -> 1 / x).sum();
    }
}

