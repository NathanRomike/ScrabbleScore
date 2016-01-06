import org.junit.*;
import static org.junit.Assert.*;

public class NumberWordsTest {
  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords1_one() {
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("one", numberWord.numberTranslator(1));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords14_fourteen(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("fourteen", numberWord.numberTranslator(14));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords20_twenty(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("twenty", numberWord.numberTranslator(20));
  }

  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords22_twentytwo(){
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("twenty two", numberWord.numberTranslator(22));
  }
}
