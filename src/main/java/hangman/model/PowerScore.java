
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
     * @pos Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * @pos El puntaje final debe ser mayor o igual a 0
     * @throws UnsupportedOperationException si el metodo no se ha implementado  
     * @throws hangman.model.HangmanException Si los parametros son invalidos (negativos)
     * @return Puntaje obtenido     
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        int score = 0;
        int operacion = (int) (Math.pow(5, correctCount) - (8*incorrectCount));
        
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);
        }else if(operacion >= 0 && operacion < 500){            
            score = operacion;
        }else if(operacion < 0){
            score = 0;
        }else if(operacion >= 500){
            score = 500;
        }        
        return score;         
    }
    
}
