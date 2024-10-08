package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        // Date into String

        Date date = new Date();
        System.out.println(date);

        // how to convert Date in to String in my desired format
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);

        System.out.println(dateStr);

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println(dateStr0);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);
    }
}
