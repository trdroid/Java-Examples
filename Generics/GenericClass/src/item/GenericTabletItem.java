package item;

import model.Tablet;

/*
    A generic class can be extended by another generic class.

    An extending generic class MUST pass the type arguments to its base generic class, which is done by

        using a common subset of Formal Parameters in the derived class
        and the base class when extending from the base class
            eg. GenericTabletItem,  GenericTabletItemOne, AnotherGenericTabletItem

            (or)

        passing the type arguments directly to the base class when extending from it
            eg. YetAnotherGenericTabletItem

            This method also allows non generic classes to be defined from generic classes

                eg. NonGenericTabletItem

         For example, the following results in a compilation error

         class GenericTableItem<Y> extends GenericItem<T> {
         }
 */
public class GenericTabletItem<T> extends GenericItem<T> {
}

/*
    The formal type parameter's name of the child class doesn't necessarily have to match the formal type parameter
     name, T of GenericItem of the base class

     In the following example, X is used as a formal parameter whereas the base class is uses T for its formal
     type parameter
 */
class GenericTabletItemOne<X> extends GenericItem<X> {
}

/*
    A child class can have more formal type parameters than the base class, while a required subset
        of these arguments should be passed to the base class when extending from it
 */
class AnotherGenericTabletItem<S, T> extends GenericItem<T> {

}

/*
    A generic class can be extended by passing the type arguments
    directly to the base class when extending from it
 */
class YetAnotherGenericTabletItem<T> extends GenericItem<Tablet> {

}

class NonGenericTabletItem extends GenericItem<Tablet> {

}

/*
    Type arguments cannot be passed to nongeneric classes

    The following is a compilation error:
    NonGenericTabletItem<String> obj = new NonGenericTabletItem<>();
 */