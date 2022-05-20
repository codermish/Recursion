public class SumOfArray {

	public static int sum(int input[]) {
  int sumFinal = sum( input,0,0);
        return sumFinal;

	}

    public static int sum(int arr[],int sum,int index){

        if(arr.length == 0){
            return 0;
        }
        if(arr.length ==1){
            return arr[0];
        }
        if(index==arr.length -1){
            return arr[index];
        }
        sum = arr[index]+ sum(arr,sum,index+1);
        return sum;



    }
}