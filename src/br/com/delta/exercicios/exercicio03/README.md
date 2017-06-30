## Exercício 03 ##

### Given: ###

```
public class RediMix extends Concrete {
    RediMix() {
        System.out.println("r ");
    }

    public static void main(String[] args) {
        new RediMix();
    }
}

class Concrete extends Sand {
    Concrete() {
        System.out.print("c ");
    }

    private Concrete(String s) {
    }
}

abstract class Sand {
    Sand() {
        System.out.print("s ");
    }
}
```
 ### What is the result? ###
 * A) r
 * B) c r
 * C) r c
 * D) s c r
 * E) r c s
 * F) Compilation fails due to a single error in the code.
 * G) Compilation fails due to multiple errors in the code.