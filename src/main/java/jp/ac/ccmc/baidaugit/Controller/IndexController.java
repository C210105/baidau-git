package jp.ac.ccmc.baidaugit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/index")
    public String showIndex(String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}
