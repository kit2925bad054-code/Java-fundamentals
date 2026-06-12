import java.util.Scanner;
class doctor{
    public static void main(String[] args){
        int[] num=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            num[i]=scan.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }
     }
}
