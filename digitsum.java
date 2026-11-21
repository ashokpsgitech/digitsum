import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int t=a;
        int sum=0;
        while(t>0){
            sum+=t%10;
            t/=10;
        }
        System.out.print("The digit sum for "+a+" is: "+sum);
        sc.close();
    }
}
