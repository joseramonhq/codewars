package codewars.kyu7.triangles_from_dots;

import java.math.BigInteger;

public class TriangularNumbers {

    public static BigInteger numberOfDots(BigInteger n) {
        return n.multiply(n.add(BigInteger.ONE))
                .divide(BigInteger.TWO);
    }

}

