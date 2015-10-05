class StringCreation {
    public static void main(String[] args) {
        /*
            A new String object is created on the heap that contains the content "Hello World".

            Reference s1 points to it
         */
        String s1 = new String("Hello World");

        /*
            s1 and s2 point to the same String object which has the content "Hello World"
            NOTE: String objects are immutable, but their references are not, unless they are declared final
         */
        String s2 = s1;

        /*
            A new String object is created on the heap that contains the content "Welcome"

            Reference s3 points to it
         */
        String s3 = "Welcome";


        /*
            A new String object is created that contains the content " to this World!" with the assignment to
            String str declared as a parameter in the concat method

            String str = " to this World!"

            Reference str points to the new Object that contains " to this World!"

            The content of str is appended to the content of s3 to be "Welcome to this World!",
            (NOTE: The String object that s3 points to is unchanged as it is immutable)
            A new String object is created to represent this string and the reference is assigned to s1.

            As a result,
            s1 does not reference "Hello World", but "Welcome to this World!"
            s2 still refers to "Hello World"
            s3 refers to "Welcome"
         */
        s1 = s3.concat(" to this World!");

        /*
            A new String object is created that contains "Today!" and its reference is assigned to str of concat method

            String str = "Today!";

            The concat method creates a new String Object that contains the content "Welcome Today!", but the
            reference to it is not assigned to any variable and is lost. 
         */
        s3.concat("Today!");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}