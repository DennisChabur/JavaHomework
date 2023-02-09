
import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String model;
    private int RAM;
    private String OS;
    private int price;
    private int HDvalue;

    public Notebook(String model, int RAM, String OS, int price, int HDvalue) {
        this.model = model;
        this.RAM = RAM;
        this.OS = OS;
        this.price = price;
        this.HDvalue = HDvalue;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("model");
        list.add("RAM");
        list.add("OS");
        list.add("price");
        list.add("HDvalue");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + model + "): " +
                "количество опретивной памяти:" + RAM +
                ", операционная система: " + OS + '\'' +
                ", цена: " + price +
                ", жесткач: " + HDvalue;
    }

    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHDvalue() {
        return HDvalue;
    }

    public void setHDvalue(int HDvalue) {
        this.HDvalue = HDvalue;
    }
}