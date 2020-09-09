class MyClass1 {
    int num;
    MyClass1() {
       num = 100;
    }
}

class MyClass2 {
    int x;
    
    // Following is the constructor
    MyClass2(int i ) {
       x = i;
    }
 }


public class ConsDemo {
    public static void main(String args[]) {
      MyClass1 t1 = new MyClass1();
      MyClass1 t2 = new MyClass1();
      System.out.println(t1.num + " " + t2.num);

      MyClass2 t3 = new MyClass2( 10 );
      MyClass2 t4 = new MyClass2( 20 );
      System.out.println(t3.x + " " + t4.x);
    }
 }