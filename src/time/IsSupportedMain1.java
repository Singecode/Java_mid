package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int now1 = now.get(ChronoField.SECOND_OF_DAY);
        System.out.println("now1 = " + now1);
        
    }
}
