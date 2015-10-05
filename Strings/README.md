# Strings

Strings are immutable objects. Once created they can never be modified.

A String class is closed for modification as it is marked as final. Therefore, its default behavior cannot be overridden.

Creation Syntax: 

```java
  String s1 = new String("Hello World!");
  
  String s2 = "Hello World!";
```

### String Constant Pool

JVM allocates an area of memory called String Constant Pool where String literal objects are stored. When the compiler encounters a String literal, it checks in the String Constant Pool to see if an identical String exists. If it does, the reference to it is returned, else a new String literal object is created in the String Constant Pool and its reference is returned.
