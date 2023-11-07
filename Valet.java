public class Valet implements HotelService {
    private String PlateNumber;

    public Valet(String plateNumber)
    {
        this.PlateNumber = plateNumber;
    }

    @Override
    public void executeService()
    {
        pickUpVehicle(PlateNumber);
    }

    private void pickUpVehicle(String plateNumber)
    {
        // Implement valet parking logic here
        System.out.println("Valet service: Picking up the vehicle with plate number - " + plateNumber);
    }
}
