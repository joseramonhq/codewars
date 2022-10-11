package codewars.kyu4.range_extraction;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String rangeExtraction(int[] arr) {
        int[] a = new int[2];
        List<String> list = new ArrayList<>();
        for (int i = 0, j = arr[0]; i < arr.length - 1; i++) {
            a[0] = arr[i];
            a[1] = a[0];
            while (arr[i + 1] == a[1] + 1 && i < arr.length - 1) {
                a[1] = arr[i++ + 1];
                if (i == arr.length - 1 && a[0] != a[1]) {
                    i++;
                    break;
                }

            }

            if (a[0] == a[1])
                list.add(a[0] + "");
            else if (a[1] - a[0] < 2) {
                for (int k = a[0]; k <= a[1]; k++)
                    list.add(k + "");
            } else {
                list.add(a[0] + "-" + a[1]);
            }
            if (i == arr.length - 2) {
                list.add(arr[arr.length - 1] + "");
                i++;
            }

        }
        return String.join(",", list);
    }
}

