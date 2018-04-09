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
import io.prompto.sdk.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * AmortizationDetailsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class AmortizationDetailsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("amortizationTable")
  private List<List<BigDecimal>> amortizationTable = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("initialPayment")
  private BigDecimal initialPayment = null;

  @SerializedName("interestRate")
  private BigDecimal interestRate = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("periodicPayment")
  private BigDecimal periodicPayment = null;

  @SerializedName("principal")
  private BigDecimal principal = null;

  @SerializedName("remainingPayments")
  private Integer remainingPayments = null;

  @SerializedName("totalInterest")
  private BigDecimal totalInterest = null;

  @SerializedName("totalPayment")
  private BigDecimal totalPayment = null;

  public AmortizationDetailsResponse amortizationTable(List<List<BigDecimal>> amortizationTable) {
    this.amortizationTable = amortizationTable;
    return this;
  }

  public AmortizationDetailsResponse addAmortizationTableItem(List<BigDecimal> amortizationTableItem) {
    if (this.amortizationTable == null) {
      this.amortizationTable = new ArrayList<List<BigDecimal>>();
    }
    this.amortizationTable.add(amortizationTableItem);
    return this;
  }

   /**
   * Get amortizationTable
   * @return amortizationTable
  **/
  @ApiModelProperty(value = "")
  public List<List<BigDecimal>> getAmortizationTable() {
    return amortizationTable;
  }

  public void setAmortizationTable(List<List<BigDecimal>> amortizationTable) {
    this.amortizationTable = amortizationTable;
  }

  public AmortizationDetailsResponse balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public AmortizationDetailsResponse duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public AmortizationDetailsResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public AmortizationDetailsResponse addErrorsItem(ValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<ValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationError> errors) {
    this.errors = errors;
  }

  public AmortizationDetailsResponse httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @ApiModelProperty(value = "")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public AmortizationDetailsResponse httpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

   /**
   * Get httpMessage
   * @return httpMessage
  **/
  @ApiModelProperty(value = "")
  public String getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }

  public AmortizationDetailsResponse initialPayment(BigDecimal initialPayment) {
    this.initialPayment = initialPayment;
    return this;
  }

   /**
   * Get initialPayment
   * @return initialPayment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInitialPayment() {
    return initialPayment;
  }

  public void setInitialPayment(BigDecimal initialPayment) {
    this.initialPayment = initialPayment;
  }

  public AmortizationDetailsResponse interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public AmortizationDetailsResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public AmortizationDetailsResponse addLinksItem(Link linksItem) {
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

  public AmortizationDetailsResponse periodicPayment(BigDecimal periodicPayment) {
    this.periodicPayment = periodicPayment;
    return this;
  }

   /**
   * Get periodicPayment
   * @return periodicPayment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPeriodicPayment() {
    return periodicPayment;
  }

  public void setPeriodicPayment(BigDecimal periodicPayment) {
    this.periodicPayment = periodicPayment;
  }

  public AmortizationDetailsResponse principal(BigDecimal principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrincipal() {
    return principal;
  }

  public void setPrincipal(BigDecimal principal) {
    this.principal = principal;
  }

  public AmortizationDetailsResponse remainingPayments(Integer remainingPayments) {
    this.remainingPayments = remainingPayments;
    return this;
  }

   /**
   * Get remainingPayments
   * @return remainingPayments
  **/
  @ApiModelProperty(value = "")
  public Integer getRemainingPayments() {
    return remainingPayments;
  }

  public void setRemainingPayments(Integer remainingPayments) {
    this.remainingPayments = remainingPayments;
  }

  public AmortizationDetailsResponse totalInterest(BigDecimal totalInterest) {
    this.totalInterest = totalInterest;
    return this;
  }

   /**
   * Get totalInterest
   * @return totalInterest
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalInterest() {
    return totalInterest;
  }

  public void setTotalInterest(BigDecimal totalInterest) {
    this.totalInterest = totalInterest;
  }

  public AmortizationDetailsResponse totalPayment(BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

   /**
   * Get totalPayment
   * @return totalPayment
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmortizationDetailsResponse amortizationDetailsResponse = (AmortizationDetailsResponse) o;
    return Objects.equals(this.amortizationTable, amortizationDetailsResponse.amortizationTable) &&
        Objects.equals(this.balance, amortizationDetailsResponse.balance) &&
        Objects.equals(this.duration, amortizationDetailsResponse.duration) &&
        Objects.equals(this.errors, amortizationDetailsResponse.errors) &&
        Objects.equals(this.httpCode, amortizationDetailsResponse.httpCode) &&
        Objects.equals(this.httpMessage, amortizationDetailsResponse.httpMessage) &&
        Objects.equals(this.initialPayment, amortizationDetailsResponse.initialPayment) &&
        Objects.equals(this.interestRate, amortizationDetailsResponse.interestRate) &&
        Objects.equals(this.links, amortizationDetailsResponse.links) &&
        Objects.equals(this.periodicPayment, amortizationDetailsResponse.periodicPayment) &&
        Objects.equals(this.principal, amortizationDetailsResponse.principal) &&
        Objects.equals(this.remainingPayments, amortizationDetailsResponse.remainingPayments) &&
        Objects.equals(this.totalInterest, amortizationDetailsResponse.totalInterest) &&
        Objects.equals(this.totalPayment, amortizationDetailsResponse.totalPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amortizationTable, balance, duration, errors, httpCode, httpMessage, initialPayment, interestRate, links, periodicPayment, principal, remainingPayments, totalInterest, totalPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmortizationDetailsResponse {\n");
    
    sb.append("    amortizationTable: ").append(toIndentedString(amortizationTable)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    initialPayment: ").append(toIndentedString(initialPayment)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    periodicPayment: ").append(toIndentedString(periodicPayment)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    remainingPayments: ").append(toIndentedString(remainingPayments)).append("\n");
    sb.append("    totalInterest: ").append(toIndentedString(totalInterest)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
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
