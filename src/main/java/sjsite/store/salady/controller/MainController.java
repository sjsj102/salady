package sjsite.store.salady.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userMainController")
@RequestMapping("/user")
public class MainController {

    @GetMapping(value = {"", "/"})
    public String mainPage(Model model){

        model.addAttribute("title", "샐러디, 매일매일 찾아가는 샐러드");
        return "/user/index";
    }
}
