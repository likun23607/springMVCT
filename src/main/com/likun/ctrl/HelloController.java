package likun.ctrl;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017-07-07.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody
    String test(@RequestParam String name) {
        System.out.println(name);
        return "hello, world! This com from spring!";
    }

    @RequestMapping("/dubbo")
    public @ResponseBody
    String dubbo(HttpServletRequest request) {
       String name=request.getParameter("name");
        return name;
    }
}
