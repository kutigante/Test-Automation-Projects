package employeestepdefinitions;

import components.GetAllEmployeeComponent;
import components.GetSingleEmployeeComponent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.Context;
import utils.ContextKeys;

import java.util.Map;

public class GetEmployeeStepDef {
    
   @When("User sends GET request to fetch all the employees details")
    public void userSendsGETRequestToFetchAllTheEmployeesDetails() {
    new GetAllEmployeeComponent().getAllEmployeeDetails();
    }

    @Given("User sets the below headers for the api request")
    public void userSetsTheBelowHeadersForTheApiRequest(DataTable datatable) {
     Map<String, String> headers = datatable.asMap();
     Context.setData(ContextKeys.HEADERS, headers);

    }

    @Then("Verify status code is {int}")
    public void verifyStatusCodeIs(int expStatusCode) {
    Response response = (Response) Context.getData(ContextKeys.RESPONSE);

     Assert.assertEquals(expStatusCode, response.getStatusCode());
        
    }

    @When("User sends GET request to fetch single employee details")
    public void userSendsGETRequestToFetchSingleEmployeeDetails() {
    new GetSingleEmployeeComponent().getSingleEmployeeDetails();
    }

    @And("Verify employee details in the response payload")
    public void verifyEmployeeDetailsInTheResponsePayload() {
    }

 @And("Verify GET response payload")
 public void verifyGETResponsePayload(DataTable dataTable) {
    Map<String, String> expResponse = dataTable.asMap();
    new GetSingleEmployeeComponent().verifyGetResponsePayload(expResponse);


 }
}
