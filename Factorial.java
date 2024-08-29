package BasicJavaPrograms;

public class Factorial {
    int fact=1;
    int n=5;
    public void factshow()
    {
        while (n>1) {
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial is "+fact);
    }
    public static void main(String[] args) {

        Factorial f=new Factorial();
        f.factshow();
        
    }
}
