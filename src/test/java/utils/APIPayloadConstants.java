package utils;

public class APIPayloadConstants {

    public static String createEmployeePayload(){
        String createEmployee= "{\n" +
                "  \"emp_firstname\": \"Something\",\n" +
                "  \"emp_lastname\": \"Else\",\n" +
                "  \"emp_middle_name\": \"MS\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2002-05-05\",\n" +
                "  \"emp_status\": \"Probation\",\n" +
                "  \"emp_job_title\": \"QA Engineer\"\n" +
                "}";
        return createEmployee;
    }
}
