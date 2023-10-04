package interview.aamir.InterviewPreparation.Demo;

@FunctionalInterface
interface interf{
    void display();
}
public class CustomFunctionalInter {
    public static void main(String args[]) {

        // Using Lambda Expression
        interf test2 = () -> {    // lambda expression
            System.out.println("Display using Lambda Expression");
        };
        test2.display();
    }
}
