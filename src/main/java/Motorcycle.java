import Interfaces.*;

public class Motorcycle implements Engine_work, Manual_transmission, Headlights,
        Turn_signal_repeaters, Service_oil_change, Service_replacement_of_motorcycle_tires,
        Service_replacement_of_motorcycleDiscsAndPads
{

    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int torque;

    Motorcycle ()
       {
            brand = "Any";
            model = "Any";
            maxSpeed = 0;
            horsePower = 0;
            torque = 0;
        }
/*
    Motorcycle (String brand,String model, int maxSpeed, int horsePower, int torque)
    {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.torque = torque;
    }
*/
    //Engine_work
    public void startEngine(){}
    public void stopEngine(){}

    //work Manual transmission
    public void turn_on_first_gear (){}
    public void turn_on_second_gear (){}
    public void turn_on_third_gear (){}
    public void turn_on_fourth_gear (){}
    public void turn_on_fifth_gear (){}
    public void turn_on_neutral_gear (){}
    public void turn_on_reverse_gear (){}

    //work Headlights
    public void switchON_Headlights(){}
    public void switchOFF_Headlights(){}

    //work signal repeaters
    public void switch_signal_repeaters_ON(){}
    public void switch_signal_repeaters_OFF(){}

    //Service oil change
    public void drain_the_old_oil() {}
    public void change_filter() {}
    public void pour_new_oil() {}

    //Service_replacement_of_motorcycle_tires
    public void remove_old_tires(){}
    public void put_on_new_tires(){}

    //Service_replacement_of_motorcycleDiscsAndPads
    public void remove_old_discs_and_pads(){}
    public void install_new_discs_and_pads(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }
    void showParam () {
        System.out.println();
        System.out.println("Model: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Horse Power: " + getHorsePower());
        System.out.println("Torque: " + getTorque());
    }
}
