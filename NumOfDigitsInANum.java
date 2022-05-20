public class NumOfDigitsInANum {


    public static void main(String args[]){

        int num= 10333;
       System.out.print(count(num));
    }

    public static int count(int num){
        //base case
        if(num<10) {
            return 1;
        }
        int val = 1+count(num/10);
        return val;
    }
}
