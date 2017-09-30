package mx.edu.utng.mmacias.apppuzzle1341;

/**
 * Created by Dell Latitude on 27/09/2017.
 */

public class PuzzleLibre implements PuzzleEstrategia {
    protected  int [] tablero;

    public PuzzleLibre(){
            tablero =new int [16];
            for (int i=0; i<16;i++){
                tablero[i]=i;
            }


    }
    @Override
    public void moverPieza(int pos1, int pos2) {
        int tempo;
        tempo=tablero[pos1];
        tablero[pos1]=tablero[pos2];
        tablero[pos2]=tempo;
    }

    @Override
    public boolean verificarMov(int pos) {
        return false;
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
}
