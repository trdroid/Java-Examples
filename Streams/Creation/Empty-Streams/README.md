# Empty Streams

An *empty stream* is a stream with no elements. 

### Creation

The *Stream* interface offers an *empty()* method to create an *empty sequential stream*.

```java
Stream.empty()
```

**Creating a *stream* of primitive types**

The following interfaces offer an *empty()* method to create an *empty sequential stream* of primitive types.

* *IntStream*
* *LongStream*
* *DoubleStream*

```java
IntStream.empty()
LongStream.empty()
DoubleStream.empty()
```

### Examples

An *empty stream* of *Strings*s can be created as follows

```java
Stream<String> stream = Stream.empty();
```

An *empty stream* of *int*s can be created as follows

```java
IntStream ints = 
```

