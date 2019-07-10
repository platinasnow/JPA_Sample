package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.Board;
import com.example.demo.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	public Page<Board> findAll(Board board) {
		Page<Board> list = null;
		PageRequest pageRequest = PageRequest.of(board.getPage() - 1, board.getItemPerPage(),
				Sort.by(Direction.DESC, "idx"));
		if (!StringUtils.isEmpty(board.getSearchOption())) {
			switch (board.getSearchOption()) {
			case "name":
				list = boardRepository.findByRegIdContaining(board.getSearchInput(), pageRequest);
				break;
			case "title":
				list = boardRepository.findByTitleContaining(board.getSearchInput(), pageRequest);
				break;
			case "contents":
				list = boardRepository.findByContentsContaining(board.getSearchInput(), pageRequest);
				break;
			}
		} else {
			list = boardRepository.findAll(pageRequest);
		}

		board.setTotalItemCount(list.getTotalElements());
		return list;
	}

	public void save(Board board) throws Exception {
		try {
			boardRepository.save(board);
		} catch (Exception e) {
			throw new Exception();
		}

	}

	public Board findByIdx(Board board) {
		Board item = boardRepository.findById(board.getIdx()).get();
		if (item == null)
			return null;
		return item;

	}

}
