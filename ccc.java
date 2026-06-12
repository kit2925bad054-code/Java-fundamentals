import java.util.Scanner;
class monk{
    public static void main(String args[]){
        Scanner sir=new Scanner(System.in);
        String n=sir.nextLine();
        double s=sir.nextInt();
        sir.nextLine();
        String d=sir.nextLine();
        double sco=s/10;
        System.out.println("My name is "+n);
        System.out.println("My score is "+sco);
        System.out.println("My department is "+d);
    }
}
