package likun.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-07-07.
 */
@Controller
public class HashController {

    @RequestMapping("/saying")
    public @ResponseBody
    String test(@RequestParam String name) {
        System.out.println(name);
        return "saying!!!";
    }


}
