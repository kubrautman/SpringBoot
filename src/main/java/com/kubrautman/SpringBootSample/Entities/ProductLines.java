package com.kubrautman.SpringBootSample.Entities;

import java.io.Serializable;

import com.mysql.cj.jdbc.Blob;

public class ProductLines implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2889807496209983615L;
	String productLine;
	String textDescription;
	String htmlDescription;
	Blob image;

	
	public ProductLines() {
	}

	public ProductLines(String productLine, String textDescription, String htmlDescription, Blob image) {
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

}
