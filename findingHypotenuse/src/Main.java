import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int a, b;
        double c, u, area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a edge: ");
        int aEdge = scanner.nextInt();


        System.out.println("Enter b edge: ");
        int bEdge = scanner.nextInt();

        c = Math.sqrt( (aEdge * aEdge) + (bEdge * bEdge) );

        System.out.println("Hypotenuse is: " + c);

        u = (aEdge+bEdge+c) / 2;

        area = Math.sqrt(u * (u-aEdge)*(u-bEdge)*(u-c));

        System.out.println("Area is: " + area);


    }
}
