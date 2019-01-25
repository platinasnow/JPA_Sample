package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Board;
import com.example.demo.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	

	public Iterable<Board> findAll() {
		return boardRepository.findAll(PageRequest.of(0, 10, Sort.by(Direction.DESC, "idx")));
	}

	public void save(Board board) {
		Board savedItem = boardRepository.save(board);
		/*
		for(BoardContents item : board.getBoardContentsList()) {
			item.setFkIdx(savedItem.getIdx());
			boardContentsRepository.save(item);
		}
		*/
	}

}
