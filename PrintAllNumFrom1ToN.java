public class PrintAllNumFrom1ToN {

    public static void main(String args[]){

        int n= 6;
        printN(n);
    }

    public static void printN(int n){

        if(n==1){
            System.out.print(n+" ");
            return;
        }

        printN(n-1);
        System.out.print(n+" ");
    }
}
