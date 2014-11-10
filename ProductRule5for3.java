public class ProductRule5for3 implements Rule {

    public int calculatePrice(int price, int quantity) {
        if (price < 0 || quantity < 0) {
            return 0;
        }
        return ((quantity / 5) * 3 * price) + (quantity % 5 * price);

    }

}


