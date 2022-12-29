public class BMW5 extends Car {

    public BMW5 (String model, int maxSpeed, int horsePower, int torque)
    {
        setModel(model);
        setMaxSpeed(maxSpeed);
        setHorsePower(horsePower);
        setTorque(torque);
    }

    public void param ()
    {
        System.out.println("Model: "+getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Horse Power: "+ getHorsePower());
        System.out.println("Torque: " + getTorque());
    }

}