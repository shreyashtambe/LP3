    //This is a sample program to implement a fractional knapsack problem

    
public class LP3_ASS3 {


    public static void main(String[] args) {
        float sum=0f;
        int arr[][]= {{10,20,30},{60,100,120}};
        int w=50;
        int j=0;
        while(w>=0){

            float max = 0f;
            for(int i=0;i<3;i++) {

                if (((float) arr[1][i] / (float) arr[0][i]) > max) {

                    max= (float) arr[1][i] / (float) arr[0][i];
                    j=i;
                }
            }

            if(arr[0][j]>w){
                System.out.println(w*max+" part of "+j + " no is added ");
                sum += w*max;
                w=-1;
            }
            else{
                System.out.println(arr[1][j]+" part of "+j + " no is added ");
                w-=arr[0][j];
                sum += (float)arr[1][j];

                arr[1][j]=0;
            }


        }

        System.out.println(sum);
    }
}
