package org.BookingSystem;

public class BookingSystem {
    static void main() {
        Office office = new Office();
        office.addRoom(new Room(Orthanc,10));
        office.addRoom(new Room(BaradDur, 20));
        office.addRoom(new Room(Study,30));
        office.addRoom(new Room(Angband, 40));

        Room room = office.findAvailableRoom(15);
        if(room == null){
            IO.println("No available rooms");
            return;
        }
        System.out.println("Available room: " + room.getRoomName());
        if(room.book())
            IO.println("Room booked successfully");
        else
            IO.println("Room booking failed");

        room = office.findAvailableRoom(20);
        IO.println("Available room: " + room.getRoomName());
        if(room.book())
            IO.println("Room booked successfully");
        else
            IO.println("Room booking failed");

        IO.println("Booked Rooms: ");
        var listOfBookedRooms = office.getBookedRooms();
        for(Room r : listOfBookedRooms)
            IO.println(room.getRoomName());

        IO.println("Available Rooms: ");
        var listOfAvailableRooms = office.getAvailableRooms();
        for(Room r : listOfAvailableRooms)
            IO.println(r.getRoomName());

    }
}
