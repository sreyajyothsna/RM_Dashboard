package net.codejava.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CONTROLLER {
	
	@Autowired
	private ChartService ChartService;
	@Autowired
	private HireTableService hireTableService;
	
	/*
	 * @RequestMapping(value = "/Graphs", method = RequestMethod.GET) public String
	 * DisplayAvailibility(ModelMap modelMap1) { List<List<Map<Object, Object>>>
	 * DataList ;
	 * 
	 * DataList= ChartService.GetData(); modelMap1.addAttribute("dataPointsList2",
	 * DataList);
	 * 
	 * return "chart"; }
	 */

	@RequestMapping(value = "/Graphs", method = RequestMethod.GET)
	public ModelAndView DisplayAvailibility(@ModelAttribute("chart") HireTable hiretableupdate) {
		List<List<Map<Object, Object>>> DataList ;
		
		DataList= ChartService.GetData();
		ModelAndView mav = new ModelAndView("chart");
		mav.addObject("dataPointsList2", DataList);
		
		return mav;
	}
	
	
}
