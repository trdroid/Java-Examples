/*
    The following interface accepts two type parameters
 */
interface CustomMap<K, V>{
    void put(K key, V value);
    V get(K key);
}
