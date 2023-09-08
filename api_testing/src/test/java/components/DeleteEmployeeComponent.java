package components;

import api.EmployeeEndpoints;
import io.restassured.response.Response;
import utils.Context;
import utils.ContextKeys;

public class DeleteEmployeeComponent {

    public void deleteEmployeeDetails(String employeeId) {
        Response response = new EmployeeEndpoints().deleteEmployeeDetails(employeeId);
        Context.setData(ContextKeys.RESPONSE, response);

    }
}
