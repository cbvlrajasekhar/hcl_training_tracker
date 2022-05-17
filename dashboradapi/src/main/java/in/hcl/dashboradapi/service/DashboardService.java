package in.hcl.dashboradapi.service;

public interface DashboardService {

	public Long findTotalTrainings(Long userId, Long trainingID);
	public Long findTotalHoursOfTrainings(Long userId, Long trainingID);
	public String findTrainingStatus(Long userId, Long trainingID);
	public String findTrainingType(Long userId, Long trainingID);
	public Double findTrainingBudget(Long userId, Long trainingID);
	public Double findTrainingRating(Long userId, Long trainingID);
	
}
