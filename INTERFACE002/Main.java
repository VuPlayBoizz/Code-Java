package INTERFACE002;

interface  TacoBox {
    public int tacoRemaining();
    public void eat();
}

class TripleTacobox implements TacoBox{
    private int tacos = 3;

    public int tacoRemaining(){
        return this.tacos;
    }

    public void eat(){
        this.tacos--;
    }
}

class CustomTacoBox implements TacoBox{
    private int tacos;

    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    public int tacoRemaining(){
        return tacos;
    }
    public void eat(){
        tacos--;
    }
}
public class Main {
   public static void main(String[] args) {
        TripleTacobox tripTacos = new TripleTacobox();
        tripTacos.eat();
        tripTacos.eat();
        System.out.println("Triple taco boxes left: " + tripTacos.tacoRemaining());

        CustomTacoBox cusTacos = new CustomTacoBox(8);
        cusTacos.eat();
        System.out.println("Custom taco boxes left: " + cusTacos.tacoRemaining());
   } 
}
