package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void setElement(T element) {
        this.list.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s: %s", t.getClass().getName(), t.toString()));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void swap(int index1, int index2) {
        T firstEle = this.list.get(index1);
        T secondEle = this.list.get(index2);

        this.list.set(index1, secondEle);
        this.list.set(index2, firstEle);
    }

    public int count(T comparator) {
        int count = 0;
        for (T t : list) {
            if (t.compareTo(comparator) > 0) {
                count++;
            }
        }
        return count;
    }
}
