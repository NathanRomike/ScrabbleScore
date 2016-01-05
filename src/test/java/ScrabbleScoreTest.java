import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, scrabbleScore.countScore('a'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForDLetter_2() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 2;
    assertEquals(score, scrabbleScore.countScore('d'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForMLetter_3() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 3;
    assertEquals(score, scrabbleScore.countScore('m'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForFLetter_4() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 4;
    assertEquals(score, scrabbleScore.countScore('f'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForKLetter_5() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 5;
    assertEquals(score, scrabbleScore.countScore('k'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForJLetter_8() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 8;
    assertEquals(score, scrabbleScore.countScore('j'));
  }

  @Test
  public void scrabbleScore_returnAScrabbleScoreForZLetter_10() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 10;
    assertEquals(score, scrabbleScore.countScore('z'));
  }

  @Test
  public void scrableScore_finalScoreOfWordCat_5(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 5;
    assertEquals(score, scrabbleScore.scoreTotal("cat"));
  }
}
