import java.util.*;

public class IfElse {
    public static void main(String[] args){
        System.out.println("podaj liczbe");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("podana liczba jest parzysta");
        }else{System.out.println("podana liczba jest nieparzysta");
        }
    }


}
