package com.example.demo.dto;

public class Pagination {

	private int itemPerPage = 20;
	private int nextPage = 10;
	private int page = 1;
	private long totalItemCount;

	public int getCurrentPage() {
		int page = this.page;
		if (page < 1) {
			page = 1;
		}
		int pageCount = getPageCount();
		if (page > pageCount) {
			page = pageCount;
		}
		return page;
	}

	public int getPageCount() {
		return (int) ((totalItemCount - 1) / itemPerPage + 1);
	}

	public int getPageBegin() {
		return ((getCurrentPage() - 1) / nextPage) * nextPage + 1;
	}

	public int getPageEnd() {
		int pageCount = getPageCount();
		int num = getPageBegin() + nextPage - 1;
		return Math.min(pageCount, num);
	}

	public long getTotalItemCount() {
		return totalItemCount;
	}

	public void setTotalItemCount(long totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

	public int getItemPerPage() {
		return itemPerPage;
	}

	public void setItemPerPage(int itemPerPage) {
		this.itemPerPage = itemPerPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getCurrentItem() {
		return (page - 1) * itemPerPage;
	}
	
	public int getCurrentItemEnd(){
		return page * itemPerPage;
	}

	public int getJumpNextPage() {
		return Math.min(getPageCount(), page + nextPage);
	}

	public int getJumpPrevPage() {
		return Math.max(1, page - nextPage);
	}
	
	public int getLastPage(){
		return (int) Math.ceil(1.0*getTotalItemCount()/itemPerPage);
	}

	@Override
	public String toString() {
		return page > 1 ? "page : "+ page : "";   
	}

}
