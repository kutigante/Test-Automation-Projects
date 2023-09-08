package employeestepdefinitions;

import components.UpdateEmployeeDetailsComponent;
import io.cucumber.java.en.When;

public class UpdateEmployeeDetailsStepDef {

    @When("User updates employee details using update api endpoint")
    public void userUpdatesEmployeeDetailsUsingUpdateApiEndpoint() {
        new UpdateEmployeeDetailsComponent().updateEmployeeDetails();
        }
}
