package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by Hong on 1/5/2016.
 */
public class HelloController extends Controller {
    public void index() {
        renderText("欢迎来到JFinal的世界！");
    }
}
