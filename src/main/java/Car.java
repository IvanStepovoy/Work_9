import Interfaces.*;

public class Car implements Engine_work, Automatic_transmission, Headlights,
        Turn_signal_repeaters, Work_of_car_wipers, Electric_seats, Heated_seats,
        Cruise_control, Refrigerator, Projector_on_the_windshield, Night_Vision_Camera,
        Service_oil_change, Service_replacement_of_ordinary_tires, Service_replacement_of_ordinaryDiscsAndPads
{
    private String brand;
    private String model;
    private int maxSpeed;
    private int horsePower;
    private int torque;

 Car ()
    {
        brand = "Any";
        model = "Any";
        maxSpeed = 0;
        horsePower = 0;
        torque = 0;
    }

    Car (String brand, int maxSpeed, int horsePower, int torque)
    {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.torque = torque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getTorque() {
        return torque;
    }

    //Engine_work
    public void startEngine(){}
    public void stopEngine(){}


    //work Automatic transmission
    public void turn_on_drive (){}
    public void turn_on_neutral(){}
    public void turn_on_reverse(){}
    public void turn_on_parking(){}


    //work Headlights
    public void switchON_Headlights (){}
    public void switchOFF_Headlights (){}

    //work signal repeaters
    public void switch_signal_repeaters_ON (){}
    public void switch_signal_repeaters_OFF (){}

    //Work of car wipers
    public void switchON_work_of_car_wipers (){}
    public void switchOFF_work_of_car_wipers (){}

    //Work Electric seats
    public void moving_forward() {}
    public void moving_back() {}
    public void moving_up() {}
    public void moving_down() {}
    public void lower_the_seat_back() {}
    public void raise_the_seat_back() {}

    //Work Heated seats
    public void switchON_heat_seat() {}
    public void switchOFF_heat_seat() {}

    //Work Cruisecontrol
    public void switchON_cruise_control() {}
    public void switchOFF_cruise_control() {}

    //Work Refrigerator
    public void switchON_refrigerator() {}
    public void switchOFF_refrigerator() {}

    //Work Projector on the windshield
    public void switchON_projector() {}
    public void switchOFF_projector() {}

    //Work Night Vision Camera
     public void switchON_Camera() {}
     public void switchOFF_Camera() {}

    //Service oil change
    public void drain_the_old_oil() {}
    public void change_filter() {}
    public void pour_new_oil() {}

    //Service_replacement_of_ordinary_tires
    public void remove_old_tires() {}
    public void put_on_new_tires() {}

    //Service_replacement_of_ordinaryDiscsAndPads
    public void remove_old_discs_and_pads() {}
    public void install_new_discs_and_pads() {}

    void showParam () {
        System.out.println();
        System.out.println("Model: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Horse Power: " + getHorsePower());
        System.out.println("Torque: " + getTorque());

    }


}

