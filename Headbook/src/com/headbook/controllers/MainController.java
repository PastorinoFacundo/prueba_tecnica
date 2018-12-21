package com.headbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.headbook.modelo.Post;

@Controller
public class MainController {

	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/home")
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/home/post/{idPost}")
	public Post getPost(@PathVariable Long idPost){
		//TODO pedir post a la base de datos
		Post post = new Post();
		return post;
	}
	
	@RequestMapping(value="/home/post/new")
	public String newPost(){
		return "newPost";
	}
	
	@RequestMapping(value="/home/post/{idPost}", method = RequestMethod.POST)
	public String createPost(@RequestParam Post post){
		//TODO crear post en la base de datos
		return "OK";
	}
	
}
