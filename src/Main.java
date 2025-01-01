import driver.Driver;
import driver.RamuDriver;
import driver.ShyamuDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Driver ramuDriver =  RamuDriver.getRamuDriver();
        Driver ramuDriver2 = RamuDriver.getRamuDriver();
        Driver ramuDriver3 = RamuDriver.getRamuDriver();

        Driver shayamuDriver1 = ShyamuDriver.getShyamuDriver();
        Driver shayamuDriver2 = ShyamuDriver.getShyamuDriver();
        Driver shayamuDriver3 = ShyamuDriver.getShyamuDriver();

        System.out.println(ramuDriver.drive());
        System.out.println(ramuDriver2.drive());
        System.out.println(ramuDriver3.drive());

        System.out.println(shayamuDriver1.drive());
        System.out.println(shayamuDriver2.drive());
        System.out.println(shayamuDriver3.drive());

    }
}