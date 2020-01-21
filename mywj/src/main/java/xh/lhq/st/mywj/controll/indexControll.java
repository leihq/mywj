package xh.lhq.st.mywj.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController == @Controller + @@ResponseBody + ...
public class indexControll {
	@RequestMapping("/home")
	public ModelAndView indexjsp(@RequestParam(value="name",defaultValue="雷星辰") String name){
		ModelAndView mode = new ModelAndView();
		mode.addObject("name", name);
		mode.setViewName("home");
		return mode;
		
	}
	
	@RequestMapping("/index")
	public String homejsp(){
		System.out.println("跳转到首页");
		return "index";
	}
}
