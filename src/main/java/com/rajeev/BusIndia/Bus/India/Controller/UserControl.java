package com.rajeev.BusIndia.Bus.India.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajeev.BusIndia.Bus.India.Repogetery.UserRepogetry;
import com.rajeev.BusIndia.Bus.India.entity.User;

@Controller
public class UserControl {
	@Autowired
    UserRepogetry userRepo;
	@RequestMapping("/showReg")
	public String firstPage(){
		return "registationPage";
	}
	@RequestMapping(value="registationPage",method=RequestMethod.POST)
	public String userRegistation(@ModelAttribute("user")User user){
		if(user.getfName()==null &&user.getmName()==null&&user.getlName()==null&&
				user.getPhone()==null&&user.getEmail()==null&&user.getPinCode()==null){
			return "registationPage";
		}else{
			userRepo.save(user);
		}
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@RequestParam("emailid")User user,@RequestParam("password")String password,ModelMap modelmap){
		 user=userRepo.findByEmail(user);
		if(user.getPassword().equals(password)){
			return "showBus";
		}else{
			modelmap.addAttribute("msg", "User Name and Password Does Not Exits !");
		}
		return null;
	}
}
