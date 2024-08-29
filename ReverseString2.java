package BasicJavaPrograms;

public class ReverseString2 {
    
    public static void main(String[] args) {
        
        String s=new String("Gokul");
        int len=s.length()-1;
        for(int i=len;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }

}
