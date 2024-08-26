import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int com=s1.toLowerCase().compareTo(s2.toLowerCase());
        if(com==0){
            System.out.println("0");
        } else if (com<0) {
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
    }
}
