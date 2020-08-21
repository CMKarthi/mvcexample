package Home.me.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/draw")
    public String getDrawing()
    {
        return("Image drawn");
    }
    @ResponseBody
    @RequestMapping("/order")
    public String getSort()
    {
        return ("List Sorted");
    }
}
