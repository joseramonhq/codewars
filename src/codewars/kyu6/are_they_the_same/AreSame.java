package codewars.kyu6.are_they_the_same;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        //a.equals(new int[]{}) || || b.equals(new int[]{}
        if (a == null || b == null || a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++)
            if (a[i] * a[i] != b[i])
                return false;
        return true;

    }
}

