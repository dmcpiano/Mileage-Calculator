package co.grandcircus.mileageForm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageFormController {
	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
}
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	@RequestMapping("/mileage-result")
	public ModelAndView showMileageStory(@RequestParam("mpg") double mpg, @RequestParam("gallons") double gallons) {
		double result = mpg * gallons;
		
		ModelAndView mv = new ModelAndView("mileage-result");
		mv.addObject("mpg",mpg);
		mv.addObject("gallons",gallons);
		mv.addObject("result",result);
		return mv;
		
	}
}
