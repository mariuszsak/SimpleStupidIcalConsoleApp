package io;

import model.IcalendarStorage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveToFileClass {

    public static void saveICalendarItem(IcalendarStorage icalendarStorage) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("out.ics"));

        pw.write("BEGIN:VCALENDAR\n");
        pw.write("VERSION:2.0\n");
        pw.write("PRODID:MS\n");
        pw.write("BEGIN:VEVENT\n");
        pw.write("UID:"+icalendarStorage.getUuid() + "\n");
        pw.write("DTSTAMP:"+icalendarStorage.getTstamp() + "\n");
        pw.write("DTSTART:"+icalendarStorage.getEventStart() + "\n");
        pw.write("DTEND:"+icalendarStorage.getEventEnd() + "\n");
        pw.write("SUMMARY:"+icalendarStorage.getEventName() + "\n");
        pw.write("LOCATION:"+icalendarStorage.getEventLocation() + "\n");
        pw.write("DESCRIPTION:"+icalendarStorage.getEventDescription() + "\n");
        pw.write("END:VEVENT\n");
        pw.write("END:VCALENDAR\n");

        pw.close();
    }

}
