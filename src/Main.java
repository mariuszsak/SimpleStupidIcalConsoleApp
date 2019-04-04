import io.GetFromConsoleAndSetToModelClass;
import io.SaveToFileClass;
import model.IcalendarStorage;
import time.TimestampClass;
import uuid.UUIDClass;

import java.io.IOException;

public class Main {
    IcalendarStorage icalendarStorage = new IcalendarStorage();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.setAllValues();
        main.save();
    }


    private void setAllValues() {
        GetFromConsoleAndSetToModelClass getFromConsoleAndSetToModelClass = new GetFromConsoleAndSetToModelClass();
        getFromConsoleAndSetToModelClass.getAndSetItems(icalendarStorage);

        TimestampClass timestampClass = new TimestampClass();
        timestampClass.tstamp(icalendarStorage);

        UUIDClass uuidClass = new UUIDClass();
        uuidClass.generateUUID(icalendarStorage);
    }

    private void save() throws IOException {
        SaveToFileClass saveToFileClass = new SaveToFileClass();
        saveToFileClass.saveICalendarItem(icalendarStorage);
    }
}
