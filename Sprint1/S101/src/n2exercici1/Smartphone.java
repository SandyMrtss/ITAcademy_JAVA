package n2exercici1;

class Smartphone extends Telefon implements Camera, Rellotge {

    public Smartphone(String marca, String model){
        super(marca, model);
    }
    @Override
    public void fotografiar() {
        System.out.println("S'està fent una fotografia");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }

}
