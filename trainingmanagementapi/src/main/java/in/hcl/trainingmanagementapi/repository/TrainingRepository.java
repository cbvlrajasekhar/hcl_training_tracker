package in.hcl.trainingmanagementapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.hcl.trainingmanagementapi.domain.Training;

@Repository
public interface TrainingRepository extends CrudRepository<Training,Long>{

	Training findByModulename(String modulename);
	
	

}
