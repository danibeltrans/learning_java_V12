import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CompactNumberFormats {
    public static void main(String[] args) {

        /**
         *              US       German
         *  1000        1K          1.000
         *  1000000     1M          1 Mio.
         *
         */

        NumberFormat shortFN= NumberFormat
                .getCompactNumberInstance(new Locale("de", "DE"), NumberFormat.Style.LONG);
                //.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);


        String shortFor = shortFN.format(1000000);

        System.out.println(shortFor);

    }
}
