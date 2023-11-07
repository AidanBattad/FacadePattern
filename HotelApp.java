public class HotelApp {
    public static void main(String[] args)
    {
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.reqValetService("BAC234");
        frontDesk.reqHouseKeepingService(206);
        frontDesk.reqCartService(21);
    }}
