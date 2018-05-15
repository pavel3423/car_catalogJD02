package by.htp.car_catalog.web.action.spring_action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static by.htp.car_catalog.web.util.WebConstantDeclaration.*;

@Controller
@RequestMapping("/")
public class IndexAction {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {

	return REDIRECT_TO + "brand";
    }

}
