package components;

import api.EmployeeEndpoints;
import io.restassured.response.Response;
import utils.Context;
import utils.ContextKeys;

public class GetAllEmployeeComponent {
    public void getAllEmployeeDetails(){

        Response response = new EmployeeEndpoints().getAllEmployeeDetails();
        Context.setData(ContextKeys.RESPONSE, response);

    }


}
