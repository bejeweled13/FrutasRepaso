import java.util.ArrayList;

public class Frutas {
    private ArrayList<String> listaFrutas;

    public Frutas(ArrayList<String> listaFrutas) {
        this.listaFrutas = listaFrutas;
    }

    public void agregarInicio(String fruta){
        listaFrutas.add(0,fruta);
    }

    public void eliminarInicio(String fruta){
        if (!listaFrutas.isEmpty()){
            listaFrutas.remove(0);
        }
    }

    public boolean buscarFruta(String fruta){
       return listaFrutas.contains(fruta);
    }

    public ArrayList<String> mostrar() {
        return listaFrutas;
    }
}
