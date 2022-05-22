public class CheckNumberInArray {
	public static boolean checkNumber(int input[], int x) {
      boolean ans = checkNum(input,0,x);
        return ans;
	}
    public static boolean checkNum(int arr[], int index, int x){
        if(arr[index]==x){
            return true;
        }
        if(index==arr.length-1){
            return false;
        }
        boolean val = checkNum(arr,index+1,x);
        return val;
    }
}