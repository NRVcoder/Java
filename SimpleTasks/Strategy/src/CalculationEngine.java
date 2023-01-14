import java.util.Collection;

public class CalculationEngine {
    private IStrategy strategy;
    private Collection<Integer> list;

    public CalculationEngine(Collection<Integer> list)
    {
        this.list = list;
        strategy = new AscendingSortStrategy();
    }

    public void SetStrategy(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void Sort()
    {
        list = strategy.Sort(list);
    }

    public void Print()
    {
        list.forEach(item -> System.out.print(item+" "));
        System.out.println();
    }
}

