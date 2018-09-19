package com.test.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionWS {

	@RequestMapping("/version")
	public Map<String, String> version() {
	    HashMap<String, String> map = new HashMap<>();
	    map.put("version", "1.0.0");
	    return map;
	}
	
}
