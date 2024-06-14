import java.util.Scanner;

abstract class Car{
    protected double price;
    protected int year;
    public static double maxPrice = 0;

    public Car(double price, int year){
        this.price = price;
        this.year = year;
    }

    public String toString() {
        return String.format("Price: %,.2f VND | Year: %d", calculateSalePrice(), year);
    }

    public abstract double calculateSalePrice();
}

class ClassicCar extends Car{
    
    public ClassicCar(double price, int year){
        super(price, year);
    }

    public double calculateSalePrice(){
        double salePrice = this.price * 1.12 + 20000000;
        if(salePrice > maxPrice){
            maxPrice = salePrice;
        }
        return salePrice;    
    }
}

class SportCar extends Car{
    public SportCar(double price, int year){
        super(price, year);
    }

    public double calculateSalePrice(){
        double salePrice;
        if (this.year > 2018) {
            salePrice = this.price * 0.8;
        } else if (this.year > 2010) {
            salePrice = this.price * 0.5;
        } else {
            salePrice = this.price * 0.1;
        }
        if (salePrice > maxPrice) {
            maxPrice = salePrice;
        }
        return salePrice;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        Car[] cars = new Car[t];
        for (int i = 0; i < t; i++) {
            String[] data = sc.nextLine().split(" ");
            String type = data[0];
            double price = Double.parseDouble(data[1]);
            int year = Integer.parseInt(data[2]);

            if (type.equals("SC")) {
                cars[i] = new SportCar(price, year);
            } else if (type.equals("CC")) {
                cars[i] = new ClassicCar(price, year);
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.printf("Most Expensive: %,.2f VND\n", Car.maxPrice);
    }
}
