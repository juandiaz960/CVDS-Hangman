package hangman.model;


public class PowerScore implements GameScore{

    /**
     * El juego inicia en 0 puntos.
     * La $i-ésima$ letra correcta se bonifica con $5^i$.
     * Se penaliza con 8 puntos cada letra incorrecta.
     * El puntaje mínimo es 0     
     * @param correctCount Cantidad de intentos correctos
     * @param incorrectCount Cantidad de intentos incorrectos
     * @pre El puntaje inicial debe ser igual a 0.
     * @pos El máximo puntaje es 500.
     * @pos El puntaje final debe ser mayor o igual a 0.
     * @throws UnsupportedOperationException si el metodo no se ha implementado  
     * @throws HangmanException Si los parametros no son válidos
     * @return Puntaje logrado    
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{      
        return 0;         
    }
    
}
