package abc;
public class Pen 
{  
    String name; 
    String brand; 
    int size; 
    String colour; 
    public Pen(String name, String brand, int size, String colour) 
    { 
        this.name = name; 
        this.brand = brand; 
        this.size = size; 
        this.colour = colour; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBrand() 
    { 
        return brand; 
    } 
    public int getsize() 
    { 
        return size; 
    } 
    public String getColour() 
    { 
        return colour; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my pen name is "+ this.getName()+ ".\nMy brand,size and colour are " + this.getBrand()+", " + this.getsize()+ ", and "+ this.getColour() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Pen Butterflow = new Pen("Butterflow","ballpen", 5, "black"); 
        System.out.println(Butterflow.toString()); 
    } 
}

