package co.osa.controllers;

/**
 * Created by robertgreathouse on 2/17/16.
 */

import co.osa.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/message")
    public String greeting(@RequestParam(value="name", defaultValue="Delta Dental") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name)).toString();
    }
    /*@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name, Model model) {
        Greeting greeting =new Greeting(counter.incrementAndGet(), String.format(template, name));

        model.addAttribute("greeting", greeting);

        return "jsonTemplate";
    }*/
}
