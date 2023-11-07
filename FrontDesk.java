public class FrontDesk {
    public void reqValetService(String plateNumber)
    {
        HotelService valetService = new Valet(plateNumber);
        valetService.executeService();
    }

    public void reqHouseKeepingService(int roomNumber)
    {
        HotelService houseKeepingService = new HouseKeeping(roomNumber);
        houseKeepingService.executeService();
    }

    public void reqCartService(int numberOfCarts)
    {
        HotelService cartService = new Cart(numberOfCarts);
        cartService.executeService();
    }
}
