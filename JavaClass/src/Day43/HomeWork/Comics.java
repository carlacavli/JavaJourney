package Day43.HomeWork;

public class Comics extends Book {


    public Comics(String title, String author, int numofpages, double price) {
        super(title, author, numofpages, price);
    }



    @Override
    public double price()
    {
        return super.price();
    }
}