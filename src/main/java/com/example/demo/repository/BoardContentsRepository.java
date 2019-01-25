package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.BoardContents;

public interface BoardContentsRepository extends CrudRepository<BoardContents, Integer>{

}
