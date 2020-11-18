public class Printer implements IConnect {

    public String print(String data){
        return "printing: " + data;
    }

    public String connect(String string) {
        return "Connecting to " + string + " Network";
    }
}