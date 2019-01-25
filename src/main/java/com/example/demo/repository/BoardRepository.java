package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Board;

public interface BoardRepository extends PagingAndSortingRepository<Board, Integer>{

	
}
