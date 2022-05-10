import javax.swing.plaf.synth.SynthDesktopIconUI;

public class QuickSort {

    public static void main(String args[]){

        int arr[]   = {3,2,6,1,8};
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void quickSort(int arr[],int startIndex, int endIndex){

        //base case
        if(startIndex == endIndex){
            return;
        }


        //find pivotIndex
        int pivotIndex = partition(arr,startIndex,endIndex);

        //quicksort the smaller problem
        quickSort( arr, startIndex,  pivotIndex);
        quickSort( arr, pivotIndex+1,  endIndex);


    }

    public static int partition(int arr[], int startIndex, int endIndex){

        //find pivot element

        int pivotElement = arr[startIndex];

        //place pivot element on its correct posn
        //count all elemnts <= pivot

        int count =0;
        for(int i=startIndex+1;i<endIndex;i++){
            if(pivotElement >= arr[i]){
                count++;
            }
        }

        int pivotIndex = startIndex +count;

        //pivotIndex is the correct posn of pivotElement
        //swap the elements at these posn
        int temp = arr[startIndex];
        arr[startIndex] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        //now pivotElement is in its correct position
        //Ensure all elements on left of pivotElement is <= it
        //Ensure all elements on right of pivotElement is > it

        int i= startIndex;
        int j= endIndex;

        while(i< pivotIndex && j>pivotIndex){

            //correct case
            if(arr[i]<=pivotElement){
                i++;
            }
            //correct case
            else if(arr[j] > pivotElement){
                j--;
            }
            //case not correct
            else{
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }
}
