package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shop {

  private String tsId;
  private String url;
  private String name;

  private String languageISO2;
  private String targetMarketISO3;

  private List<Review> reviews;

  public Shop() {
  }

  public String getTsId() {
    return tsId;
  }

  public void setTsId(String tsId) {
    this.tsId = tsId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLanguageISO2() {
    return languageISO2;
  }

  public void setLanguageISO2(String languageISO2) {
    this.languageISO2 = languageISO2;
  }

  public String getTargetMarketISO3() {
    return targetMarketISO3;
  }

  public void setTargetMarketISO3(String targetMarketISO3) {
    this.targetMarketISO3 = targetMarketISO3;
  }

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  @Override
  public String toString() {
    return "Shop{" +
            "tsId='" + tsId + '\'' +
            ", url='" + url + '\'' +
            ", name='" + name + '\'' +
            ", languageISO2='" + languageISO2 + '\'' +
            ", targetMarketISO3='" + targetMarketISO3 + '\'' +
            ", reviews=" + reviews +
            '}';
  }
}
