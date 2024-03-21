/*
 * Seel API
 * Seel API
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ClaimClaimDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Claim
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Claim {
  public static final String SERIALIZED_NAME_CLAIM_ID = "claim_id";
  @SerializedName(SERIALIZED_NAME_CLAIM_ID)
  private String claimId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_PAYOUT_AMOUNT = "payout_amount";
  @SerializedName(SERIALIZED_NAME_PAYOUT_AMOUNT)
  private Double payoutAmount;

  /**
   * The status of the claim.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("pending"),
    
    ACCEPTED("accepted"),
    
    REJECTED("rejected");

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * The status of the claim.
   */
  @JsonAdapter(ClaimTypeEnum.Adapter.class)
 public enum ClaimTypeEnum {
    RETURN("return"),
    
    LOSS("loss"),
    
    DAMAGE("damage"),
    
    DELAY("delay"),
    
    THEFT("theft");

    private String value;

    ClaimTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClaimTypeEnum fromValue(String value) {
      for (ClaimTypeEnum b : ClaimTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClaimTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClaimTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClaimTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClaimTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLAIM_TYPE = "claim_type";
  @SerializedName(SERIALIZED_NAME_CLAIM_TYPE)
  private ClaimTypeEnum claimType;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason;

  public static final String SERIALIZED_NAME_CLAIM_DETAILS = "claim_details";
  @SerializedName(SERIALIZED_NAME_CLAIM_DETAILS)
  private List<ClaimClaimDetailsInner> claimDetails = null;

  public static final String SERIALIZED_NAME_UPDATED_TS = "updated_ts";
  @SerializedName(SERIALIZED_NAME_UPDATED_TS)
  private OffsetDateTime updatedTs;

  public static final String SERIALIZED_NAME_CREATED_TS = "created_ts";
  @SerializedName(SERIALIZED_NAME_CREATED_TS)
  private OffsetDateTime createdTs;

  public Claim() {
  }

  public Claim claimId(String claimId) {
    
    
    
    
    this.claimId = claimId;
    return this;
  }

   /**
   * The unique identifier of the claim.
   * @return claimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023010112345678", value = "The unique identifier of the claim.")

  public String getClaimId() {
    return claimId;
  }


  public void setClaimId(String claimId) {
    
    
    
    this.claimId = claimId;
  }


  public Claim orderId(String orderId) {
    
    
    
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The identifier of the order associated with the claim.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023010112345678", value = "The identifier of the order associated with the claim.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    
    
    
    this.orderId = orderId;
  }


  public Claim contractId(String contractId) {
    
    
    
    
    this.contractId = contractId;
    return this;
  }

   /**
   * The identifier of the contract associated with the claim.
   * @return contractId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20230101123456781234", value = "The identifier of the contract associated with the claim.")

  public String getContractId() {
    return contractId;
  }


  public void setContractId(String contractId) {
    
    
    
    this.contractId = contractId;
  }


  public Claim payoutAmount(Double payoutAmount) {
    
    
    
    
    this.payoutAmount = payoutAmount;
    return this;
  }

   /**
   * The settled amount of the claim.
   * @return payoutAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.99", value = "The settled amount of the claim.")

  public Double getPayoutAmount() {
    return payoutAmount;
  }


  public void setPayoutAmount(Double payoutAmount) {
    
    
    
    this.payoutAmount = payoutAmount;
  }


  public Claim status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the claim.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PENDING", value = "The status of the claim.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public Claim claimType(ClaimTypeEnum claimType) {
    
    
    
    
    this.claimType = claimType;
    return this;
  }

   /**
   * The status of the claim.
   * @return claimType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RETURN", value = "The status of the claim.")

  public ClaimTypeEnum getClaimType() {
    return claimType;
  }


  public void setClaimType(ClaimTypeEnum claimType) {
    
    
    
    this.claimType = claimType;
  }


  public Claim rejectReason(String rejectReason) {
    
    
    
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * The reject reason of the claim.
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "reject reason", value = "The reject reason of the claim.")

  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    
    
    
    this.rejectReason = rejectReason;
  }


  public Claim claimDetails(List<ClaimClaimDetailsInner> claimDetails) {
    
    
    
    
    this.claimDetails = claimDetails;
    return this;
  }

  public Claim addClaimDetailsItem(ClaimClaimDetailsInner claimDetailsItem) {
    if (this.claimDetails == null) {
      this.claimDetails = new ArrayList<>();
    }
    this.claimDetails.add(claimDetailsItem);
    return this;
  }

   /**
   * Items related to the claim
   * @return claimDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"line_item_id\":\"12345678\",\"quantity\":2,\"reason\":\"not_fit\"}]", value = "Items related to the claim")

  public List<ClaimClaimDetailsInner> getClaimDetails() {
    return claimDetails;
  }


  public void setClaimDetails(List<ClaimClaimDetailsInner> claimDetails) {
    
    
    
    this.claimDetails = claimDetails;
  }


  public Claim updatedTs(OffsetDateTime updatedTs) {
    
    
    
    
    this.updatedTs = updatedTs;
    return this;
  }

   /**
   * The timestamp in milliseconds when the contract was cancelled (if applicable).
   * @return updatedTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp in milliseconds when the contract was cancelled (if applicable).")

  public OffsetDateTime getUpdatedTs() {
    return updatedTs;
  }


  public void setUpdatedTs(OffsetDateTime updatedTs) {
    
    
    
    this.updatedTs = updatedTs;
  }


  public Claim createdTs(OffsetDateTime createdTs) {
    
    
    
    
    this.createdTs = createdTs;
    return this;
  }

   /**
   * The timestamp in milliseconds when the contract was created.
   * @return createdTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp in milliseconds when the contract was created.")

  public OffsetDateTime getCreatedTs() {
    return createdTs;
  }


  public void setCreatedTs(OffsetDateTime createdTs) {
    
    
    
    this.createdTs = createdTs;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Claim instance itself
   */
  public Claim putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Claim claim = (Claim) o;
    return Objects.equals(this.claimId, claim.claimId) &&
        Objects.equals(this.orderId, claim.orderId) &&
        Objects.equals(this.contractId, claim.contractId) &&
        Objects.equals(this.payoutAmount, claim.payoutAmount) &&
        Objects.equals(this.status, claim.status) &&
        Objects.equals(this.claimType, claim.claimType) &&
        Objects.equals(this.rejectReason, claim.rejectReason) &&
        Objects.equals(this.claimDetails, claim.claimDetails) &&
        Objects.equals(this.updatedTs, claim.updatedTs) &&
        Objects.equals(this.createdTs, claim.createdTs)&&
        Objects.equals(this.additionalProperties, claim.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, orderId, contractId, payoutAmount, status, claimType, rejectReason, claimDetails, updatedTs, createdTs, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Claim {\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    claimType: ").append(toIndentedString(claimType)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    claimDetails: ").append(toIndentedString(claimDetails)).append("\n");
    sb.append("    updatedTs: ").append(toIndentedString(updatedTs)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("claim_id");
    openapiFields.add("order_id");
    openapiFields.add("contract_id");
    openapiFields.add("payout_amount");
    openapiFields.add("status");
    openapiFields.add("claim_type");
    openapiFields.add("reject_reason");
    openapiFields.add("claim_details");
    openapiFields.add("updated_ts");
    openapiFields.add("created_ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Claim
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Claim.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Claim is not found in the empty JSON string", Claim.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("claim_id") != null && !jsonObj.get("claim_id").isJsonNull()) && !jsonObj.get("claim_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claim_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claim_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("claim_type") != null && !jsonObj.get("claim_type").isJsonNull()) && !jsonObj.get("claim_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claim_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claim_type").toString()));
      }
      if ((jsonObj.get("reject_reason") != null && !jsonObj.get("reject_reason").isJsonNull()) && !jsonObj.get("reject_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reject_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reject_reason").toString()));
      }
      if (jsonObj.get("claim_details") != null && !jsonObj.get("claim_details").isJsonNull()) {
        JsonArray jsonArrayclaimDetails = jsonObj.getAsJsonArray("claim_details");
        if (jsonArrayclaimDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("claim_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `claim_details` to be an array in the JSON string but got `%s`", jsonObj.get("claim_details").toString()));
          }

          // validate the optional field `claim_details` (array)
          for (int i = 0; i < jsonArrayclaimDetails.size(); i++) {
            ClaimClaimDetailsInner.validateJsonObject(jsonArrayclaimDetails.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Claim.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Claim' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Claim> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Claim.class));

       return (TypeAdapter<T>) new TypeAdapter<Claim>() {
           @Override
           public void write(JsonWriter out, Claim value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Claim read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Claim instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Claim given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Claim
  * @throws IOException if the JSON string is invalid with respect to Claim
  */
  public static Claim fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Claim.class);
  }

 /**
  * Convert an instance of Claim to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

