package model;

import java.util.UUID;

public class IcalendarStorage {

    private static String eventName;
    private static String eventStart;
    private static String eventEnd;
    private static UUID uuid;
    private static String tstamp;
    private static String eventLocation;
    private static String eventDescription;


    public IcalendarStorage() {
    }


    public IcalendarStorage(String eventName, String eventStart, String eventEnd, UUID uuid, String tstamp, String eventLocation, String eventDescription) {
        this.eventName = eventName;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.uuid = uuid;
        this.tstamp = tstamp;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventStart() {
        return eventStart;
    }

    public void setEventStart(String eventStart) {
        this.eventStart = eventStart;
    }

    public String getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(String eventEnd) {
        this.eventEnd = eventEnd;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTstamp() {
        return tstamp;
    }

    public void setTstamp(String tstamp) {
        this.tstamp = tstamp;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
}