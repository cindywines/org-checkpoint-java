package com.ifs.formatters;

import com.ifs.Booking;

public class JSONFormatter implements Formatter {
    public String format(Booking booking) {
        StringBuilder s = new StringBuilder();
        s.append("{\n");
        s.append("\"type\": " + booking.getRoomTypes() + ",\n");
        s.append("\"roomNumber\": " + booking.getRoomNumber() + ",\n");
        s.append("\"startTime\": " + booking.getStartTime() + ",\n");
        s.append("\"endTime\": " + booking.getEndTime() + ",\n");
        s.append("}");
        return s.toString();
    }
}

/*
{
  "type": "Suite",
  "roomNumber": 111,
  "startTime": "08:30am",
  "endTime": "11:00am"
}
*/
