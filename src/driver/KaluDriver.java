package driver;

public class KaluDriver implements Driver{

    private static KaluDriver kaluDriver;

    /*
     * The Kalu driver operates under specific conditions:
     * - Kalu can only drive one family member's car at a time.
     * - When Kalu is busy with one family member, he is unavailable for others.
     *
     * This means the Kalu driver behaves like a synchronized resource,
     * allowing only one thread (family member) to access him at any given time.
     */
    public static KaluDriver getKaluDriver(){
        if(kaluDriver == null){
            synchronized (KaluDriver.class){
                if(kaluDriver == null){
                    kaluDriver = new KaluDriver();
                }
            }
        }
        return kaluDriver;
    }

    private KaluDriver( ){

    }


    @Override
    public String drive() {
        return String.format("[%s] [%s]",kaluDriver.getClass().getName(), kaluDriver.hashCode());
    }
}
