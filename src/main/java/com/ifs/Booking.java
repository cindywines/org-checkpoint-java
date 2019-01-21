package com.ifs;

public class Booking {

    private RoomTypes roomType;
    private String roomNumber;
    private String startTime;
    private String endTime;

    enum RoomTypes {
        CONFERENCE_ROOM ("Conference Room"),
        SUITE ("Suite"),
        AUDITORIUM ("Auditorium"),
        CLASSROOM ("Classroom");

        private final String roomType;

        RoomTypes(String theType) {
            this.roomType = theType;
        }

        public String getRoomType() {
            return roomType;
        }
    }

    public Booking(RoomTypes roomType, String roomNumber, String startTime, String endTime) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static Booking parse(String bookingCode) {

        // Split booking code into sections via the hyphens
        String[] arrOfProps = bookingCode.split("-");

        // Get room code and decipher the room type
        // based on the first character of the string
        Character roomCodeChar = arrOfProps[0].charAt(0);
        RoomTypes roomType = decipherRoomType(roomCodeChar);

        // Get the room number
        String roomNumber = arrOfProps[0].substring(1, arrOfProps[0].length());

        // Get the "start time"
        String fromTime = arrOfProps[1];

        // Get the "end time"
        String untilTime = arrOfProps[2];


        return new Booking(roomType, roomNumber, fromTime, untilTime);
    }

    public static RoomTypes decipherRoomType(char c) {
        switch (c) {
            case 'a':
                return RoomTypes.AUDITORIUM;
            case 'r':
                return RoomTypes.CONFERENCE_ROOM;
            case 's':
                return RoomTypes.SUITE;
            case 'c':
                return RoomTypes.CLASSROOM;
            default:
                return null;

        }
    }

    public String getRoomTypes() {
        return roomType.getRoomType();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
