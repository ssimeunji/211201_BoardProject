package com.icia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.icia.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
}
