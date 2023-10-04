package interview.aamir.InterviewPreparation.Demo;

// copy constructor works here

class Copy{
    private String string ;

    private  Long age ;

    public Copy(String string, Long age) {
        this.string = string;
        this.age = age;

        System.out.println(string +" : hey : " + age);
    }

    public  Copy(Copy ref){
       string =  ref.string;
       age = ref.age;
        System.out.println(string +" :  hey-1 : " + age);
    }
    /*  public Copy(){
        string = "aamir";
        age = 25L;
        System.out.println(string+ "+ 1 + " + age);
    }*/

   /*  Copy(Copy ref){
       age= ref.age;
       string = ref.string;
        System.out.println(string+ " +  2  + " + age);
    }*/
}

public class CopyConstructor {
    public static void main(String[] args) {
        Copy copy = new Copy("aamir",25L );
        Copy copy1 = new Copy(copy);
    }
}
