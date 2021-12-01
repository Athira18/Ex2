package StepDefinition;
import APIClass.APITestC;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs {

    APITestC apicl = new APITestC();

    @When("server sends a GET Request")
    public void server_sends_a_GET_Request() throws IOException {
        String url = "http://dummy.restapiexample.com/";

        apicl.getapi(url);

    }
    @Then("clients sends request data")
    public void clients_sends_request_data() {
    }
    @When("server sends a POST Request")
    public void server_sends_a_POST_Request() throws IOException {
        //String url = "http://http://dummy.restapiexample.com/api/v1/create";
        String url = "http://www.example.com";

        apicl.postapi(url);
    }

    @Then("clients creates and returns success status")
    public void clients_creates_and_returns_success_status()
    {
    }

}
