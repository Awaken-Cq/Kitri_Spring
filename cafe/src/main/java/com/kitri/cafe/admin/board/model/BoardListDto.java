package com.kitri.cafe.admin.board.model;

public class BoardListDto extends CategoryDto {

	private int bcode;
	private String bname;
	private int btype;
	private String control;
	
	
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBtype() {
		return btype;
	}
	public void setBtype(int btype) {
		this.btype = btype;
	}
	
	@Override
	public String toString() {
		return "BoardListDto [bcode=" + bcode + ", bname=" + bname + ", btype=" + btype + "]";
	}
	
	
	
}
