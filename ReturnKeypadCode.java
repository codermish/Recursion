public class ReturnKeypadCode {

    public static void main(String args[]){

        String res[] = getKeypadCode(234);

        System.out.println("size "+ res.length);

        for(int i=0;i<res.length;i++){

            System.out.print(res[i] +" ");
        }
    }

    //can use map and db
    public static String[] helper(int n){
        String arrDefault[] = {""};
        switch (n){

            case 2:
                String arr[] ={"a","b","c"};
                return arr;
            case 3:
                String arr1[] ={"d","e","f"};
                return arr1;
            case 4:
                String arr2[] ={"g","h","i"};
                return arr2;
            case 5:
                String arr3[] ={"j","k","l"};
                return arr3;
            case 6:
                String arr4[] ={"m","n","o"};
                return arr4;
            case 7:
                String arr5[] ={"p","q","r","s"};
                return arr5;
            case 8:
                String arr6[] ={"t","u","v"};
                return arr6;
            case 9:
                String arr7[] ={"w","x","y","z"};
                return arr7;
        }

        return arrDefault;

    }

    public static String[] getKeypadCode(int num){
        if(num ==0){
            String arr[] = {""};
            return arr;
        }

        String smallKeypadCode[] = getKeypadCode(num/10);
        String arrSingle[] = helper(num%10);
        String finalRes[] = new String[smallKeypadCode.length * arrSingle.length];
        int k=0;
        for(int i=0;i< smallKeypadCode.length;i++){

            for(int j=0;j< arrSingle.length;j++){

                finalRes[k] = smallKeypadCode[i] + arrSingle[j];
                k++;
            }
        }

        return finalRes;

    }
}
