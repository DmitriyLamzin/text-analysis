package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonResponse {
  private Response response;

  public JsonResponse() {
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  @Override
  public String toString() {
    return "JsonResponse{" +
            "response=" + response +
            '}';
  }
}
