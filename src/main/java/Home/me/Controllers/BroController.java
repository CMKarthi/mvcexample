package Home.me.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

    @ResponseBody
      @RequestMapping(value = "/bro")
    public String getBooks()
    {
        return("Hi. here are the books--> Bro Controller");
    }
}
