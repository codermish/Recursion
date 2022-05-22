public class CheckIfArrayIsSortedBetter {

    public static void main(String args[]){

        int arr[] = {4,6,7,8,90,10};
        boolean ans = checkSorted(arr,0);
        System.out.print(ans);

    }

    public static boolean checkSorted(int arr[], int index){

        if(arr.length==1){
            return true;
        }
        if(index == arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }
        boolean val = checkSorted(arr,index+1);
        return val;
    }
}
