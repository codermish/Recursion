
import java.util.*;
public class Solution {

    public static int[] allIndexes(int input[], int x) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = getAllIndices(input,x,0,list);


        if(list1.size()==0){
            int arr[] = new int[1];
            arr[0]=-1;

        }
        int arrSmall[] = new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            arrSmall[i] = list1.get(i);
        }
        return arrSmall;

    }
    private static List<Integer>   getAllIndices(int arr[], int x, int index, List<Integer> list){

        if(arr[index]==x){
            list.add(index);
        }
        if(index ==arr.length-1){
            return list;
        }
        List<Integer> finalList = getAllIndices(arr,x,index+1,list);
        return finalList;
    }
}