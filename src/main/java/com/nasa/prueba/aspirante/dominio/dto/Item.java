package com.nasa.prueba.aspirante.dominio.dto;

import java.util.ArrayList;

public class Item {

	public String href;
	public ArrayList<Datum> data;
	public ArrayList<Link> links;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public ArrayList<Datum> getData() {
		return data;
	}

	public void setData(ArrayList<Datum> data) {
		this.data = data;
	}

	public ArrayList<Link> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}

}
