package hangman.test;

import hangman.model.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class GameScoreTest {
	
     /**
     * Clases de equivalencia:
     * 1. Invalidos: incorrentCount < 0 ó CorrectCount < 0
     * 2. Calculo normal: 0 <= incorrentCount <= 10
     * 3. Calculo especial: incorrentCount >= 11
     *      
     */
    @Test
    public void originalScoreTest() throws HangmanException{
        OriginalScore score = new OriginalScore();
        assertEquals(20, score.calculateScore(0, 8));
        assertEquals(0, score.calculateScore(10, 20));
        try {
            score.calculateScore(-1, -1);
        } catch (HangmanException e) {
            assertEquals(e.getMessage(),(HangmanException.PARAMETROS_INVALIDOS));
        }
        
    }	

    /**
     * Clases de equivalencia:
     * 1. Invalidos: incorrectCount < 0 ó correctCount < 0
     * 2. Calculo normal: (2 * incorrectCount) <= correctCount
     * 3. Calculo especial: (2 * incorrectCount) > correctCount
     */
    @Test
    public void bonusScoreTest() throws HangmanException{
        BonusScore score = new BonusScore();
        assertEquals(5, score.calculateScore(5, 9));
        assertEquals(0, score.calculateScore(1, 7));
        try {
            score.calculateScore(-8, -7);
        } catch (HangmanException e) {
            assertEquals(e.getMessage(),(HangmanException.PARAMETROS_INVALIDOS));
        }        
    }

    /**
     * 1. Invalidos: incorrectCount < 0 ó correctCount < 0
     * 2. Calculo normal: 0 <= (5 ^ correctCount) - (incorrectCount * 8) <= 500
     * 3. Calculo especial: (5 ^ correctCount) - (incorrectCount * 8) < 0
     * 			    (5 ^ correctCount) - (incorrectCount * 8) > 500
     *     
     */
    @Test
    public void powerBonusScoreTest() throws HangmanException{
        PowerScore score = new PowerScore();
        assertEquals(109, score.calculateScore(3, 2));
        assertEquals(0, score.calculateScore(2, 4));
        assertEquals(500, score.calculateScore(4, 3));
        try {
            score.calculateScore(-1, -5);
        } catch (HangmanException e) {
            assertEquals(e.getMessage(),(HangmanException.PARAMETROS_INVALIDOS));
        }             
    }    

}
