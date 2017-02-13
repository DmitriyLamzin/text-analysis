package lamzin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
  private Shop shop;

  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  @Override
  public String toString() {
    return "Data{" +
            "shop=" + shop +
            '}';
  }
}
