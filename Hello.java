import java.util.Scanner ;
 
class Hello {

    public static void main(String [] args){
        System.out.println("hello world ");
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("enter number 2 : ");
        int b = sc.nextInt();
        Arithmatic.addNumbers(a , b);
    }

}