package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServelet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServelet.class);

    public HelloWorldServelet() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        logger.info("Before servlet print");
        pw.print("\nHello! from the servlet");
        logger.info("After servlet print");
    }
}

