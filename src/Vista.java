import javax.swing.*;
import java.util.ArrayList;

public class Vista {
    public Vista() {
    }

    public int menu() {
        Object[] opciones = {"Insertar Inicio", "Eliminar Inicio", "Buscar", "Mostrar", "Salir"};
        int ventana = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        return ventana + 1;
    }

    public String pideFruta(){
        String str= "Introduce el nombre de la fruta";
        return (JOptionPane.showInputDialog(null, str));
    }


    public void mensajeInsertar(String fruta) {
        String str = "La fruta " + fruta + " se ha agregado correctamente";
        JOptionPane.showMessageDialog(null, str);
    }

    public void mensajeEliminar(String fruta) {
        String str = "La fruta " + fruta + " se ha eliminado correctamente";
        JOptionPane.showMessageDialog(null, str);
    }

    public void mensajeBuscarSi(String fruta) {
        String str = "La fruta " + fruta + " está en la lista";
        JOptionPane.showMessageDialog(null, str);
    }

    public void mensajeBuscarNo(String fruta) {
        String str = "La fruta " + fruta + " no está en la lista";
        JOptionPane.showMessageDialog(null, str);
    }

    public void mensajeMostar(ArrayList<String> listaFrutas) {
        String str = "La frutas disponibles son: " + listaFrutas;
        JOptionPane.showMessageDialog(null, str);
    }


}
