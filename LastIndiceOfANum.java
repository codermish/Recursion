
public class Solution {

    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int index = lastindex(input,x,input.length-1);
        return index;
    }


    public static int lastindex(int arr[], int x, int index){


        //base case

        if(arr[index] == x){
            return index;
        }
        if(index ==0 ){
            return -1;
        }
        int val = lastindex(arr,x, index-1);
        return val;
    }

}