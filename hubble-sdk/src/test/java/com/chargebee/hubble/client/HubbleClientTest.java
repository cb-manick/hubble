package com.chargebee.hubble.client;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class HubbleClientTest {
    private ObjectMapper objectMapper = new ObjectMapper();

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    class Employee{
        private int employeeId;
        private String employeeName;
        public Employee(){

        }
        public Employee(String employeeName,int employeeId){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeId=" + employeeId +
                    ", employeeName='" + employeeName + '\'' +
                    '}';
        }


        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
    }
    @BeforeAll
    public void beforeAll() {
       // objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }
    @Test
    public void testObjectMapper(){
         Employee employee = new Employee("Manick",90653);
        try {
            String s = objectMapper.writeValueAsString(employee);
            System.out.println(s);
            Employee e2 = objectMapper.readValue(s,Employee.class);

            System.out.println(e2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


}