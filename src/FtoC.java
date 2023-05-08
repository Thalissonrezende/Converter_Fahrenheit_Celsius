import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double C, F;
          System.out.println("Qual a temperatura em Fº?");
          F = input.nextDouble();
          C = (F-32)/1.8;
          System.out.println("Convertendo em Cº: " + C);
          input.close();
    }

    public double F(double F) {
        return F;
    }

    public double C(double C) {
        return C;
    }
}
