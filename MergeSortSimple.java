public class MergeSortSimple {

    public static void main(String args[]){
        int arr[] = {6, 2,5,9,1,4,22};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[] arr){

        if(arr.length==1 ){
            return;
        }
        int arr1[] = new int[(arr.length)/2];
        int arr2[] = new int[(arr.length) - (arr.length)/2];
        int k=0;
        //first half in arr1
        for(int i=0;i<arr1.length;i++){

            arr1[i] = arr[i];
            k++;
        }
        //second half in arr2
        for(int i=0;i<arr2.length;i++){

            arr2[i] = arr[k];
            k++;
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1,arr2, arr);

    }

    public static void merge(int[] arr1, int[] arr2, int[] arr){
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j< arr2.length){

            if(arr1[i] <arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;

            }
            k++;
        }

        while (i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

}