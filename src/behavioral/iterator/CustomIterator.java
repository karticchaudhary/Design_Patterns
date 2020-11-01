package behavioral.iterator;

public interface CustomIterator<E> {

    void reset();
    E next();
    E currentItem();
    boolean hasNext();

}
