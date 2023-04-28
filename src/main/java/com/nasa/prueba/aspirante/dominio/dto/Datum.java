package com.nasa.prueba.aspirante.dominio.dto;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {

	public String center;
	public String title;
	public ArrayList<String> keywords;
	@JsonProperty("nasa_id")
	public String nasaId;
	@JsonProperty("date_created")
	public Date dateCreated;
	@JsonProperty("media_type")
	public String mediaType;
	public String description;
	public String photographer;
	public String location;
	public ArrayList<String> album;

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}

	public String getNasaId() {
		return nasaId;
	}

	public void setNasaId(String nasaId) {
		this.nasaId = nasaId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotographer() {
		return photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<String> getAlbum() {
		return album;
	}

	public void setAlbum(ArrayList<String> album) {
		this.album = album;
	}

}
