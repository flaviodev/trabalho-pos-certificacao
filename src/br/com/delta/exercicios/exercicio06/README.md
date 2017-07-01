## Exercício 06 ##

### Given: ###

```
 4. class MySuper { protected MySuper() { System.out.print("ms "); } }
 5. public class MyTester extends MySuper {
 6.     private MyTester() { System.out.print("mt "); }
 7.     public static void main(String[] args) {
 8.         new MySuper(); 
 9.         class MyInner {
10.              private MyInner() { System.out.print("mi "); }
11.              { new MyTester(); }
12.              { new MySuper(); }
13.         }
14.         new MyInner();
15. } }
```
 ### What is the result? ###
* A) ms mi mt ms
* B) ms mt ms mi
* C) ms mi ms mt ms
* D) ms ms mt ms mi
* E) Compilation fails.
* F) An exception is thrown at runtime. 