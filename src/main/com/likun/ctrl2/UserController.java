package likun.ctrl2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-07-07.
 */
@Controller
public class UserController {
    @RequestMapping("/good")
    public @ResponseBody
    String test() {
        return "fucking";
    }
}
