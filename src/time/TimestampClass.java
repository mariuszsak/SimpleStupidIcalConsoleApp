package time;

import model.IcalendarStorage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampClass {

    public void tstamp(IcalendarStorage icalendarStorage) {
        String tstamp = new SimpleDateFormat("yyyyMMdd'T'HHmmss").format(new Date());
        icalendarStorage.setTstamp(tstamp);
    }
}
