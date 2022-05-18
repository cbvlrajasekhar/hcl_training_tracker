package in.hcl.training_registration.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class TrainingRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainigRegistrationId;
	@NotBlank(message="Employee id is reqiured")
	private Long employeeId;
	@NotBlank(message="Schedule id is reqiured")
	private Long scheduleId;
	@JsonInclude
	@Transient
	private List<Schedule> schedule;
	@JsonInclude
	@Transient
	private List<Employee> employee;

	private Date createdAt;
	private Date updatedAt;
	
	public TrainingRegistration() {
		super();
		
	}
	
	public TrainingRegistration(Long employeeId, Long scheduleId) {
		super();
		this.employeeId = employeeId;
		this.scheduleId = scheduleId;
	}

	public Long getTrainigRegistrationId() {
		return trainigRegistrationId;
	}

	public void setTrainigRegistrationId(Long trainigRegistrationId) {
		this.trainigRegistrationId = trainigRegistrationId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}
	
	@PostUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}

	@Override
	public String toString() {
		return "TrainingRegistration [trainigRegistrationId=" + trainigRegistrationId + ", employeeId=" + employeeId
				+ ", scheduleId=" + scheduleId + ", schedule=" + schedule + ", employee=" + employee + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
