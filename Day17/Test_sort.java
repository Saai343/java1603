package Day17;
import java.util.*;

public class Test_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        //1: Frequency
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //2.To map
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b)-> {
                    if (b.getValue().equals(a.getValue())) return a.getKey() - b.getKey();
                    return b.getValue() - a.getValue();
                });

        ArrayList<Character> result = new ArrayList<>();
        for(Map.Entry<Character,Integer> i : list){
            result.add(i.getKey());
        }
        System.out.println(result);

    }
}
