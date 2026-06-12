import java.util.Scanner;
class marks{
    public static void main(String args[]){
        Scanner score=new Scanner(System.in);
        int a=score.nextInt();
        if(a<49){
            System.out.println("you need to improve");
        }
        if(50<a && a<69){
            System.out.println("good job");
        }
        else{
            System.out.println("excellent performance");
        }
    }
}