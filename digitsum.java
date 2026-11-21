import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {

        int a = 52014;
        int t=a;
        int sum=0;
        while(t>0){
            sum+=t%10;
            t/=10;
        }
        System.out.print("The digit sum for "+a+" is: "+sum);
    }
}
