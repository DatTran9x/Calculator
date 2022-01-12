package controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String divine(@RequestParam int number1, @RequestParam int number2,@RequestParam String select, ModelMap model) {
        switch (select) {
            case "addition":
                model.addAttribute("result", number1 + number2);
                return "result";
            case "minus":
                model.addAttribute("result", number1 - number2);
                return "result";
            case "multiplication" :
                model.addAttribute("result", number1 * number2);
                return "result";
            case "divine" :
                if (number2 == 0) {
                    return "False";
                }
                model.addAttribute("result",number1 /number2);
                return "result";
            default:
                return "home";
        }
    }
}
