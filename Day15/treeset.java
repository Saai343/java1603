package Day15;
import java.util.*;
import java.util.TreeSet;

/*
Treeset - Binary search tree (self balancing)

Funtions:
    - add()
    - remove()
    - contains()
    - first() -prints smallest number
    - last() -prints largest number
    - ceil() -checks highest that input (includes the same number too when present in treeset)
    - floor() -checks lowest fron the input
    - higher() -checks the next high number than input
    - lower() -checks the previous low number than input


 */
public class treeset {
    public static int Close(int[] arr,int target){
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : arr){
            set.add(num);
        }
        if(set.higher(target)==null && set.lower(target)!=null) return(set.lower(target));
        if(set.lower(target)==null && set.higher(target)!=null) return(set.higher(target));
        if(Math.abs(target - set.higher(target))>=Math.abs(target - set.lower(target))){
            return(set.lower(target));
        }
        return(set.higher(target));
    }
    public static void main(String[] args){
        int[] arr={15,3,9,1,7,2};
        int target = 1;
        System.out.println(Close(arr,target));
    }
}
