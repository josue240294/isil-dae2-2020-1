package pe.isil.equipo.futbol;

import pe.isil.jugadores.Players;

public class Barcelona {
    Players players;

    public Barcelona(){

    }

    public Barcelona(Players players)
    {
        this.players = players;
    }

    public void setPlayers(Players players){
        this.players=players;
    }
    public void team(){
        this.players.send();
    }
}
