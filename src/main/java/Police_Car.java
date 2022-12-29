import Interfaces.*;

public class Police_Car implements Engine_work, Automatic_transmission, Headlights,
        Turn_signal_repeaters, Work_of_car_wipers, Police_flashing_lights, Cruise_control,
        Projector_on_the_windshield, Night_Vision_Camera, Gear_shift_on_the_steering_wheel, Service_oil_change,
        Service_replacement_of_sports_tires, Service_replacement_of_SportsDiscsAndPads
{

    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int torque;

    Police_Car ()
       {
            brand = "Any";
            model = "Any";
            maxSpeed = 0;
            horsePower = 0;
            torque = 0;
        }
/*
    Police_Car (String brand,String model, int maxSpeed, int horsePower, int torque)
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

    //work Automatic transmission
    public void turn_on_drive (){}
    public void turn_on_neutral(){}
    public void turn_on_reverse(){}
    public void turn_on_parking(){}


    //work Headlights
    public void switchON_Headlights(){}
    public void switchOFF_Headlights(){}

    //work signal repeaters
    public void switch_signal_repeaters_ON(){}
    public void switch_signal_repeaters_OFF(){}

    //Work of car wipers
    public void switchON_work_of_car_wipers(){}
    public void switchOFF_work_of_car_wipers(){}

    //Work Police_flashing_lights
    public void switchON_flashing_lights(){}
    public void switchOFF_flashing_lights(){}

    //Work Cruisecontrol
    public void switchON_cruise_control(){}
    public void switchOFF_cruise_control(){}

    //Work Projector on the windshield
    public void switchON_projector(){}
    public void switchOFF_projector(){}

    //Work Night Vision Camera
    public void switchON_Camera() {}
    public void switchOFF_Camera() {}

    //Work Gear shift on the steering wheel
    public void switchON_Gear_shift(){}
    public void switchOFF_Gear_shift(){}

    //Service oil change
    public void drain_the_old_oil() {}
    public void change_filter() {}
    public void pour_new_oil() {}

    //Service_replacement_of_sports_tires
    public void remove_old_tires(){}
    public void put_on_new_tires(){}

    //Service_replacement_of_SportsDiscsAndPads
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
