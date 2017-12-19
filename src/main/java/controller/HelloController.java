package controller;

import com.jfinal.core.Controller;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2017/12/19.
 */
public class HelloController extends Controller {
    public void index() {
        renderText("此方法是一个action");
    }

    public String test() {
        return "index.html";
    }

    public void save(Object object){
        System.out.println(object);
        render("index.html");
    }
}
