package components;

import api.EmployeeEndpoints;
import io.restassured.response.Response;
import pojos.CreateEmployeeRequest;
import utils.Context;
import utils.ContextKeys;

public class UpdateEmployeeDetailsComponent {
    public void updateEmployeeDetails() {
        CreateEmployeeRequest createEmployeeRequest = (CreateEmployeeRequest) Context.getData(ContextKeys.CREATE_EMPLOYEE_REQUEST_OBJ);
        Response response = new EmployeeEndpoints().updateEmployeeDetails(createEmployeeRequest, 1);
        Context.setData(ContextKeys.RESPONSE, response);
    }
}