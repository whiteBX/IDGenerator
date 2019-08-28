package org.white.idgenerator.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: SpringApplication.java, v 0.1 2019年08月27日 09:52:00 white Exp$
 */
@SpringBootApplication
@ComponentScan("org.white.idgenerator")
public class IdGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdGeneratorApplication.class, args);
    }


}
