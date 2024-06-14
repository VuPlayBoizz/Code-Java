class Product{
    private String name;
    private String location;
    private int weight;

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }

    public String toString(){
        return name  + " (" + weight + "kg) " + "can be found from the " + location;
    }


}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Tape measure");
        Product p2 = new Product("Plaster", "home improvement section");
        Product p3 = new Product("Tyre", 5);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
