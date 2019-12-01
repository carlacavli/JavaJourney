package Day42.Inheritance;

public class Warehouse extends House {

    public int employees;

    public Warehouse(int rooms, double price) {
        super(rooms, price);
    }

    public void sell() {
        if (isNew()) {
            //sell
        } else {
            // repair
        }
    }

}
