import java.util.*;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
    }
}
