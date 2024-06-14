public class Main {
    private String name;
    private String breed;
    private int age;

    public String setName(String name){
        return this.name = name;
    }

    public String setBreed(String breed){
        return this.breed = breed;
    }

    public int setAge(int age){
        return this.age = age;
    }

    public void printDogDetail(){
        System.out.println("Name:" + name + "--Breed:" + breed + "--Age:" + age);
    }

    public static void main(String[] args){
        Main newDog = new Main();
        newDog.setName("Micky");
        newDog.setBreed("Husky");
        newDog.setAge(12);
        newDog.printDogDetail();
    }
}