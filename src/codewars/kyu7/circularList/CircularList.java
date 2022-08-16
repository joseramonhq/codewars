package codewars.kyu7.circularList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularList<T> {
    List<T> list;
    int index;


    @SafeVarargs
    public CircularList(final T... elements) {
        if (elements.length == 0) throw new IllegalArgumentException();
        list = new ArrayList<>(Arrays.asList(elements));
        index = -1;


    }

    T next() {
        if (++index == list.size())
            index = 0;
        return list.get(index);

    }

    T prev() {
        if (--index < 0)
            index = list.size() - 1;
        return list.get(index);
    }
}
