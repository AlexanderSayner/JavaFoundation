package org.sayner.sandbox.example.springboot.allspringboot;

import org.sayner.sandbox.example.springboot.allspringboot.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeThing implements Runnable		//(содержащее метод run())
{
    private final Logger logger = LoggerFactory.getLogger(SomeThing.class);
    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        logger.info("Привет из побочного потока!");
    }
}
