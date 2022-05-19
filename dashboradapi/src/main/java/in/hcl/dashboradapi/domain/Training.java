package in.hcl.dashboradapi.domain;

import java.util.Date;

<<<<<<< HEAD:trainingmanagementapi/src/main/java/in/hcl/trainingmanagementapi/domain/Training.java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
=======
>>>>>>> 0191eb98ebab8c496cef9fa1e47e2168e5e26432:dashboradapi/src/main/java/in/hcl/dashboradapi/domain/Training.java





public class Training {
	
	private Long id;
	
	private String  modulename;
	private String type;
	@NotBlank(message="price is required")
	private double price;
	private double percentage_scored;
	
	private Date scheduled_date;
	
	private Date completed_by;
	@NotBlank(message="trainer name is required")
	private String trainer_name;
	private double training_rating;
	
	public Training() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	public String isType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getPercentage_scored() {
		return percentage_scored;
	}
	public void setPercentage_scored(double percentage_scored) {
		this.percentage_scored = percentage_scored;
	}
	public Date getScheduled_date() {
		return scheduled_date;
	}
	public void setScheduled_date(Date scheduled_date) {
		this.scheduled_date = scheduled_date;
	}
	public Date getCompleted_by() {
		return completed_by;
	}
	public void setCompleted_by(Date completed_by) {
		this.completed_by = completed_by;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public double getTraining_rating() {
		return training_rating;
	}
	public void setTraining_rating(int training_rating) {
		this.training_rating = training_rating;
	}
	public String getType() {
		return type;
	}	

}
