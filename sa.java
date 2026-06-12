import java.util.Scanner;
class sage{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int s=num.nextInt();
        int a=num.nextInt();
        if(s>=20000 || a<=25){
          int l=num.nextInt();
          System.out.println("you required loan amount is "+l);
          if(l<=50000){
            System.out.println("you are eligible for loan");
          }
          else{
            System.out.println("you are not eligible for loan");
          }
        }
        else{
            System.out.println("you are not eligible for loan");
        }
    }
}