import item.GenericItem;
import item.NonGenericItem;
import model.EReader;
import model.Tablet;

public class UseItem {
    public static void main(String[] args) {
        NonGenericItem ereaderItem = new NonGenericItem();
        ereaderItem.set(new Tablet());
        /*
            ereaderItem.get() returns a tablet, but is being typecasted to EReader
            which results in a ClassCastException at runtime

            This is the problem faced when using an Object to generically referring to types
            instead of using Generics
         */
        EReader ereader = (EReader) ereaderItem.get();

        /*
            In the following case,
                EReader is the Actual Parameter
                GenericItem<EReader> is a Parameterized Type, replacing the formal parameter T with
                 the actual type EReader

                a Parameterized type replaces
                    the formal parameters with the actual parameters
         */
        GenericItem<EReader> ereaderGenericItem = new GenericItem<>();

        /*
            The following results in a compilation error,

            ereaderGenericItem.set(new Tablet());

            as ereaderItem1 is declared as an GenericItem that accepts only EReader types,
            but not Tablets
         */

        ereaderGenericItem.set(new EReader());

        /*
            Type casting is not necessary, as ereaderGenericItem is declared as
            GenericItem<EReader> and get() is defined as T get(), T becomes EReader
            and the get() method returns an object of type EReader

            Also, attempting to typecast to Tablet is an compilation error

            EReader ereader1 = (Tablet) ereaderGenericItem.get();
         */
        EReader ereader1 = ereaderGenericItem.get();
    }
}
