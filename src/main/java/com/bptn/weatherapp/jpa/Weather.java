package com.bptn.weatherapp.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"weather\"")
public class Weather implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"weatherid\"")
    private Integer weatherId;

    @Column(name = "\"cloudsall\"")
    private BigDecimal cloudsAll;

    private String description;

    @Column(name = "\"feelslike\"")
    private BigDecimal feelsLike;

    @Column(name = "\"humidity\"")
    private BigDecimal humidity;

    private String icon;

    @Column(name = "\"pressure\"")
    private BigDecimal pressure;

    private Timestamp sunrise;

    private Timestamp sunset;

    private BigDecimal temp;

    @Column(name = "\"tempmax\"")
    private BigDecimal tempMax;

    @Column(name = "\"tempmin\"")
    private BigDecimal tempMin;

    @Column(name = "\"updatedon\"")
    private Timestamp updatedOn;
    
    @Column(name = "\"visibility\"")
    private BigDecimal visibility;

    
	@Column(name = "\"weatherstatusid\"")
    private Integer weatherStatusId;

    @Column(name = "\"winddirection\"")
    private BigDecimal windDirection;

    @Column(name = "\"windspeed\"")
    private BigDecimal windSpeed;

    @ManyToOne
    @JoinColumn(name = "\"cityid\"")
    @JsonManagedReference
    private City city;

    @ManyToOne
    @JoinColumn(name = "\"userid\"")
    @JsonIgnore
    private User user;

    public Weather() {
    }

   

    public Integer getWeatherId() {
		return weatherId;
	}



	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}



	public BigDecimal getCloudsAll() {
		return cloudsAll;
	}



	public void setCloudsAll(BigDecimal cloudsAll) {
		this.cloudsAll = cloudsAll;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public BigDecimal getFeelsLike() {
		return feelsLike;
	}



	public void setFeelsLike(BigDecimal feelsLike) {
		this.feelsLike = feelsLike;
	}



	public BigDecimal getHumidity() {
		return humidity;
	}



	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}



	public String getIcon() {
		return icon;
	}



	public void setIcon(String icon) {
		this.icon = icon;
	}



	public BigDecimal getPressure() {
		return pressure;
	}



	public void setPressure(BigDecimal pressure) {
		this.pressure = pressure;
	}



	public Timestamp getSunrise() {
		return sunrise;
	}



	public void setSunrise(Timestamp sunrise) {
		this.sunrise = sunrise;
	}



	public Timestamp getSunset() {
		return sunset;
	}



	public void setSunset(Timestamp sunset) {
		this.sunset = sunset;
	}



	public BigDecimal getTemp() {
		return temp;
	}



	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}



	public BigDecimal getTempMax() {
		return tempMax;
	}



	public void setTempMax(BigDecimal tempMax) {
		this.tempMax = tempMax;
	}



	public BigDecimal getTempMin() {
		return tempMin;
	}



	public void setTempMin(BigDecimal tempMin) {
		this.tempMin = tempMin;
	}



	public Timestamp getUpdatedOn() {
		return updatedOn;
	}



	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}



	public Integer getWeatherStatusId() {
		return weatherStatusId;
	}
	

	public void setWeatherStatusId(Integer weatherStatusId) {
		this.weatherStatusId = weatherStatusId;
	}



	public BigDecimal getVisibility() {
		return visibility;
	}



	public void setVisibility(BigDecimal visibility) {
		this.visibility = visibility;
	}



	public BigDecimal getWindDirection() {
		return windDirection;
	}



	public void setWindDirection(BigDecimal windDirection) {
		this.windDirection = windDirection;
	}



	public BigDecimal getWindSpeed() {
		return windSpeed;
	}



	public void setWindSpeed(BigDecimal windSpeed) {
		this.windSpeed = windSpeed;
	}



	public City getCity() {
		return city;
	}



	public void setCity(City city) {
		this.city = city;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Weather [weatherId=" + weatherId + ", cloudsAll=" + cloudsAll + ", description=" + description
				+ ", feelsLike=" + feelsLike + ", humidity=" + humidity + ", icon=" + icon + ", pressure=" + pressure
				+ ", sunrise=" + sunrise + ", sunset=" + sunset + ", temp=" + temp + ", tempMax=" + tempMax
				+ ", tempMin=" + tempMin + ", updatedOn=" + updatedOn + ", visibility=" + visibility
				+ ", weatherStatusId=" + weatherStatusId + ", windDirection=" + windDirection + ", windSpeed="
				+ windSpeed + "]";
	}

	
	



	
}
