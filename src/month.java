import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();


        switch (month){
            case 1 :
                System.out.println("THIS MONTH NUMBER IS - 'JANUARY'");
                break;
            case 2 :
                System.out.println("THIS MONTH NUMBER IS - 'FEBRUARY'");
                break;
            case 3 :
                System.out.println("THIS MONTH NUMBER IS - 'MARCH'");
                break;
            case 4:
                System.out.println("THIS MONTH NUMBER IS - 'APRIL'");
                break;
            case 5 :
                System.out.println("THIS MONTH NUMBER IS - 'MAY'");
                break;
            case 6:
                System.out.println("THIS MONTH NUMBER IS - 'JUNE'");
                break;
            case 7 :
                System.out.println("THIS MONTH NUMBER IS - 'JULY'");
                break;
            case 8 :
                System.out.println("THIS MONTH NUMBER IS - 'AUGUST'");
                break;
            case 9 :
                System.out.println("THIS MONTH NUMBER IS - 'SEPTEMBER'");
                break;
                case 10 :
                System.out.println("THIS MONTH NUMBER IS - 'OCTOBER'");
                break;
            case 11 :
                System.out.println("THIS MONTH NUMBER IS - 'NOVEMBER'");
                break;
            case 12 :
                System.out.println("THIS MONTH NUMBER IS - 'DECEMBER'");
                break;


            default:
                System.out.println("INVALID MONTH NUMBER !!!");

        }
    }
}
