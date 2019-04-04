package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampClass {

    private String tstamp() {
        String tstamp = new SimpleDateFormat("yyyyMMdd'T'HHmmss").format(new Date());
        return tstamp;
    }
}
