import java.util.Scanner;

public class BMW_ALPINA_B7 extends Car
{
    /* public BMW_ALPINA_B7 (String brand, int maxSpeed, int horsePower, int torque)
    {
        setBrand(brand);
        setMaxSpeed(maxSpeed);
        setHorsePower(horsePower);
        setTorque(torque);
    }
    public void param ()
    {
        System.out.println("Model: "+getBrand());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Horse Power: "+ getHorsePower());
        System.out.println("Torque: " + getTorque());
    }*/

    public BMW_ALPINA_B7()
    {
        setModel("BMW ALPINA B7");
    }

    public void enterParams () {
        try {

            System.out.println();
            System.out.println("We can make a car for you with any parameters you want");
            System.out.println("Please, enter the desired parameters of your DREAM CAR!");
            System.out.println();

            System.out.print("Please, enter the desired parameters: MaxSpeed: ");
            int inpMaxSpeed = new Scanner(System.in).nextInt();
            setMaxSpeed(inpMaxSpeed);
            System.out.println();

            System.out.print("Please, enter the desired parameters: Horse Power: ");
            int inpHorsePower = new Scanner(System.in).nextInt();
            setHorsePower(inpHorsePower);
            System.out.println();

            System.out.print("Please, enter the desired parameters: Torque: ");
            int inpTorque = new Scanner(System.in).nextInt();
            setTorque(inpTorque);
            System.out.println();

            System.out.println("Model: BMW ALPINA B7" );
            System.out.println("Max Speed: " + getMaxSpeed());
            System.out.println("Horse Power: " + getHorsePower());
            System.out.println("Torque: " + getTorque());
            System.out.println("It will coast you 1 000 000 $");

        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }









}