package com.zipcode.test.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Testing_1 {

String url = "http://api.zippopotam.us";
Response response;

    @Given("user enters invalid postcode to {string} endpoint")
    public void user_enters_invalid_postcode_to_us_endpoint(String arg) {
        response = given().accept(ContentType.JSON)
                .and().pathParam("zipcode", 50000)
                .when().get(url + "/" + arg + "/{zipcode}").prettyPeek();
    }
    @Then("status code must be {int}, content type must be {string}")
    public void status_code_must_be_content_type_must_be_application_json(Integer int1, String arg) {
        assertThat(HttpStatus.SC_NOT_FOUND, is(404));
        assertThat(ContentType.JSON.toString(), is(response.contentType()));

    }


}
