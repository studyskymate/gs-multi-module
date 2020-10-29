package com.example.multimodule.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("get/msg")
public String getmsg() {
	return "Hello Form Library";
}
}
