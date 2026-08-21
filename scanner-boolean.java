import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Did you pass exam?");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        if(b==true){
            System.out.println("Passed Exam");
        }else if(b==false){
            System.out.println("Failed");
        }
    }
}