package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private final List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public List<T> getElements() {
        return this.elements;
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void remove(int index) {
        this.elements.remove(index);
    }


    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public void swap(int index1, int index2) {
        T element1 = this.elements.get(index1);
        T element2 = this.elements.get(index2);

        this.elements.set(index1, element2);
        this.elements.set(index2, element1);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return this.elements.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return this.elements.stream().min(Comparable::compareTo).get();
    }
}
