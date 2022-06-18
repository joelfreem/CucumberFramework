package utils;

import io.restassured.RestAssured;

import java.util.stream.BaseStream;

public class APIConstants {
    public static final String BaseURI= RestAssured.baseURI= "http://hrm.syntaxtechs.net/syntaxapi/api";
    public static final String GENERATE_TOKEN_URI= BaseURI + "/generateToken.php";
    public static final String CREATE_EMPLOYEE_URI=BaseURI + "/createEmployee.php";
    public static final String GET_ONE_EMPLOYEE_URI =BaseURI+ "/getOneEmployee.php";
    public static final String UPDATE_EMPLOYEE_URI =BaseURI+ "/updateEmployee.php";
    public static final String GET_ALL_EMPLOYEE_URI = BaseURI +BaseURI+ "/getAllEmployees.php";
    public static final String DELETE_EMPLOYEE_URI = BaseURI +BaseURI+ "/deleteEmployee.php";
    public static final String UPDATE_PARTIAL_EMPLOYEE_URI = BaseURI +BaseURI+ "/updatePartialEmployeeDetails.php";
    public static final String GET_EMPLOYEE_STATUS_URI = BaseURI +BaseURI+ "/employeeStatus.php";

    public static final String HEADER_CONTENT_TYPE="Content_Type";
    public static final String HEADER_CONTENT_TYPE_VALUE ="application/json";

    public static final String HEADER_AUTHORIZATION ="Authorization";

}
