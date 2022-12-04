package Devices;

public class Phone extends Device {
    public String producer;
    public String model;
   public Boolean isAndroid;
    public Double screenSize;


    public Phone(String producer, String model, Double screenSize, Integer id) {
        super(id, producer, model);

        this.screenSize = screenSize;

    }

    void turnOn() {
        System.out.println("naciśnij przycisk");
        System.out.println("czekaj");
        System.out.println("czekaj");
        System.out.println("czekaj");
        System.out.println("O! Mój telefon " + producer + " działa");

    }


}
