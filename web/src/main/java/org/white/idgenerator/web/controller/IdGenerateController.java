package org.white.idgenerator.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.white.idgenerator.service.service.IdGenerateService;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: IdGenerateController.java, v 0.1 2019年08月28日 12:50:00 white Exp$
 */
@RestController
public class IdGenerateController {

    @Autowired
    private IdGenerateService idGenerateService;

    @GetMapping("/generate")
    public String genId() {
        return idGenerateService.gen32Id();
    }
}
