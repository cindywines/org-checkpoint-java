package com.ifs.formatters;

import com.ifs.Booking;

public class CSVFormatter implements Formatter {
    public String format(Booking booking) {
        StringBuilder s = new StringBuilder();
        s.append("type,room number,start time,end time\n");
        s.append(
                booking.getRoomTypes() + "," +
                booking.getRoomNumber() + "," +
                booking.getStartTime() + "," +
                booking.getEndTime()
        );
        return s.toString();
    }
    //type,room number,start time,end time
    //Auditorium,111,08:30am,11:00am
}
