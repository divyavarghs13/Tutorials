/**
 * 
 */
package com.assigment.MyAssigment.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author Divya
 *
 */
 
@RestController
public class PingResource {
	
	@GetMapping("/ping")
	protected String ping() {
		return "hi";
	}
	
    @GetMapping("/find")    
    public String find(Model model) {
    	model.addAttribute("findperfect", new FindPerfect());
        return "findperfect";        
    }
    
    @PostMapping("/calculate")
    public String findSubmit(@ModelAttribute FindPerfect findperfect) {
        return "result";
    }
	@GetMapping("/get")
	protected List perfect() {
		int min = 1;
		int max = 10000;
		String data;
		List<String> list = new ArrayList<>();
		for (min = 1; min <= max; min++) {
		    int sum = 0;
		    int e = 1;
		    for (e = 1; e < min; e++) {
		        int a = min % e;

		        if (a == 0) {
		            sum += e;
		        }
		    } 
		    if (sum == min){           
		        //return sum.toString();
		    	data=String.valueOf(sum);
		    	list.add(data);
		    }         
		}   
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			   //return(list.get(i));
			}
		return list;
	}

	
	
}
