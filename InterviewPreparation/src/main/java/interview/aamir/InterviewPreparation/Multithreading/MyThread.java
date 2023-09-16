package interview.aamir.InterviewPreparation.Multithreading;

class MyThreadDemo extends Thread{
     public void run(){
    //public void demo() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class MyThread{
    public static void main(String[] args) {
        MyThreadDemo myThreadDemo = new MyThreadDemo();
        myThreadDemo.start();
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Main Thread");
        }
       // myThreadDemo.demo();
    }

}
