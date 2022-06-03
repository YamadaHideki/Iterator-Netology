import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {

    private final int min;
    private final int max;

    public RandomsIterator(Randoms randoms) {
        this.min = randoms.getMin();
        this.max = randoms.getMax();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int resultMax = max - min;
        return (int) (Math.random() * ++resultMax) + min;
    }
}
