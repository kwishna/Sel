package custom;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	
	int maxRun = 3;
	int currentRun = 0;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(currentRun <= maxRun) {
			
			currentRun++;
			
			return true;
		}
		return false;
	}

}
