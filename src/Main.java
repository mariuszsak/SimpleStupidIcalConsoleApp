import model.IcalendarStorage;

import java.io.IOException;

import static io.GetFromConsoleAndSetToModelClass.getAndSetItems;
import static io.SaveToFileClass.saveICalendarItem;
import static time.TimestampClass.tstamp;
import static uuid.UUIDClass.generateUUID;

public class Main {
    IcalendarStorage icalendarStorage = new IcalendarStorage();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.setAllValues();
        main.save();
    }


    private void setAllValues() {
        getAndSetItems(icalendarStorage);
        tstamp(icalendarStorage);
        generateUUID(icalendarStorage);
    }

    private void save() throws IOException {
        saveICalendarItem(icalendarStorage);
    }
}
