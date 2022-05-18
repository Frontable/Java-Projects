public class Pizza extends Item{
    private String size;
    private boolean sauce;
    public String getSize(){
        return  size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public boolean getSauce(){
        return  sauce;
    }
    public void setSauce(boolean sauce){
        this.sauce = sauce;
    }
    public Pizza(String name, double price, String size, boolean sauce){
        super(name, price);
        this.size = size;
        this.sauce = sauce;
    }
    public Pizza(){
        super();
    }
    public String toString(){
        if (sauce == true){
            return "Pizza " + super.toString()+ " " + this.size + " with sauce ";
        }else {
            return "Pizza " + super.toString() + " " + this.size + " with no sauce ";

        }

    }
}
