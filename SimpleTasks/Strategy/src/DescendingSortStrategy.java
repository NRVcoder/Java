import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingSortStrategy implements IStrategy {

    @Override
    public Collection<Integer> Sort(Collection<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
    }
}
