import org.junit.*;
import static org.junit.Assert.*;

public class NumberWordsTest {
  @Test
  public void inputNumber_translatesNumericNumbersToWrittenWords1_one() {
    ScrabbleScore numberWord = new ScrabbleScore();
    assertEquals("one", numberWord.numberTranslator(1));
  }

}
