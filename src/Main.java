import driver.Driver;
import driver.RamuDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Driver ramuDriver =  RamuDriver.getRamuDriver();
        Driver ramuDriver2 = RamuDriver.getRamuDriver();
        Driver ramuDriver3 = RamuDriver.getRamuDriver();

        System.out.println(ramuDriver.drive());
        System.out.println(ramuDriver2.drive());
        System.out.println(ramuDriver3.drive());

    }
}