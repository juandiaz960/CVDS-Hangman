package hangman.model;


public class BonusScore implements GameScore{

    
    /**
     * El juego inicia en 0 puntos.
     * Se bonifica con 10 puntos cada letra correcta.
     * Se penaliza con 5 puntos cada letra incorrecta.
     * El puntaje mínimo es 0
     * @param correctCount Cantidad de intentos correctos
     * @param incorrectCount Cantidad de intentos incorrectos
     * @pre El puntaje inicial debe ser igual a 0.
     * @pos El puntaje final debe ser mayor o igual a 0.
     * @throws HangmanException Si los parametros son invalidos (negativos)
     * @return Puntaje obtenido     
    */   
    @Override 
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        int score = 0;
	if (incorrectCount < 0 || correctCount < 0){
		throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);
	} else if ((5 * incorrectCount) <= 10 * correctCount){
		score = (correctCount * 10) - (incorrectCount* 5);
	} else if ((2 * incorrectCount) > incorrectCount){
		score = 0;
	}
	System.out.println(score);
	return score;        
    }
    
}
