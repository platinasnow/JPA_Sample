package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Board;

public interface BoardRepository extends PagingAndSortingRepository<Board, Integer>{

	public Page<Board> findByTitleContaining(String title, Pageable pageable);
	
	public Page<Board> findByContentsContaining(String contents, Pageable pageable);
	
	public Page<Board> findByRegIdContaining(String regId, Pageable pageable);
	
}
