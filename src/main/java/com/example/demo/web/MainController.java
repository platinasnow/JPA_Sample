package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Board;
import com.example.demo.domain.BoardContents;
import com.example.demo.service.BoardService;

@RestController
public class MainController {

	@Autowired private BoardService boardService;
	
	@RequestMapping(value = "/index")
	public Object index() {
		Iterable<Board> list = boardService.findAll();
		System.out.println(list);
		return list;
	}
	
	
	@RequestMapping(value = "/insert")
	public void insert(Board board) {
		board.setRegId("test");
		board.setTitle("�׽�Ʈ11234");
		board.setContents("1");
		
		BoardContents item1 = new BoardContents();
		item1.setContents("�߰� ������1");
		BoardContents item2 = new BoardContents();
		item2.setContents("�߰� ������2");
		board.addBoardContents(item1);
		board.addBoardContents(item2);
		
		boardService.save(board);
		
	}
	
}
