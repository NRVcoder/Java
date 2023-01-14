import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

public class AscendingSortStrategy implements IStrategy {
    public Collection<Integer> Sort(Collection<Integer> list) {
        return  list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }
}

