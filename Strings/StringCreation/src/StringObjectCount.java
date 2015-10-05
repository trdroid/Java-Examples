/**
 * Created by droid on 05/10/15.
 */
public class StringObjectCount {
    public static void main(String[] args) {
        /*
            count:1
            a new String object that contains "Hello"
         */
        String s1 = "Hello";

        /*
            count:2
            a new String object that contains "Hi"
         */
        String s2 = new String("Hi"); //count:2

        /*
            count:3
            a new String object that contains "HiHello"
         */
        s2.concat(s1);  //count:3

        /*
            count4: " There!"
            a new String object that contains " There!"

            count5:
            a new String object that contains "Hi There!"
         */
        s2.concat(" There!");
    }
}
