package in.hcl.trainingmanagementapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Training {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="modulename is required")
	@Column(updatable=false,unique=true)
	private String  modulename;
	private String type;
	@NotBlank(message="price is required")
	private double price;
	private double percentage_scored;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date scheduled_date;
	@JsonFormat(pattern="yyyy-MM-dd")
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
