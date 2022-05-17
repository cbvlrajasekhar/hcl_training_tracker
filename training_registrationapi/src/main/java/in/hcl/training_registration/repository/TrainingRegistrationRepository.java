package in.hcl.training_registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.hcl.training_registration.modal.TrainingRegistration;

@Repository
public interface TrainingRegistrationRepository extends JpaRepository<TrainingRegistration, Long>{
	
	TrainingRegistration findByTrainingRegistrationId(Long id);
	List<TrainingRegistration> findAll();
	void deleteByTrainingRegistrationId(Long trainingRegistrationId);
}
