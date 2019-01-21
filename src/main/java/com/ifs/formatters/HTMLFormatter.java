package com.ifs.formatters;

import com.ifs.Booking;

public class HTMLFormatter implements Formatter {
    public String format(Booking booking) {
        StringBuilder s = new StringBuilder();
        s.append("<dl>\n");
        s.append("\t<dt>Type</dt><dd>" + booking.getRoomTypes() + "</dd>\n");
        s.append("\t<dt>Room Number</dt><dd>" + booking.getRoomNumber() + "</dd>\n");
        s.append("\t<dt>Start Time</dt><dd>" + booking.getStartTime() + "</dd>\n");
        s.append("\t<dt>End Time</dt><dd>" + booking.getEndTime() + "</dd>\n");
        s.append("</dl>\n");
        return s.toString();
    }

    /*
    *
*       <dl>
          <dt>Type</dt><dd>Conference Room</dd>
          <dt>Room Number</dt><dd>111</dd>
          <dt>Start Time</dt><dd>08:30am</dd>
          <dt>End Time</dt><dd>11:00am</dd>
        </dl>
    * */
}
