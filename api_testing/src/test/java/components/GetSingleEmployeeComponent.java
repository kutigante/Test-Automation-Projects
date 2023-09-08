package components;

import api.EmployeeEndpoints;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.GetEmployeeResponse;
import utils.Context;
import utils.ContextKeys;

import java.util.Map;

public class GetSingleEmployeeComponent {

    public void  getSingleEmployeeDetails(){
//        String EmployeeId = (String) Context.getData(ContextKeys.EMPLOYEE_ID);
        String EmployeeId = "1";
        Response response = new EmployeeEndpoints().getEmployeeDetails(EmployeeId);
        Context.setData(ContextKeys.RESPONSE, response);
    }

    public void verifyGetResponsePayload(Map<String, String> expResponse){
        Response ActResponse = (Response) Context.getData(ContextKeys.RESPONSE);
        GetEmployeeResponse getEmployeeResponse = ActResponse.as(GetEmployeeResponse.class);
        Assert.assertEquals(getEmployeeResponse.getData().getEmployee_name(), expResponse.get("name"));
        Assert.assertEquals(getEmployeeResponse.getData().getEmployee_salary(), expResponse.get("salary"));
        Assert.assertEquals(getEmployeeResponse.getData().getEmployee_age(), expResponse.get("age"));

    }
}
