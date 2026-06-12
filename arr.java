import java.util.Scanner;
class find{
    public static void main(String[] args){
        int[] arr=new int[5];
        int sum=0;
        Scanner play=new Scanner(System.in);
        for(int i=0;i<5;i++){
             arr[i]=play.nextInt();
            }
        for(int i=0;i<5;i++){
            sum+=arr[i];
         }
         System.out.println(sum);
         
}
}
