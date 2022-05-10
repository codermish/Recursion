


public class AllSubsequencesofAString {

    public static void main(String args[]){

        String stringArr[] = findSubseq("abc");
        for(int i=0;i<stringArr.length;i++){
            System.out.print(stringArr[i] +" ");
        }
        System.out.println();

        System.out.print("length of arr "+ stringArr.length);


    }

    public static String[] findSubseq(String str){

        //base case
        if(str.length()==0){
            String  strArr[] ={""};
            return strArr;
        }

        //smaller problem

        String smallSubSeq[] = findSubseq( str.substring(1));

        String finalSubSeq[] = new String[2*smallSubSeq.length];
        int k=0;
        for(int i=0;i<smallSubSeq.length;i++){
            finalSubSeq[i] = smallSubSeq[i];
            k++;
        }

        for(int i=0; i<smallSubSeq.length && i<= str.length(); i++,k++){
            finalSubSeq[k] = str.charAt(0) + smallSubSeq[i];
        }
     return finalSubSeq;

    }
}
