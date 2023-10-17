package n3exercici1;
public class Generic{
    public static <T> void smartphoneGeneric(Smartphone smartphone){
        smartphone.takePictures();
        smartphone.call();
    }
    public static <T> void phoneGeneric(Phone phone){
        phone.call();
        //phone.takePictures(); not valid, takePictures method only in Smartphone
    }

}
