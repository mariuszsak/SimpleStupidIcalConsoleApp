package uuid;

import model.IcalendarStorage;

import java.util.UUID;

public class UUIDClass {

    public void generateUUID(IcalendarStorage icalendarStorage) {
        icalendarStorage.setUuid(UUID.randomUUID());
    }
}
