package driver;

public class RamuDriver implements Driver {

    private static RamuDriver ramuDriver;

    private RamuDriver(){

    }

    public static RamuDriver getRamuDriver(){
        if(ramuDriver == null){
            ramuDriver = new RamuDriver();
        }
        return ramuDriver;
    }

    @Override
    public String drive() {

        String driving = String.format(
                "[%s] [%s]", "Ramu is driving the car ", ramuDriver.hashCode());

        return driving;
    }
}
