package interview.aamir.InterviewPreparation.Demo;

public class InitDemo {
    private String name;

    private Integer age;

    public InitDemo(String n , Integer a){
        this.name  = n;
        this.age = a;
        System.out.println("Name : " + n +" Age : " + age);
    }
    {
        System.out.println("Aamir");
    }


    public static void main(String[] args) {
       // InitDemo initDemo = new InitDemo("Rais Ahmad" , 50);
       // InitDemo initDemo1 = new InitDemo("Mohd Anas" , 30);
        System.out.println("Aamir 1");

    }

    static {
        System.out.println("aamir pasha");
    }
}
