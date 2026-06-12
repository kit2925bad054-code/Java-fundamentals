import java.util.Scanner;
class dark{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("THE NUMBER IS DIVISIBLE BY 3 AND 5");
        }
        else{
            System.out.println("THE NUMBER IS NOT DIVISIBLE BY 3 AND 5");
        }
    }
}