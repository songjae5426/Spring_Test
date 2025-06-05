package com.songjae.spring.test.thymeleaf.domain;

import java.time.LocalDateTime;

public class WeatherHistory {
	private int id;
	private LocalDateTime date;
	private String weather;
	private double temperatures;
	private double percipitation;
	private String microDust;
	private double windSpeed;
	private LocalDateTime createdAt;
	private LocalDateTime updateddAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public double getTemperatures() {
		return temperatures;
	}
	public void setTemperatures(double temperatures) {
		this.temperatures = temperatures;
	}
	public double getPercipitation() {
		return percipitation;
	}
	public void setPercipitation(double percipitation) {
		this.percipitation = percipitation;
	}
	public String getMicroDust() {
		return microDust;
	}
	public void setMicroDust(String microDust) {
		this.microDust = microDust;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdateddAt() {
		return updateddAt;
	}
	public void setUpdateddAt(LocalDateTime updateddAt) {
		this.updateddAt = updateddAt;
	}
	
	
}
