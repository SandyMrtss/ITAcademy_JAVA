package n3exercici1;
public class Generic {

    public static <Phone> void phoneGeneric(Phone phone){
        phone.call();
    }
    public static <Smartphone> void smartphoneGeneric(Smartphone smartphone){
        smartphone.takePictures();
        smartphone.call();
    }
}
