package Master;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import PageFactoryandTestdata.HelpingFunction;

public class TestNGListener extends HelpingFunction implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		
	
	}

	@Override
	public void onStart(ITestContext result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println(" onTestFailedButWithinSuccessPercentage Test Suite Starts  and details ara "+ result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
			System.out.println("Test Case Failed  and details ara "+ result.getName());
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
			test.fail(result.getThrowable());
			extent.flush();
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
			System.out.println("Test Case Skipped  and details ara "+ result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
			extent.flush();


	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Starts  and details ara "+ result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
			System.out.println("Test Case Passed  and details ara "+ result.getName());
			test.log(Status.PASS, result.getMethod().getDescription());
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
			test.log(Status.PASS, " Please see attached screenshot");
			extent.flush();
	
	}

}
