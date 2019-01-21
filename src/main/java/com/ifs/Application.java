package com.ifs;

import com.ifs.formatters.CSVFormatter;
import com.ifs.formatters.Formatter;
import com.ifs.formatters.HTMLFormatter;
import com.ifs.formatters.JSONFormatter;

public class Application {
    public static void main(String[] args) {
        // Parse the booking code into an instance of Booking
        Booking booking = Booking.parse(args[0]);

        // Get the right formatter
        Formatter formatter = getFormatter(args[1]);

        // Use the static method of the correct formatter to
        // return the desired formatted string
        System.out.println(formatter.format(booking));
    }

    public static Formatter getFormatter(String name) {
        switch (name) {
            case "json":
                return new JSONFormatter();
            case "html":
                return new HTMLFormatter();
            default:
                return new CSVFormatter();
        }
    }
}
