public class GeometricSum {

    public static void main(String args[]){

        System.out.print(geoSum(3,0));

    }

    public static double geoSum(int k, double sum){

        if(k==0){
            return 1;
        }

        double val = power(k);
        sum = sum+ 1/val+ geoSum(k-1,sum);
        return sum;


    }

    public static double power(int k){
        if(k==0){
            return 1;
        }
        double val = 2*power(k-1);

        return val;

    }
}

