import java.util.ArrayList;

public class Map {
    ArrayList lista = new ArrayList();
    String str;
    int repeticiones;

    public Map() {

    }
    public Map(ArrayList lista) {
        this.lista = lista;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void añadirCadena (String str) {
        this.lista.add(str);
    }


}


