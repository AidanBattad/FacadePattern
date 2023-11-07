public class HouseKeeping implements HotelService {
    private int RoomNumber;

    public HouseKeeping(int roomNumber)
    {
        this.RoomNumber = roomNumber;
    }

    @Override
    public void executeService()
    {
        cleanRoom(RoomNumber);
    }

    private void cleanRoom(int roomNumber)
    {
        // Implement room cleaning logic here
        System.out.println("Housekeeping service: Room on Maintenance: " + roomNumber);
    }
}
