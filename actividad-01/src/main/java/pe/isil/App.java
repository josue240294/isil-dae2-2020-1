package pe.isil;

import pe.isil.equipo.futbol.Barcelona;
import pe.isil.jugadores.Cristiano_Ronaldo;
import pe.isil.jugadores.Messi;


public class App {
    public static void main(String[] args) {
        Barcelona barcelona = new Barcelona(new Messi());
       barcelona.team();

       barcelona.setPlayers((new Cristiano_Ronaldo()));
       barcelona.team();
    }


}
