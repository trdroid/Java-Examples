# Java Native Interface

### Native Methods

A *native method* is a method in Java that is implemented in a native language like C/C++. 

**Declaration**

A *native method* in Java is JUST declared but not defined . A *native method* is defined in a native language and exists in the native code that has to be loaded by a Java program into the JVM before it can be called.

A *native method* can be declared as

* a static method (or)
* an instance method

A *native method* can be declared with any of the following scopes

* private
* default
* protected
* public

A *native method* CANNOT be declared as an *abstract* method.

**Compilation**

A Java program is compiled into a *platform-independent* byte code. 
*Native method*'s are compiled into a *shared library* which has a *platform-dependent* format and which are loaded by the JVM. 
A *shared library* is referred to as a *Dynamic Link Library (DLL)* on Windows and a *Shared Object (SO)* on \*nix platforms.  

**Calling a native method**

 A *native method* is called the same way as a regular Java method.
 
 **Benefits**
 
 1) *Leveraging legacy code*: Any existing legacy code written in native languages can be re-used in a Java application.
 
 2) *Performance benefits*: Any time-critical section of a Java application can be written in native code and integrated with it if the Java version of the time-critical section is deemed to be less performant.
 
 3) *Platform-specific features*: If Java does not provide APIs for a particular platform-specific feature, then it can be implemented in a native language and integrated with a Java application.
 
 **Drawbacks**
 
 1) *Portability*:   


### Loading a shared library in a Java program

A shared library should be loaded before it can be called in a Java program. 

A shared library could be loaded using

*System.loadLibrary(String sharedLibrary)*



*Runtime.getRuntime().loadLibrary(String sharedLibrary)*



*System.load(String sharedLibrary)*


### Semantics of finding a shared library

The *loadLibrary()* method can be configured to search for a shared library in one of the following ways 

* *The environment variable approach*: Including the directory containing the shared library in the *PATH* environment variable on Windows and the *LD_LIBRARY_PATH* environment variables on \*nix platforms.

* *The command line approach*: Specifying the directory or semicolon-seperated directories as the value for the *java.library.path* JVM property in the command line. 

```
$ java -Djava.library.path=<directory or semicolon-seperated directories> <Class name>
```

Example:

Assuming that the shared library used in the Java class "Main.class" (compiled from "Main.java") is at /home/droid/myjnilib

```sh
$ java -Djava.library.path=/home/droid/myjnilib Main
```
