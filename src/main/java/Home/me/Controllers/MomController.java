package Home.me.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MomController {

    @ResponseBody
      @RequestMapping(value = "/mom")
    public String getMother()
    {
        return("Hi..I'm Mom Controller");
    }
}
