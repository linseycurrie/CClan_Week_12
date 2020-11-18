import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
//    private ArrayList<Printer> devicesPrinter;

    public Network(String name){
        this.devices = new ArrayList<IConnect>();
//        this.devicesPrinter = new ArrayList<Printer>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        devices.add(device);
    }

//    public void connect(Printer printer){
//        devicesPrinter.add(printer);
//    }

    public void disconnectAll(){
        devices.clear();
//        devicesPrinter.clear();
    }
}