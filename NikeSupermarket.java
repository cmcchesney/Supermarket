public class NikeSupermarket implements Supermarket {

    @Override
    public int checkout(String items) {
        Product productA = new Product("A", 20, 0);
        Product productB = new Product("B", 50, 0, new ProductRule5for3());
        Product productC = new Product("C", 30, 0);

        int itemsLength = 0;

        if (items != null){
            itemsLength = items.length();
        }
        /**
         * Loop through product list and add up values.
         */
        for (int i = 0; i < itemsLength; i++) {
            if (items.charAt(i) == ('A')) {
                productA.addQuantity(1);
            } else if (items.charAt(i) == ('B')) {
                productB.addQuantity(1);
            } else if (items.charAt(i) == ('C')) {
                productC.addQuantity(1);
            }
        }

        return productA.getProductTotal() + productB.getProductTotal() + productC.getProductTotal();
    }
}
