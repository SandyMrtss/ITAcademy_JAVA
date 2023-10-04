package n3exercici1;
import java.util.ArrayList;

public class GestioButaques {
    public final ArrayList<Butaca> butaques;

    public GestioButaques(){
        this.butaques = new ArrayList<>();
    }
    public ArrayList<Butaca> getButaques(){
        return this.butaques;
    }

    public int cercarButaca(int nFila, int nSeient){
        for (Butaca butaca : butaques) {
            if (butaca.nFila == nFila & butaca.nSeient == nSeient) {
                return butaques.indexOf(butaca);
            }
        }
        return -1;
    }
    public void afegirButaca(Butaca butaca) throws Exception {
        if (cercarButaca(butaca.getnFila(), butaca.getnSeient()) == -1) {
            butaques.add(butaca);
        }
        else throw new ExcepcioButacaOcupada();
    }
    public void eliminarButaca(int fila, int seient) throws Exception {
        for(Butaca butaca : butaques){
            if (butaca.nFila == fila & butaca.nSeient == seient) {
                butaques.remove(butaca);
                return;
            }
        }
        throw new ExcepcioButacaLliure();
    }
}
