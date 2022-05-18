package in.hcl.dashboradapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.dashboradapi.service.DashboardService;
@Service
public class DashboardServiceImpl implements DashboardService {
  
	@Override
	public Long findTotalTrainings(Long userId, Long trainingID) {
		//select count(*) from training where id=? and role=?
		return (long) 10;
	}

	@Override
	public Long findTotalHoursOfTrainings(Long userId, Long trainingID) {
		//select count(*) duration from training where id=? and role=?
		return  (long) 20;
	}

	@Override
	public String findTrainingStatus(Long userId, Long trainingID) {
		
		return "Completed";
	}

	@Override
	public String findTrainingType(Long userId, Long trainingID) {
		
		return "Online";
	}

	@Override
	public Double findTrainingBudget(Long userId, Long trainingID) {
		
		return 10000.0;
	}

	@Override
	public Double findTrainingRating(Long userId, Long trainingID) {
		
		return 5.4;
	}

}
