package com.icia.board.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.board.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository br;
	
	@Autowired
	private HttpSession session;
	
}
