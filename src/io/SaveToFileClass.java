package io;

import model.IcalendarStorage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveToFileClass {

    public void saveICalendarItem(IcalendarStorage icalendarStorage) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("out.ics"));

        pw.write("BEGIN:VCALENDAR\n");
        pw.write("VERSION:2.0\n");
        pw.write("PRODID:MS\n");
        pw.write("BEGIN:VEVENT\n");
        pw.write(icalendarStorage.getUuid() + "\n");
        pw.write(icalendarStorage.getTstamp() + "\n");
        pw.write(icalendarStorage.getEventStart() + "\n");
        pw.write(icalendarStorage.getEventEnd() + "\n");
        pw.write(icalendarStorage.getEventName() + "\n");
        pw.write(icalendarStorage.getEventLocation() + "\n");
        pw.write(icalendarStorage.getEventDescription() + "\n");
        pw.write("END:VEVENT\n");
        pw.write("END:VCALENDAR\n");

        pw.close();
    }

}
