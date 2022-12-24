package Interfaces;

public interface PaymentInter {
    bool IsAvailable { get; }
    void Pay(decimal amount);
}
