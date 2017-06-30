## Exercício 04 ##

### Given: ###

```
public class Clover extends Harrier {
    String bark() {
        return "feed me ";
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Harrier();
        dogs[1] = (Dog) new Clover();
        dogs[2] = (Dog) new Harrier();
        for (Dog d : dogs) System.out.print(d.bark());
    }
}

class Dog {
    String bark() {
        return "bark ";
    }
}

class Harrier extends Dog {
    String bark() {
        return "woof ";
    }
}
```
 ### What is the result? (Choose all that apply.) ###
 * A) bark bark bark
 * B) woof bark bark
 * C) woof feed me woof
 * D) Compilation fails due to an error on line 6.
 * E) Compilation fails due to an error on line 7.
 * F) Compilation fails due to an error on line 8.
 * G) Compilation fails due to an error on line 9. 