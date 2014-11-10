public class ProductRule2for1 implements Rule {

    public int calculatePrice(int price, int quantity) {
        if (price < 0 || quantity < 0) {
            return 0;
        }
        return ((quantity / 2) * price) + (quantity % 2 * price);

    }

}


