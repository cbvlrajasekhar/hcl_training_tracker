package in.hcl.training_registration.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class TrainingRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private Long nominatedById;
	private Long allotedById;
	private Long duration;
	private Long trainingId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date start_date;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date end_date;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	
	
	public TrainingRegistration() {
		super();

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getNominatedById() {
		return nominatedById;
	}
	public void setNominatedById(Long nominatedById) {
		this.nominatedById = nominatedById;
	}
	public Long getAllotedById() {
		return allotedById;
	}
	public void setAllotedById(Long allotedById) {
		this.allotedById = allotedById;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	@PrePersist
	public void onCreate() {
		this.created_at = new Date();
	}
	
	@PostUpdate
	public void onUpdate() {
		this.updated_at = new Date();
	}
	
	@Override
	public String toString() {
		return "TrainingRegistration [id=" + id + ", userId=" + userId + ", nominatedById=" + nominatedById
				+ ", allotedById=" + allotedById + ", duration=" + duration + ", trainingId=" + trainingId
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	
	

}
