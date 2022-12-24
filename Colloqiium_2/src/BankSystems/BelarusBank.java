package BankSystems;
import Interfaces;
public class BelarusBank {

        public class BelKartPayment : PaymentInter
        {
            public bool IsAvailable
            {
                get
                {
                    return true;
                }
            }

            public void Pay(decimal amount)
            {
                throw new NotImplementedException();
            }
        }
    }

}
