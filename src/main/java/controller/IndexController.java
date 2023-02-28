package controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path(value = "/", viewPath = "/app")
public class IndexController extends Controller {
    public void index() {
        render("12.vue");
    }
}
