import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/deck", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Deck deck = new Deck();
      model.put("deck", deck);
      model.put("template", "templates/deck.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
