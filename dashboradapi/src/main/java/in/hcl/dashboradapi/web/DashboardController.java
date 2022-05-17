/**
 * 
 */
package in.hcl.dashboradapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hcl.dashboradapi.domain.Dashboard;
import in.hcl.dashboradapi.service.DashboardService;

/**
 * @author manesambhaji.sadas
 *
 */
@RestController
@RequestMapping("api/dashboard")
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/{UserId}/{trainingId}")
	public ResponseEntity<?> getDashboardInfo(@PathVariable Long UserId,@PathVariable Long trainingId)
	{
		Dashboard dashboard= new Dashboard();
		
		dashboard.setTotalTrainings(dashboardService.findTotalTrainings(UserId, trainingId));
		dashboard.setTotalTrainingHours(dashboardService.findTotalHoursOfTrainings(UserId, trainingId));
		dashboard.setTrainingStatus(dashboardService.findTrainingStatus(UserId, trainingId));
		dashboard.setTrainingType(dashboardService.findTrainingType(UserId, trainingId));
		dashboard.setBudget(dashboardService.findTrainingBudget(UserId, trainingId));
		dashboard.setTrainingRating(dashboardService.findTrainingRating(UserId, trainingId));
		return new  ResponseEntity<Dashboard>(dashboard, HttpStatus.OK);
		
	}
	
}
