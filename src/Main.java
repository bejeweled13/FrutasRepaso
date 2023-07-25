import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vista ventana = new Vista();
        Frutas frutas = new Frutas(new ArrayList<>());
        int opt;

        do {
            opt = ventana.menu();
            switch (opt) {
                case 1 -> {
                    String fruta = ventana.pideFruta();
                    ventana.mensajeInsertar(fruta);
                }
                case 2 -> {
                    String fruta = ventana.pideFruta();
                    frutas.eliminarInicio(fruta);
                    ventana.mensajeEliminar(fruta);
                }
                    case 3 -> {
                        String fruta = ventana.pideFruta();
                        if (frutas.buscarFruta(fruta)) {
                            ventana.mensajeBuscarSi(fruta);
                        } else {
                            ventana.mensajeBuscarNo(fruta);
                        }
                    }
                    case 4 -> {
                    ArrayList<String> listaFrutas = new ArrayList<>();
                        ventana.mensajeMostar(listaFrutas);

                    }

                }

            }while (opt != 5) ;
        }
    }
