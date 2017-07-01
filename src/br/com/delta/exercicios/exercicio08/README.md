## Exercício 08 ##

### These classes are defined in the same file. What is the output?  ###

```
class Parent {
    String message = "parent";
}

class Child extends Parent {
    String message = "child";
}

public class Test {
    public static void main(String[] args) {
        System.out.println(new Child().message);
    }
}
```
 ### Options: ###
 * A) Parente
 * B) child 