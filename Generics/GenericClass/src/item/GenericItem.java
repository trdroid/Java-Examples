package item;

/*
    T is a Type Parameter
 */
public class GenericItem<T> {
    /*
        instance variable of type T
     */
    private T item;

    /*
        Method Parameter of type T
     */
    public void set(T item) {
        this.item = item;
    }

    /*
        Returns an object of type T
     */
    public T get() {
        return item;
    }
}

/*
    class with multiple formal type parameters
 */
class GenericClass<P, Q, R, S> {

}
