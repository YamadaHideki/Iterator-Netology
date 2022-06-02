import java.util.Iterator;

public class Randoms implements Iterable<Integer>{

    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}
