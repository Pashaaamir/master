package interview.aamir.InterviewPreparation.Demo;

class A{
    public A(){
        System.out.println("Constructor A");
    }
}
class B extends A{
    public B(){
        this(5);
        System.out.println("Constructor B");
    }
    public B(int a){
        System.out.println("Constructor B arguments");
    }
}

public class ConsDemo {
    public static void main(String[] args) {
       // B obj = new B();// output
         /*Constructor A
        Constructor B arguments
        Constructor B*/
        //A obj = new A(); // output
        //Constructor A
       // A obj = new B();//output
         /*Constructor A
        Constructor B arguments
        Constructor B*/


        /*Constructor chaining is the process of calling one constructor
        from another constructor with respect to current object.

          One of the main use of constructor chaining is to avoid duplicate
          codes while having multiple constructor (by means of constructor overloading)
          and make code more readable.

          Constructor chaining can be done in two ways:


   1.Within same class: It can be done using this() keyword for constructors in the same class
   2. From base class: by using super() keyword to call the constructor from the base class.
*/
    }
}
