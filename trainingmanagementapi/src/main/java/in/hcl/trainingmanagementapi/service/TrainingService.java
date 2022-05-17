package in.hcl.trainingmanagementapi.service;

import in.hcl.trainingmanagementapi.domain.Training;

public interface TrainingService {
	 public Training saveOrUpdate(Training training);
	public Training findTrainingByModulename(String modulename);
public	Iterable<Training>findAllTraining();
public void deleteTrainingByModulename(String modulename);

}
