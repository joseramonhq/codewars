package codewars.kyu7.factorial;

public class Factorial {

    public static long factorial(int n) {
        long fact = 1L;

        while (n > 0)
            fact *= n--;
        return fact;
    }
}

