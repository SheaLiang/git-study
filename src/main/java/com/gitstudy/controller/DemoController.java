/**
 * Created by Shea Liang on 2018/2/13.
 */

package com.gitstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

	@ResponseBody
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(){
		return "hello , 小公举";
	}

}
