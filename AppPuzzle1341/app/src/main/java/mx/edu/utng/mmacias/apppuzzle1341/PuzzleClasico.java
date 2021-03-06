package mx.edu.utng.mmacias.apppuzzle1341;

/**
 * Created by Dell Latitude on 27/09/2017.
 */

public class PuzzleClasico implements PuzzleEstrategia{
    protected int [] tablero;
    private int disponible;// casilla libre
    public PuzzleClasico (){
        tablero =new int [16];
        for (int i=0; i<16;i++){
            tablero[i]=i;
        }
        disponible =15;
    }
    @Override
    public void moverPieza(int pos1, int pos2) {
        int tempo;//temporal
        if (verificarMov(pos1)){
            tempo=tablero[pos1];
            tablero [pos1]=tablero[disponible];
            tablero [disponible]=tempo;
            disponible =pos1;
        }
    }

    @Override
    public boolean verificarMov(int pos) {
        if ((pos / 4 == disponible / 4 && Math.abs(pos - disponible) == 1)
                || (pos % 4 == disponible % 4 && Math.abs(pos - disponible) == 4)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean yaGano() {
        boolean banOk=true;
        for (int i=0;i<16;i++){
            if (tablero[i]!=i){
                return false;
            }
        }
        return true;
    }

    public int getDisponible() {
        return disponible;
    }
}
