public class ScrabbleScore {
  public static void main(String[] args) {}

    public Integer countScore(char word) {
      if ( "aeioulnrst".indexOf(word) >= 0) {
        return 1;
      } else if ("dg".indexOf(word) >= 0) {
        return 2;
      } else if ("bcmp".indexOf(word) >= 0) {
        return 3;
      } else  if ("fhvwy".indexOf(word) >= 0) {
        return 4;
      } else if ("k".indexOf(word) >= 0) {
        return 5;
      } else if ("jx".indexOf(word) >= 0) {
        return 8;
      } else if ("qz".indexOf(word) >= 0) {
        return 10;
      } else {
        return 0;
      }
    }
  }
