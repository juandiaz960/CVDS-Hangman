package hangman.model;


public class OriginalScore implements GameScore{

    
     /**
      * Es el esquema actual, se inicia con 100 puntos.
      * No se bonifican las letras correctas.
      * Se penaliza con 10 puntos con cada letra incorrecta.
      *  El puntaje minimo es 0.
      * @param correctCount Cantidad de intentos correctos
      * @param incorrectCount Cantidad de intentos incorrectos
      * @pre El puntaje inicial debe ser igual a 100.
      * @pos El puntaje final debe ser mayor o igual a 0.
      * @throws UnsupportedOperationException si el metodo no se ha implementado
      * @throws hangman.model.HangmanException Si los parametros son invalidos (negativos)
      * @return Puntaje obtenido
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        
        int score = 100;
        
        if(correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.PARAMETROS_INVALIDOS);
        }else if(incorrectCount >= 0 && incorrectCount <= 9 ){            
            score = 100 - (incorrectCount*10);
        }else if(incorrectCount >= 10){
            score = 0;
        }        
        return score;                
    }
    
}
