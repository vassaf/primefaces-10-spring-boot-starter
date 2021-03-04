package com.vassaf.app.bean;

import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class HelloBean {
	public String getMsg() {
		return "Hello ! ";
	}
}