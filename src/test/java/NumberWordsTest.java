import org.junit.*;
import static org.junit.Assert.*;

public class NumberWordsTest {
  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords1_one() {
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("one", numberWord.wholeNumberTranslator(1));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords14_fourteen(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("fourteen", numberWord.wholeNumberTranslator(14));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords20_twenty(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("twenty", numberWord.wholeNumberTranslator(20));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords22_twentytwo(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("twenty two", numberWord.wholeNumberTranslator(22));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords666_sixhundredsixtysix(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("six hundred sixty six", numberWord.wholeNumberTranslator(666));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords101_onehundredone() {
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("one hundred one", numberWord.wholeNumberTranslator(101));
  }


}
