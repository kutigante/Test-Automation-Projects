package employeestepdefinitions;

import components.DeleteEmployeeComponent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Context;
import utils.ContextKeys;

public class DeleteEmployeeStepDef {

    @When("User sends DELETE request to delete employee details")
    public void userSendsDELETERequestToDeleteEmployeeDetails() {

        new DeleteEmployeeComponent().deleteEmployeeDetails((String) Context.getData(ContextKeys.EMPLOYEE_ID));

    }
}
