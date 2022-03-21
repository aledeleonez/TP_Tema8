public class JugadorGuerra {
    public int numFichas;
    public String nombre;
    public Dado dado;

    public JugadorGuerra(String nombre) {
        this.numFichas = 10;
        this.nombre = nombre;
        this.dado = new Dado();
    }

    public int getNumFichas() {
        return numFichas;
    }

    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    



    
}
