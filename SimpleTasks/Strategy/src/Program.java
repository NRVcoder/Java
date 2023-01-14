import java.util.Arrays;

public class Program {
    public static void main(String[] args)
    {
        var list = Arrays.asList(10, 2, -3);

        var calculationEngine = new CalculationEngine(list);

        calculationEngine.Sort();
        calculationEngine.Print();

        var strategy = new DescendingSortStrategy();
        calculationEngine.SetStrategy(strategy);

        calculationEngine.Sort();
        calculationEngine.Print();
    }
}