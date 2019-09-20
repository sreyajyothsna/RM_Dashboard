package net.codejava.customer;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class ChartService {
 
	
	
	public List<List<Map<Object, Object>>> GetData() {
		
		Map<Object,Object> map = null;
		List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
		List<Map<Object,Object>> RollOffForecast = new ArrayList<Map<Object,Object>>();
		List<Map<Object,Object>> RollOffActual = new ArrayList<Map<Object,Object>>();
		
		List<Map<Object,Object>> Availability = new ArrayList<Map<Object,Object>>();
		List<Map<Object,Object>> MaximumBenchStrength = new ArrayList<Map<Object,Object>>();
		List<Map<Object,Object>> MinimumBenchStrength = new ArrayList<Map<Object,Object>>();
	
		List<Map<Object,Object>> Resigned = new ArrayList<Map<Object,Object>>();
		List<Map<Object,Object>> Allowable_Attrition = new ArrayList<Map<Object,Object>>();
	
		
			map = new HashMap<Object,Object>(); map.put("label", "P1"); map.put("y", 12);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 30);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 17);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 17);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 14);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 53);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 6);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 03);Resigned.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y", 3);Resigned.add(map);
			
			map = new HashMap<Object,Object>(); map.put("label", "p1"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 15);Allowable_Attrition.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y",15);Allowable_Attrition.add(map);
			
		
		
			map = new HashMap<Object,Object>(); map.put("label", "P1"); map.put("y", 12);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 30);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 17);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 17);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 14);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 53);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 6);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 03);Availability.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y", 3);Availability.add(map);
			
			
			map = new HashMap<Object,Object>(); map.put("label", "P1"); map.put("y", 12);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 30);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 17);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 17);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 14);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 53);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 6);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 03);MaximumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y", 3);MaximumBenchStrength.add(map);
			
			
			
			
			map = new HashMap<Object,Object>(); map.put("label", "p1"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 15);MinimumBenchStrength.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y",15);MinimumBenchStrength.add(map);
		
			
		
	 
		
			
	
		
			map = new HashMap<Object,Object>(); map.put("label", "P1"); map.put("y", 12);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 30);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 17);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 15);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 17);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 14);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 53);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 6);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 03);RollOffForecast.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y", 3);RollOffForecast.add(map);
			
			map = new HashMap<Object,Object>(); map.put("label", "p1"); map.put("y", 15);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P2"); map.put("y", 57);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P3"); map.put("y", 96);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P4"); map.put("y", 119);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P5"); map.put("y", 144);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P6"); map.put("y", 128);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P7"); map.put("y", 47);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P8"); map.put("y", 57);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P9"); map.put("y", 120);RollOffActual.add(map);
			map = new HashMap<Object,Object>(); map.put("label", "P10"); map.put("y",21);RollOffActual.add(map);
			
			list.add(RollOffForecast);
			list.add(RollOffActual);
			list.add(Availability);
			list.add(MaximumBenchStrength);
			list.add(MinimumBenchStrength);
			list.add(Resigned);
			list.add(Allowable_Attrition);
		
	 
		
			return list;
			}
		
		
		
		
	}
 
 
