package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.example.demo.dto.SearchInfo;

@Entity
@Table(name = "TEST_BOARD")
public class Board extends SearchInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;
	
	@NotNull
	@NotEmpty(message = "빈 값을 넣을 수 없습니다.")
	private String title;
	
	@NotNull
	@Length(max= 100)
	@NotEmpty(message = "빈 값을 넣을 수 없습니다.")
	private String contents;
	
	@Column(name = "REG_DATE", insertable = false)
	private Date regDate;
	
	@Column(name = "REG_ID")
	private String regId;
	
	@Column(name = "UPT_DATE")
	private Date uptDate;
	
	@Column(name = "UPT_ID")
	private String uptId;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_IDX", referencedColumnName = "IDX")
	private List<BoardContents> boardContentsList;

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getUptDate() {
		return uptDate;
	}

	public void setUptDate(Date uptDate) {
		this.uptDate = uptDate;
	}

	public String getUptId() {
		return uptId;
	}

	public void setUptId(String uptId) {
		this.uptId = uptId;
	}

	@Override
	public String toString() {
		return "Board [idx=" + idx + ", title=" + title + ", contents=" + contents + ", regDate=" + regDate + ", regId="
				+ regId + ", uptDate=" + uptDate + ", uptId=" + uptId + "]";
	}

	public List<BoardContents> getBoardContentsList() {
		return boardContentsList;
	}

	public void setBoardContentsList(List<BoardContents> boardContentsList) {
		this.boardContentsList = boardContentsList;
	}
	
	

}
