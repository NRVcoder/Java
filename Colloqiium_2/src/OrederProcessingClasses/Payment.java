package OrederProcessingClasses;

public abstract class Payment {
    protected State _order;

    public Payment(State order)
    {
        _order = order;
    }

    public decimal CalculateCost()
    {
        var priceBeforeDiscount = CalculatePriceBeforeDiscount();
        var discount = DiscountCalculation();

        BonusAccrual();

        var finalCost = priceBeforeDiscount - discount;
        return finalCost;
    }

    protected decimal CalculatePriceBeforeDiscount()
    {

        return 0;
    }

    protected abstract decimal DiscountCalculation();
    protected abstract void BonusAccrual();
}
}
