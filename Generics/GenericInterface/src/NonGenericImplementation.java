/*
    A nongeneric class implementing a generic interface by passing type arguments explicitly
 */
public class NonGenericImplementation implements CustomMap<String, String>{
    @Override
    public void put(String key, String value) {

    }

    @Override
    public String get(String key) {
        return null;
    }
}
