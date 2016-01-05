public class ScrabbleScore {
  public static void main(String[] args) {}

    public Integer countScore(char letter) {
      if ( "aeioulnrst".indexOf(letter) >= 0) {
        return 1;
      } else if ("dg".indexOf(letter) >= 0) {
        return 2;
      } else if ("bcmp".indexOf(letter) >= 0) {
        return 3;
      } else  if ("fhvwy".indexOf(letter) >= 0) {
        return 4;
      } else if ("k".indexOf(letter) >= 0) {
        return 5;
      } else if ("jx".indexOf(letter) >= 0) {
        return 8;
      } else {
        return 10;
      }
    }

    public Integer scoreTotal(String userInput) {
      int score = 0;
      for (char s: userInput.toCharArray()) {
        score = score + countScore(s);
      }
      return score;
    }
  }
