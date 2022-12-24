package BankSystems;
import Interfaces;
public class BelInvest {
    public class Bellnvest  : PaymentInter

    PaymentInter {
        public bool IsAvailable
        {
            get
            {
                return true;
            }
        }

        public void Pay (decimal amount)
        {
            throw new NotImplementedException();
        }
    }
}
