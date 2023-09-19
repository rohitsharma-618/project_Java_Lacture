import java.util.Scanner;

public class one {
    public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            int num = sc.nextInt();

//          if(num % 3 == 0  || num % 5 == 0  ){
//                System.out.println("Result founded = " +num );
//            }
        String result;
        result = (num % 2 == 0 ) ? "even": "odd";
                System.out.println(result);        }
}
