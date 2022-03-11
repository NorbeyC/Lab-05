package edu.eci.cvds.servlet.adivinar;

public class GuessBeanException extends Exception{
    public static final String winningGame = "Ha ganado el juego";
    public static final String losingGame = "Ha perdido el juego";
    public GuessBeanException(String message){
        super(message);
    }
}
