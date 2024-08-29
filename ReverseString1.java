package BasicJavaPrograms;

public class ReverseString1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Gokul");
        System.out.println("The origional String is "+sb.toString());
        System.out.println("The reverse string is "+sb.reverse().toString());
    }
}
