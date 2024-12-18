package in.sameerit.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Scheduled(cron =" 0 * * * * * ")
	public void generateReport() {
		
		//logic
		
		System.out.println("reporting generted...");
	}

}
