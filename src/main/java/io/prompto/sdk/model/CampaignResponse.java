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
import io.prompto.sdk.model.Campaign;
import io.prompto.sdk.model.Link;
import io.prompto.sdk.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * CampaignResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class CampaignResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("campaign")
  private Campaign campaign = null;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  public CampaignResponse campaign(Campaign campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(value = "")
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }

  public CampaignResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignResponse addErrorsItem(ValidationError errorsItem) {
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

  public CampaignResponse httpCode(Integer httpCode) {
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

  public CampaignResponse httpMessage(String httpMessage) {
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

  public CampaignResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CampaignResponse addLinksItem(Link linksItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignResponse campaignResponse = (CampaignResponse) o;
    return Objects.equals(this.campaign, campaignResponse.campaign) &&
        Objects.equals(this.errors, campaignResponse.errors) &&
        Objects.equals(this.httpCode, campaignResponse.httpCode) &&
        Objects.equals(this.httpMessage, campaignResponse.httpMessage) &&
        Objects.equals(this.links, campaignResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, errors, httpCode, httpMessage, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResponse {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

