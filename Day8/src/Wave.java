import java.util.*;
public class Wave {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PrintWave(s));
    }

    public static String PrintWave(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            sb.append(s.charAt(i));
        }
        for(int i=1;i<s.length();i+=2){
            sb.append(s.charAt(i));
        }
        return(sb.toString());
    }
}
