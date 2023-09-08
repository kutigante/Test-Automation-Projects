package employeestepdefinitions;

import components.CreateEmployeeDetailsComponent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pojos.CreateEmployeeRequest;

import java.util.Map;

public class CreateEmployeeStepDef {

    @When("User creates new employee using create api endpoint")
    public void userCreatesNewEmployeeUsingCreateApiEndpoint() {
        new CreateEmployeeDetailsComponent().createNewEmployee();

    }

    @And("User sets the create employee request body with below data")
    public void userSetsTheCreateEmployeeRequestBodyWithBelowData(DataTable dataTable) {
        Map<String, String> requestbody = dataTable.asMap();
        new CreateEmployeeDetailsComponent().setCreateEmployeeRequestPayload(requestbody);

    }
}
