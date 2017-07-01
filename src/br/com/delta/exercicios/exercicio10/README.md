## Exercício 10 ##

### Given: ###

```
 3. class IcelandicHorse {
 4.     void tolt() { System.out.print("4-beat "); }
 5. }
 6. public class Vafi extends IcelandicHorse {
 7.     public static void main(String[] args) {
 8.         new Vafi().go();
 9.         new IcelandicHorse().tolt();
10.     }
11.     void go() {
12.         IcelandicHorse h1 = new Vafi();
13.         h1.tolt();
14.         Vafi v = (Vafi) h1;
15.         v.tolt();
16.     }
17.     void tolt() { System.out.print("pacey "); }
18. }
```
 ### What is the result? (Choose all that apply.) ###
 * A) 4-beat pacey pacey
 * B) pacey pacey 4-beat
 * C) 4-beat 4-beat 4-beat
 * D) 4-beat pacey 4-beat
 * E) pacey, followed by an exception
 * F) 4-beat, followed by an exception  