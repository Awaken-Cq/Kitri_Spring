package com.kitri.cafe.board.model;

public class AlbumDto extends BoardDto {

	private int aseq;
	private String saveFolder;
	private String originalPicture;
	private String savePicture;
	private int type;
	
	public int getAseq() {
		return aseq;
	}
	public void setAseq(int aseq) {
		this.aseq = aseq;
	}
	public String getSaveFolder() {
		return saveFolder;
	}
	public void setSaveFolder(String saveFolder) {
		this.saveFolder = saveFolder;
	}
	public String getOriginalPicture() {
		return originalPicture;
	}
	public void setOriginalPicture(String originalPicture) {
		this.originalPicture = originalPicture;
	}
	public String getSavePicture() {
		return savePicture;
	}
	public void setSavePicture(String savePicture) {
		this.savePicture = savePicture;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
}
