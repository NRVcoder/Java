import java.math.BigDecimal;
import java.math.BigInteger;

public class Big {
    public static void main(String args[]) {
    BigInteger big = new BigInteger("123");
    BigInteger big2 = new BigInteger("1238459837495739485798745983475983958347599347593487");
    System.out.println(big.multiply(big2));
    System.out.println(big.add(big2));
    System.out.println(big2.divide(big));
    System.out.println(big2.mod(big));

        BigDecimal bigpoint = new BigDecimal("123.5");
    }
}
