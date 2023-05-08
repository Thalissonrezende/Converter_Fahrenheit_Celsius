import org.junit.Test;
public class TesteFtoC {
   
    @Test 
    public  void testaFtoC(){
        FtoC tFtoC= new FtoC();
      double F = tFtoC.F(71);
      double C = tFtoC.C(F-32)/1.8;
      System.out.println("teste" + C);

    }
}
