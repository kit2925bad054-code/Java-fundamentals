import java.util.Scanner;
class might{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        // String c=(a>b)?"a is greater":"b is greater";
        System.out.println((a>b)?"a is greater":"b is greater");
        
    }
}