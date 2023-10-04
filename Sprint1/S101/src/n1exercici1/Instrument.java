package n1exercici1;

public abstract class Instrument {
    public String name;
    public static int price;

    public Instrument(){
        System.out.println("He sigut creat pel constructor de la classe n1exercici1.Instrument!");
    }

    abstract void play();

}

class Wind extends Instrument {
   {
    this.name = "flauta";
   }

   static {
       price = 5;
   }

    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}

class Cuerda extends Instrument {
    {
        this.name = "guitarra";
        System.out.println("He sigut creat per l'accés a una classe filla!");
    }

    static {
        price = 150;
        System.out.println("Accès a membre estàtic");
    }
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}

class Percussion extends Instrument {
    {
        this.name = "tambor";
    }

    static {
        price = 300;
    }
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
