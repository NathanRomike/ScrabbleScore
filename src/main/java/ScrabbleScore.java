import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ScrabbleScore {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

    String word = request.queryParams("word");
    Integer score = scoreTotal(word);

    model.put("score", score);
    return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine());

    get("/numberWords", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/numberWords.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

    public static Integer countScore(char letter) {
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

    public static Integer scoreTotal(String userInput) {
      int score = 0;
      for (char s: userInput.toCharArray()) {
        score = score + countScore(s);
      }
      return score;
    }

    public static String numberTranslator(Integer inputNumber) {
      String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
      //String[] doubleDigit = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
      String[] teenDigit = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      if (inputNumber < 10) {
        return singleDigit[inputNumber];
      } else if ((inputNumber > 10) && (inputNumber <= 19)) {
          return teenDigit[inputNumber - 11];
      } else {
        return "";
      }
        //return doubleDigit[inputNumber];

    }
  }
