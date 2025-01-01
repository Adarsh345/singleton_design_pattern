package driver;

public class ShyamuDriver implements Driver{

    /*
    * Eger way to initialize the Shayamu driver object.
    * */
    private static ShyamuDriver shyamuDriver  = new ShyamuDriver();

    public static ShyamuDriver getShyamuDriver(){
        return shyamuDriver;
    }

    @Override
    public String drive() {
        return String.format("%s %s", shyamuDriver.getClass().getName(), shyamuDriver.hashCode());
    }
}
