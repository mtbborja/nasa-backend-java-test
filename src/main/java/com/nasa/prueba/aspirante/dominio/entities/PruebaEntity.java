package com.nasa.prueba.aspirante.dominio.entities;

import java.util.Comparator;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "nasa_data")
public class PruebaEntity implements Comparable<PruebaEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "href")
	private String href;

	@Column(name = "center")
	private String center;

	@Column(name = "title")
	private String title;

	@Column(name = "nasa_id")
	private String nasaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	private Date creationDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

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

	public String getNasaId() {
		return nasaId;
	}

	public void setNasaId(String nasaId) {
		this.nasaId = nasaId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public int compareTo(PruebaEntity toCompare) {
		return Comparator.comparing(PruebaEntity::getId).compare(toCompare, this);
	}

}
