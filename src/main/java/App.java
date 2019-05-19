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

        get("heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/hero-form.vtl");
            return new ModelAndView(model, layout);
            }, new VelocityTemplateEngine());

        post("/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> hero = request.session().attribute("hero");
            if (hero == null) {
                hero = new ArrayList<Hero>();
                request.session().attribute("hero", hero);
            }
            String name = request.queryParams("name");
            Integer age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Hero newHero = new Hero(name, age, power, weakness);
            hero.add(newHero);
            model.put("hero", request.session().attribute("hero"));
            model.put("template","templates/success.vtl");
            
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    
        get("/heroes", (request, response) -> {
           Map<String, Object> model = new HashMap<String, Object>();
           model.put("heroes", Hero.all());
           model.put("template", "templates/heroes.vtl");
           return new ModelAndView(model, layout);
       }, new VelocityTemplateEngine());

       get("/heroes/:id", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();
            Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
            model.put("hero", hero);
            model.put("template", "templates/hero.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/squad-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = request.session().attribute("squad");
            if (squad == null) {
                squad = new ArrayList<Squad>();
                request.session().attribute("squad", squad);
            }
            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(name, size, cause);
            squad.add(newSquad);
            model.put("squad", request.session().attribute("squad"));
            model.put("template","templates/squad-success.vtl");
            
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        
        get("/squads", (request,response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squads", Squad.all());
            model.put("template", "templates/squads.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    
        get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}