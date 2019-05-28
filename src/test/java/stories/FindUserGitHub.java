package stories;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.io.IOException;

public class FindUserGitHub {
    private String userSearchApi;
    private String searchResult;

    @Given("a GitHub user search API")
    public void givenAGitHubUserSearchAPI() {
        userSearchApi = "https://api.github.com/users/%s";
    }

    @When("I search for username phgbecker")
    public void whenISearchForUsernamePhgbecker() throws ClientProtocolException, IOException {
        searchResult = searchGitHubFor("phgbecker");
    }

    @Then("his name should be Pedro Becker")
    public void thenHisNameShouldBePedroBecker() {
        Assertions.assertThat(searchResult).contains("Pedro Becker");
    }

    /**
     * Makes a request to GitHub and parses the output to String
     * 
     * @param user
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    private String searchGitHubFor(String user) throws ClientProtocolException, IOException {
        HttpUriRequest request = new HttpGet(String.format(userSearchApi, user));

        try (CloseableHttpResponse response = HttpClientBuilder.create().build().execute(request)) {
            return EntityUtils.toString(response.getEntity());
        }
    }
}