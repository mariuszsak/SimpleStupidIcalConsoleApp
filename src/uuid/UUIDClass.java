package uuid;

import model.IcalendarStorage;

import java.util.UUID;

public class UUIDClass {

    public static void generateUUID(IcalendarStorage icalendarStorage) {
        icalendarStorage.setUuid(UUID.randomUUID());
    }
}
