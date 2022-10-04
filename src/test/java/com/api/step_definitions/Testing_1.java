package com.api.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class Testing_1 {

String url = "http://api.zippopotam.us";
Response response;

    @When("user enters invalid postcode to \\/us endpoint")
    public void user_enters_invalid_postcode_to_us_endpoint_status_code_must_be() {
      response = given().accept(ContentType.JSON)
              .and().pathParam("zip", "50000")
              .when().get(url + "/us/{zip}");
    }


    @Then("status code must be 404, content type must be application\\/json")
    public void statusCodeMustBeContentTypeMustBeApplicationJson() {
        assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
        assertEquals(ContentType.JSON.toString(), response.contentType());
    }
}
