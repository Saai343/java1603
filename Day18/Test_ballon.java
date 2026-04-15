package Day18;
import java.util.*;

public class Test_ballon {
    public static int burst(List<List<Integer>> list){
        Collections.sort(list,(a,b)->a.get(1)-b.get(1));
        int max = list.get(0).get(1);
        int count=0;
        for(int i=1;i<list.size();i++){
            int start = list.get(i).get(0);
            int end = list.get(i).get(1);
            if(max>=start && max<=end){
                continue;
            }
            else{
                max=end;
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args){
        System.out.println(burst(Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6),Arrays.asList(7,8))));
    }
}
