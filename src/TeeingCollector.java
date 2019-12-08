import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {

    public static void main(String[] args) {

        var ints = Stream.of(20,30,40);

        long average = ints
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::valueOf),
                        Collectors.counting(),
                        (sum, count) -> sum/count
                )
        );

    }
}
