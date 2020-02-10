package hangman.model;


public class OriginalScore implements GameScore{

    
     /**
      * Es el esquema actual, se inicia con 100 puntos.
      * No se bonifican las letras correctas.
      * Se penaliza con 10 puntos con cada letra incorrecta.
      * El puntaje minimo es 0.
      * @param correctCount Cantidad de intentos correctos
      * @param incorrectCount Cantidad de intentos incorrectos
      * @pre El puntaje inicial debe ser igual a 100.
      * @pos El puntaje final debe ser mayor o igual a 0.
      * @throws HangmanException Si los parametros son invalidos (negativos)
      * @return Puntaje logrado.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        return 0;
    }
    
}
