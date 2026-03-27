import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            int j=s.length()-i-1;
            for(int k=0;k<Math.abs(i-j)/2;k++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(s.length()-1-i));

        }
    }
}
