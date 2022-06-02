import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {

    private final int min;
    private final int max;
    private int current;

    public RandomsIterator(Randoms randoms) {
        this.min = randoms.getMin();
        this.max = randoms.getMax();
        this.current = min;
    }

    @Override
    public boolean hasNext() {
        return current <= max;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
