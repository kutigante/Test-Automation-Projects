package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.CreateEmployeeRequest;
import utils.Context;
import utils.ContextKeys;

import java.util.Map;

public class EmployeeEndpoints {

  public Response getAllEmployeeDetails(){
   Map<String,String> headers = (Map<String, String>) Context.getData(ContextKeys.HEADERS);
//      System.out.println(headers);
    return RestAssured.given().baseUri(APIConstants.BASE_URI)
                                    .when().get(APIConstants.GET_All_EMPLOYEES_ENDPOINT);
  }

  public Response getEmployeeDetails(String employeeId){
    Response response = RestAssured.given().pathParam(APIConstants.EMPLOYEE_ID_PATH_PARAM,
                                    employeeId).baseUri(APIConstants.BASE_URI).log().all()
                                    .when().get(APIConstants.GET_SINGLE_EMPLOYEE_ENDPOINT);
    response.prettyPrint();
    return response;
  }

  public Response createEmployeeDetails(CreateEmployeeRequest requestpayload){
      Response response = RestAssured.given().contentType(ContentType.JSON).body(requestpayload).baseUri(APIConstants.BASE_URI)
                                        .when().post(APIConstants.CREATE_EMPLOYEE_ENDPOINT);
      response.prettyPrint();
      return response;
  }

  public Response updateEmployeeDetails(CreateEmployeeRequest requestpayload, int employeeId ){
      Response response = RestAssured.given().pathParam(APIConstants.EMPLOYEE_ID_PATH_PARAM,employeeId)
                                             .contentType(ContentType.JSON).body(requestpayload).baseUri(APIConstants.BASE_URI)
                                    .when().put(APIConstants.CREATE_EMPLOYEE_ENDPOINT);

      response.prettyPrint();
      return response;
  }
public Response deleteEmployeeDetails(String employeeId){
      Response response = RestAssured.given().pathParam(APIConstants.EMPLOYEE_ID_PATH_PARAM, employeeId).baseUri(APIConstants.BASE_URI)
                                    .when().delete(APIConstants.DELETE_EMPLOYEE_ENDPOINT);
    response.prettyPrint();
    return response;

}

}
