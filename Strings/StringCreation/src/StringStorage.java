/**
 * Created by droid on 05/10/15.
 */
public class StringStorage {
    public static void main(String[] args) {
        /*
            a new String object is created in the non-pool area
            a new String literal object is created in the String Constant Pool area

            Therefore, the following line creates two objects
         */
        String s1 = new String("Hello World!");

        /*
            a new String object is created in the String Constant Pool area

            Therefore, the following line creates only one object
         */
        String s2 = "Hi There!";

        /*
            a new String object is created in the non-pool area
            Since an object with the literal "Hello World!" already exists on the String Constant Pool area, its
            reference is returned, instead of creating a new object in the String Constant Pool area

            Therefore, the following line creates only one object in the non-pool area
         */
        String s3 = new String("Hello World!");
    }
}
