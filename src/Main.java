import model.IcalendarStorage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    IcalendarStorage icalendarStorage = new IcalendarStorage();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.setAllValues();
        main.saveICalendarItem();
    }


    private void getItem() {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj nazwę wydarzenia:");
        String eN = s.nextLine();
        icalendarStorage.setEventName(eN);

        System.out.println("Podaj miejsce  wydarzenia:");
        String eL = s.nextLine();
        icalendarStorage.setEventLocation(eL);

        System.out.println("Podaj miejsce  wydarzenia:");
        String eD = s.nextLine();
        icalendarStorage.setEventDescription(eD);

        System.out.println("Podaj datę rozpoczęcia wydarzenia:");
        String eS = s.nextLine();
        icalendarStorage.setEventStart(eS);

        System.out.println("Podaj datę zakończenia wydarzenia:");
        String eE = s.nextLine();
        icalendarStorage.setEventEnd(eE);
    }


    private void generateUUID() {
        UUID uuid = UUID.randomUUID();
        icalendarStorage.setUuid(uuid);
    }

    private void setAllValues() {
        getItem();
        generateUUID();
    }

    private void tstamp() {
        String TSTAMP = new SimpleDateFormat("yyyyMMdd'T'HHmmss").format(new Date());
        icalendarStorage.setTstamp(TSTAMP);
    }

    private void saveICalendarItem() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("out.ics"));

        pw.write("BEGIN:VCALENDAR\n");
        pw.write("VERSION:2.0\n");
        pw.write("PRODID:MS\n");
        pw.write("BEGIN:VEVENT\n");
        pw.write(icalendarStorage.getUuid() + "n");
        pw.write(icalendarStorage.getTstamp() + "n");
        pw.write(icalendarStorage.getEventStart() + "n");
        pw.write(icalendarStorage.getEventEnd() + "n");
        pw.write(icalendarStorage.getEventName() + "n");
        pw.write(icalendarStorage.getEventLocation() + "n");
        pw.write(icalendarStorage.getEventDescription() + "n");
        pw.write("END:VEVENT\n");
        pw.write("END:VCALENDAR\n");

        pw.close();
    }

}
