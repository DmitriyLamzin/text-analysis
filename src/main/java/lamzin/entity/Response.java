package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

  private String code;

  private Data data;

  public Response() {
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Response{" +
            "code='" + code + '\'' +
            ", data=" + data +
            '}';
  }
}

