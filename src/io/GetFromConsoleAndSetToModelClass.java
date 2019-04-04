package io;

import model.IcalendarStorage;

import java.util.Scanner;

public class GetFromConsoleAndSetToModelClass {

    public static void getAndSetItems(IcalendarStorage icalendarStorage) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj nazwę wydarzenia:");
        String eN = s.nextLine();
        icalendarStorage.setEventName(eN);

        System.out.println("Podaj miejsce wydarzenia:");
        String eL = s.nextLine();
        icalendarStorage.setEventLocation(eL);

        System.out.println("Podaj opis wydarzenia:");
        String eD = s.nextLine();
        icalendarStorage.setEventDescription(eD);

        System.out.println("Podaj datę rozpoczęcia wydarzenia:");
        String eS = s.nextLine();
        icalendarStorage.setEventStart(eS);

        System.out.println("Podaj datę zakończenia wydarzenia:");
        String eE = s.nextLine();
        icalendarStorage.setEventEnd(eE);
    }
}
