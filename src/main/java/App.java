import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

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
            ArrayList<Resume> resume = request.session().attribute("resume");
            if (resume == null) {
                resume = new ArrayList<Resume>();
                request.session().attribute("resume", resume);
            }
            String title = request.queryParams("title");
            String company = request.queryParams("company");
            String location = request.queryParams("location");
            String description = request.queryParams("description");
            String date = request.queryParams("date");
            String end = request.queryParams("end");
            Resume newResume = new Resume(title, company, location, description, date, end);
            resume.add(newResume);
            model.put("resume", request.session().attribute("resume"));
            model.put("template","templates/success.vtl");
            
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}