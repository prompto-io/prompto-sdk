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
import io.prompto.sdk.model.Address;
import io.prompto.sdk.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PartnerUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class PartnerUser implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("branchId")
  private String branchId = null;

  @SerializedName("createDate")
  private Long createDate = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("lastName1")
  private String lastName1 = null;

  @SerializedName("lastName2")
  private String lastName2 = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("partnerId")
  private String partnerId = null;

  @SerializedName("phoneExtNumber1")
  private String phoneExtNumber1 = null;

  @SerializedName("phoneExtNumber2")
  private String phoneExtNumber2 = null;

  @SerializedName("phoneNumber1")
  private String phoneNumber1 = null;

  @SerializedName("phoneNumber2")
  private String phoneNumber2 = null;

  /**
   * Gets or Sets prefix
   */
  @JsonAdapter(PrefixEnum.Adapter.class)
  public enum PrefixEnum {
    MR("MR"),
    
    MRS("MRS"),
    
    MS("MS"),
    
    MISS("MISS");

    private String value;

    PrefixEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrefixEnum fromValue(String text) {
      for (PrefixEnum b : PrefixEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrefixEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrefixEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrefixEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrefixEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("prefix")
  private PrefixEnum prefix = null;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    ADMIN("ADMIN"),
    
    MANAGER("MANAGER"),
    
    AGENT("AGENT");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RolesEnum fromValue(String text) {
      for (RolesEnum b : RolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RolesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("roles")
  private RolesEnum roles = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DISABLED("DISABLED"),
    
    PENDING_ACTIVATION("PENDING_ACTIVATION");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("username")
  private String username = null;

  public PartnerUser id(String id) {
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

  public PartnerUser address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PartnerUser branchId(String branchId) {
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

  public PartnerUser createDate(Long createDate) {
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

  public PartnerUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public PartnerUser lastName1(String lastName1) {
    this.lastName1 = lastName1;
    return this;
  }

   /**
   * Get lastName1
   * @return lastName1
  **/
  @ApiModelProperty(value = "")
  public String getLastName1() {
    return lastName1;
  }

  public void setLastName1(String lastName1) {
    this.lastName1 = lastName1;
  }

  public PartnerUser lastName2(String lastName2) {
    this.lastName2 = lastName2;
    return this;
  }

   /**
   * Get lastName2
   * @return lastName2
  **/
  @ApiModelProperty(value = "")
  public String getLastName2() {
    return lastName2;
  }

  public void setLastName2(String lastName2) {
    this.lastName2 = lastName2;
  }

  public PartnerUser links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PartnerUser addLinksItem(Link linksItem) {
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

  public PartnerUser middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PartnerUser name(String name) {
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

  public PartnerUser partnerId(String partnerId) {
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

  public PartnerUser phoneExtNumber1(String phoneExtNumber1) {
    this.phoneExtNumber1 = phoneExtNumber1;
    return this;
  }

   /**
   * Get phoneExtNumber1
   * @return phoneExtNumber1
  **/
  @ApiModelProperty(value = "")
  public String getPhoneExtNumber1() {
    return phoneExtNumber1;
  }

  public void setPhoneExtNumber1(String phoneExtNumber1) {
    this.phoneExtNumber1 = phoneExtNumber1;
  }

  public PartnerUser phoneExtNumber2(String phoneExtNumber2) {
    this.phoneExtNumber2 = phoneExtNumber2;
    return this;
  }

   /**
   * Get phoneExtNumber2
   * @return phoneExtNumber2
  **/
  @ApiModelProperty(value = "")
  public String getPhoneExtNumber2() {
    return phoneExtNumber2;
  }

  public void setPhoneExtNumber2(String phoneExtNumber2) {
    this.phoneExtNumber2 = phoneExtNumber2;
  }

  public PartnerUser phoneNumber1(String phoneNumber1) {
    this.phoneNumber1 = phoneNumber1;
    return this;
  }

   /**
   * Get phoneNumber1
   * @return phoneNumber1
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber1() {
    return phoneNumber1;
  }

  public void setPhoneNumber1(String phoneNumber1) {
    this.phoneNumber1 = phoneNumber1;
  }

  public PartnerUser phoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
    return this;
  }

   /**
   * Get phoneNumber2
   * @return phoneNumber2
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber2() {
    return phoneNumber2;
  }

  public void setPhoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
  }

  public PartnerUser prefix(PrefixEnum prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")
  public PrefixEnum getPrefix() {
    return prefix;
  }

  public void setPrefix(PrefixEnum prefix) {
    this.prefix = prefix;
  }

  public PartnerUser roles(RolesEnum roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public RolesEnum getRoles() {
    return roles;
  }

  public void setRoles(RolesEnum roles) {
    this.roles = roles;
  }

  public PartnerUser status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PartnerUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerUser partnerUser = (PartnerUser) o;
    return Objects.equals(this.id, partnerUser.id) &&
        Objects.equals(this.address, partnerUser.address) &&
        Objects.equals(this.branchId, partnerUser.branchId) &&
        Objects.equals(this.createDate, partnerUser.createDate) &&
        Objects.equals(this.fullName, partnerUser.fullName) &&
        Objects.equals(this.lastName1, partnerUser.lastName1) &&
        Objects.equals(this.lastName2, partnerUser.lastName2) &&
        Objects.equals(this.links, partnerUser.links) &&
        Objects.equals(this.middleName, partnerUser.middleName) &&
        Objects.equals(this.name, partnerUser.name) &&
        Objects.equals(this.partnerId, partnerUser.partnerId) &&
        Objects.equals(this.phoneExtNumber1, partnerUser.phoneExtNumber1) &&
        Objects.equals(this.phoneExtNumber2, partnerUser.phoneExtNumber2) &&
        Objects.equals(this.phoneNumber1, partnerUser.phoneNumber1) &&
        Objects.equals(this.phoneNumber2, partnerUser.phoneNumber2) &&
        Objects.equals(this.prefix, partnerUser.prefix) &&
        Objects.equals(this.roles, partnerUser.roles) &&
        Objects.equals(this.status, partnerUser.status) &&
        Objects.equals(this.username, partnerUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, branchId, createDate, fullName, lastName1, lastName2, links, middleName, name, partnerId, phoneExtNumber1, phoneExtNumber2, phoneNumber1, phoneNumber2, prefix, roles, status, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName1: ").append(toIndentedString(lastName1)).append("\n");
    sb.append("    lastName2: ").append(toIndentedString(lastName2)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    phoneExtNumber1: ").append(toIndentedString(phoneExtNumber1)).append("\n");
    sb.append("    phoneExtNumber2: ").append(toIndentedString(phoneExtNumber2)).append("\n");
    sb.append("    phoneNumber1: ").append(toIndentedString(phoneNumber1)).append("\n");
    sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

