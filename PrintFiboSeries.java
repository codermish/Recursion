public class PrintFiboSeries {


    public static void main(String args[]){
        int num =8;
     System.out.print(fibo(num));
    }

    public static int fibo(int num){

        if(num ==0  || num==1){
            return num;
        }

        int val = fibo(num-1) + fibo(num-2);
        return val;




    }
}
