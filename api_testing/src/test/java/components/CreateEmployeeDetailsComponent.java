package components;

import api.EmployeeEndpoints;
import io.restassured.response.Response;
import pojos.CreateEmployeeRequest;
import pojos.CreateEmployeeResponse;
import utils.Context;
import utils.ContextKeys;

import java.util.Map;

public class CreateEmployeeDetailsComponent {

    public void setCreateEmployeeRequestPayload(Map<String, String> requestPayload){
        CreateEmployeeRequest createEmployeeRequest = new CreateEmployeeRequest();
        createEmployeeRequest.setName(requestPayload.get("name"));
        createEmployeeRequest.setSalary(requestPayload.get("salary"));
        createEmployeeRequest.setAge(requestPayload.get("age"));

        Context.setData(ContextKeys.CREATE_EMPLOYEE_REQUEST_OBJ, createEmployeeRequest);

    }

    public void createNewEmployee(){
        CreateEmployeeRequest createEmployeeRequest = (CreateEmployeeRequest) Context.getData(ContextKeys.CREATE_EMPLOYEE_REQUEST_OBJ);
        Response response = new EmployeeEndpoints().createEmployeeDetails(createEmployeeRequest);
        CreateEmployeeResponse createEmployeeResponse = response.as(CreateEmployeeResponse.class);
        String employeeId = createEmployeeResponse.getData().getId();
        Context.setData(ContextKeys.EMPLOYEE_ID, employeeId);
        Context.setData(ContextKeys.RESPONSE, response);

    }
}
