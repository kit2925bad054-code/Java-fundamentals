import java.util.Scanner;
class gone{
    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        int a=m.nextInt();
        int b=m.nextInt();
        int c=m.nextInt();
        int d=m.nextInt();
        int e=m.nextInt();
        int sum=a+b+c+d+e;
        int avg=sum/5;
        System.out.println(+avg);
        if(avg<35){
            System.out.println("additional class is required");
        }else{
            System.out.println("you are good to go");
        }
            }
}