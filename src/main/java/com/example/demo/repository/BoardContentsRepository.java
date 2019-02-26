package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.BoardContents;

public interface BoardContentsRepository extends CrudRepository<BoardContents, Integer>{

	public List<BoardContents> findByFkIdx(Integer fkIdx);
	
	public int countByFkIdx(Integer fkIdx);
	
}
