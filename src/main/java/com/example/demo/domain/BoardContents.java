package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_BOARD_CONTENTS")
public class BoardContents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@Column(name = "FK_IDX")
	private Integer fkIdx;

	private String contents;

	@Column(name = "REG_DATE", insertable = false)
	private Date regDate;

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getFkIdx() {
		return fkIdx;
	}

	public void setFkIdx(Integer fkIdx) {
		this.fkIdx = fkIdx;
	}

}
