import java.util.Collection;

/**
 * Classes implementing this interface are shufflable; They can be rearranged in a random order.
 * Created by Tenku on 10/14/13.
 */
public interface Shuffler<E> {

    /**
     * Shuffles the elements of a collection and stores the result in an array.
     * @return An array of shuffled elements of the collection.
     */
    public E[] shuffle();


}
