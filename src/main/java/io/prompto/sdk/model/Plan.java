/*
 * Abella
 * Partner API application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.prompto.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.prompto.sdk.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Plan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class Plan implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("branchId")
  private String branchId = null;

  @SerializedName("createDate")
  private Long createDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("discount")
  private BigDecimal discount = null;

  @SerializedName("gracePeriod")
  private Integer gracePeriod = null;

  /**
   * Gets or Sets gracePeriodUnit
   */
  @JsonAdapter(GracePeriodUnitEnum.Adapter.class)
  public enum GracePeriodUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    GracePeriodUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GracePeriodUnitEnum fromValue(String text) {
      for (GracePeriodUnitEnum b : GracePeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GracePeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GracePeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GracePeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GracePeriodUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gracePeriodUnit")
  private GracePeriodUnitEnum gracePeriodUnit = null;

  @SerializedName("grandTotal")
  private BigDecimal grandTotal = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("maxSubcriber")
  private Long maxSubcriber = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("others")
  private BigDecimal others = null;

  @SerializedName("partnerId")
  private String partnerId = null;

  @SerializedName("period")
  private Integer period = null;

  /**
   * Gets or Sets periodUnit
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodUnitEnum fromValue(String text) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("periodUnit")
  private PeriodUnitEnum periodUnit = null;

  /**
   * Gets or Sets planType
   */
  @JsonAdapter(PlanTypeEnum.Adapter.class)
  public enum PlanTypeEnum {
    ONE_TIME("ONE_TIME"),
    
    RECURRING("RECURRING");

    private String value;

    PlanTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanTypeEnum fromValue(String text) {
      for (PlanTypeEnum b : PlanTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlanTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlanTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("planType")
  private PlanTypeEnum planType = null;

  @SerializedName("prefered")
  private Boolean prefered = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("published")
  private Boolean published = null;

  public Plan id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plan amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Plan branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(value = "")
  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public Plan createDate(Long createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public Long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  public Plan currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Plan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plan discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public Plan gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * Get gracePeriod
   * @return gracePeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public Plan gracePeriodUnit(GracePeriodUnitEnum gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
    return this;
  }

   /**
   * Get gracePeriodUnit
   * @return gracePeriodUnit
  **/
  @ApiModelProperty(value = "")
  public GracePeriodUnitEnum getGracePeriodUnit() {
    return gracePeriodUnit;
  }

  public void setGracePeriodUnit(GracePeriodUnitEnum gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
  }

  public Plan grandTotal(BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

   /**
   * Get grandTotal
   * @return grandTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public Plan links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Plan addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Plan locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Plan maxSubcriber(Long maxSubcriber) {
    this.maxSubcriber = maxSubcriber;
    return this;
  }

   /**
   * Get maxSubcriber
   * @return maxSubcriber
  **/
  @ApiModelProperty(value = "")
  public Long getMaxSubcriber() {
    return maxSubcriber;
  }

  public void setMaxSubcriber(Long maxSubcriber) {
    this.maxSubcriber = maxSubcriber;
  }

  public Plan metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public Plan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plan others(BigDecimal others) {
    this.others = others;
    return this;
  }

   /**
   * Get others
   * @return others
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOthers() {
    return others;
  }

  public void setOthers(BigDecimal others) {
    this.others = others;
  }

  public Plan partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public Plan period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public Plan periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @ApiModelProperty(value = "")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public Plan planType(PlanTypeEnum planType) {
    this.planType = planType;
    return this;
  }

   /**
   * Get planType
   * @return planType
  **/
  @ApiModelProperty(value = "")
  public PlanTypeEnum getPlanType() {
    return planType;
  }

  public void setPlanType(PlanTypeEnum planType) {
    this.planType = planType;
  }

  public Plan prefered(Boolean prefered) {
    this.prefered = prefered;
    return this;
  }

   /**
   * Get prefered
   * @return prefered
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrefered() {
    return prefered;
  }

  public void setPrefered(Boolean prefered) {
    this.prefered = prefered;
  }

  public Plan priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Plan published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id) &&
        Objects.equals(this.amount, plan.amount) &&
        Objects.equals(this.branchId, plan.branchId) &&
        Objects.equals(this.createDate, plan.createDate) &&
        Objects.equals(this.currency, plan.currency) &&
        Objects.equals(this.description, plan.description) &&
        Objects.equals(this.discount, plan.discount) &&
        Objects.equals(this.gracePeriod, plan.gracePeriod) &&
        Objects.equals(this.gracePeriodUnit, plan.gracePeriodUnit) &&
        Objects.equals(this.grandTotal, plan.grandTotal) &&
        Objects.equals(this.links, plan.links) &&
        Objects.equals(this.locked, plan.locked) &&
        Objects.equals(this.maxSubcriber, plan.maxSubcriber) &&
        Objects.equals(this.metadata, plan.metadata) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.others, plan.others) &&
        Objects.equals(this.partnerId, plan.partnerId) &&
        Objects.equals(this.period, plan.period) &&
        Objects.equals(this.periodUnit, plan.periodUnit) &&
        Objects.equals(this.planType, plan.planType) &&
        Objects.equals(this.prefered, plan.prefered) &&
        Objects.equals(this.priority, plan.priority) &&
        Objects.equals(this.published, plan.published);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, branchId, createDate, currency, description, discount, gracePeriod, gracePeriodUnit, grandTotal, links, locked, maxSubcriber, metadata, name, others, partnerId, period, periodUnit, planType, prefered, priority, published);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    gracePeriodUnit: ").append(toIndentedString(gracePeriodUnit)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxSubcriber: ").append(toIndentedString(maxSubcriber)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    prefered: ").append(toIndentedString(prefered)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

