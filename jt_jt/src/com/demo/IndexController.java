package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by Hong on 1/5/2016.
 */
public class IndexController extends Controller {
    public void index() {
        renderText("这是Jetty下的index页面！");
    }
}
