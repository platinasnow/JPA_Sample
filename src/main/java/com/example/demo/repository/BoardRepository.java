package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Board;

public interface BoardRepository extends PagingAndSortingRepository<Board, Integer>{
	public String SELECT_QUERY = "SELECT b, count(c.idx) AS c FROM Board b LEFT JOIN BoardContents c ON b.idx = c.fkIdx ";
	public String GROUP_BY = " GROUP BY b.idx";
	
	@Query(SELECT_QUERY + GROUP_BY)
	public Page<Board> findAll(Pageable pageable);
	
	@Query(SELECT_QUERY + "WHERE b.title LIKE CONCAT('%',?1,'%') " + GROUP_BY)
	public Page<Board> findByTitleContaining(String title, Pageable pageable);
	
	@Query(SELECT_QUERY + "WHERE b.contents LIKE CONCAT('%',?1,'%') " + GROUP_BY)
	public Page<Board> findByContentsContaining(String contents, Pageable pageable);
	
	@Query(SELECT_QUERY + "WHERE b.regId LIKE CONCAT('%',?1,'%') " + GROUP_BY)
	public Page<Board> findByRegIdContaining(String regId, Pageable pageable);
	
	
}
