package net.codejava.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HireTableController {

	@Autowired
	private HireTableService hireTableService;
	
	@Autowired
	private RollonTableService rollonTableService;
	
	@Autowired
	private ChartService ChartService;
	
	@RequestMapping("/")
	public ModelAndView home(@ModelAttribute("hireTable") HireTable hiretableupdate) {
		List<HireTable> listHireTable = hireTableService.listAll();
		ModelAndView mav = new ModelAndView("hireTable");
		mav.addObject("listHireTable", listHireTable);

		List<List<Map<Object, Object>>> DataList ;
        DataList= ChartService.GetData();
		mav.addObject("dataPointsList2", DataList);
		
		return mav;
	}
	
	@RequestMapping(value = "/savehiretable", method = RequestMethod.POST)
	public String saveHireTable(@ModelAttribute("hireTable") HireTable hiretable, BindingResult errors) {
		//List<RollonTable> listHireTable = rollonTableService.listAll();
		hireTableService.save(hiretable);
		return "redirect:/";
	}
	
	@RequestMapping("/edithiretable")
	public ModelAndView editHireTableForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_hireTable");
		HireTable hiretable= hireTableService.get(id);
		mav.addObject("hireTable", hiretable);
		
		return mav;
	}
}

	 
		
		
	

