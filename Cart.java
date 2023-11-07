public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void executeService()
    {
        requestCart(numberOfCarts);
    }

    private void requestCart(int numberOfCarts)
    {
        // Implement luggage cart request logic here
        System.out.println("Cart service: Requests " + numberOfCarts + " cart(s)");
    }
}
