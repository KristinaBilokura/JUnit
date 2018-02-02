package unitTests;
import java.io.PrintStream;
import java.util.Random;
import java.util.logging.Logger;

public class Goods {
    private static final Logger log = Logger.getLogger(String.valueOf(Goods.class));
    public static boolean trueFalse;
    private String nameOfProduct = "Table";
    private int sale ;
    private double price = 199.99;
    private String currency = "Euro";
    double actuallyPrice =250;
    public double getPrice() {
        return price;
    }
    public String getNameOfProduct() {

        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }


    public void setPrice(double price) {
        this.price = price;
    }
    public  int generateSale (){
        final Random random = new Random();
        int sale = random.nextInt(25);
        return sale;
    }
    private boolean privatemethod(String sale){
       return true;
    }
    public void voidmethod(int sale){
        if(sale>50){
            trueFalse=true;
        }
        else {
            trueFalse=false;
        }
    }

    public double calculatePriceWithSale(int sale ,double price ){
    double finalprice= price -((double)sale*price/100);
       return finalprice;
   }

   public void getInfo(double calc , int sale){
       log.info("You got "+ sale+"% sale " );
       log.info(String.format("Buy it now for %.1f %s.",calc,currency));
   }
}
