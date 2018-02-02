package unitTests;

import java.util.logging.Logger;

public class Shop {
    private static final Logger log = Logger.getLogger(String.valueOf(Shop.class));
    public static void main(String[] args) {

        Goods goods = new Goods();
        IBook iBook = new IBook();
        log.info(String.valueOf(iBook.getMark()));
        goods.setPrice(goods.actuallyPrice);
        int sale = goods.generateSale();
        goods.voidmethod(sale);
        double saleprice =goods.calculatePriceWithSale(sale,goods.getPrice());
        goods.getInfo(saleprice,sale);
    }
}
