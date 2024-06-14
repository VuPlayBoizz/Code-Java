import java.util.*;

class Planet{
    String name;
    Double khoiLuong;
    Double banKinh;
    Double earthGravity;

    public Planet(String name, Double khoiLuong, Double banKinh, Double earthGravity){
        this.name = name;
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
        this.earthGravity = earthGravity;
    }
    
    public double calculateGravity(){
        double G = 6.67300e-11;
        return (khoiLuong * G) / (banKinh * banKinh);
    }

    public double calculateMass(double earthWeight){
        double surfaceGravity = calculateGravity();
        return earthWeight * surfaceGravity / earthGravity;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double khoiLuong = sc.nextDouble();
        double banKinh = sc.nextDouble();
        double earthWeight = sc.nextDouble();

        Planet planet = new Planet(name, khoiLuong, banKinh, 9.80274);
    
        double weightPlanet = planet.calculateMass(earthWeight);
        System.out.printf("Your weight on %s is %.2f%n", name, weightPlanet);
    }
}
