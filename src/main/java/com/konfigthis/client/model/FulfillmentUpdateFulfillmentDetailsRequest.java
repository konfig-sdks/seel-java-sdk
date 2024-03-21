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
import com.konfigthis.client.model.FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * FulfillmentUpdateFulfillmentDetailsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FulfillmentUpdateFulfillmentDetailsRequest {
  public static final String SERIALIZED_NAME_UPDATED_TS = "updated_ts";
  @SerializedName(SERIALIZED_NAME_UPDATED_TS)
  private OffsetDateTime updatedTs;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "tracking_number";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_TRACKING_URL = "tracking_url";
  @SerializedName(SERIALIZED_NAME_TRACKING_URL)
  private String trackingUrl;

  /**
   * The shipping status of the fulfillment
   */
  @JsonAdapter(ShipmentStatusEnum.Adapter.class)
 public enum ShipmentStatusEnum {
    SHIPPED("shipped"),
    
    DELIVERED("delivered");

    private String value;

    ShipmentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShipmentStatusEnum fromValue(String value) {
      for (ShipmentStatusEnum b : ShipmentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShipmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShipmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShipmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShipmentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "shipment_status";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATUS)
  private ShipmentStatusEnum shipmentStatus;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "line_items";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner> lineItems = new ArrayList<>();

  public FulfillmentUpdateFulfillmentDetailsRequest() {
  }

  public FulfillmentUpdateFulfillmentDetailsRequest updatedTs(OffsetDateTime updatedTs) {
    
    
    
    
    this.updatedTs = updatedTs;
    return this;
  }

   /**
   * Fulfillment updated timestamp in milliseconds
   * @return updatedTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Fulfillment updated timestamp in milliseconds")

  public OffsetDateTime getUpdatedTs() {
    return updatedTs;
  }


  public void setUpdatedTs(OffsetDateTime updatedTs) {
    
    
    
    this.updatedTs = updatedTs;
  }


  public FulfillmentUpdateFulfillmentDetailsRequest trackingNumber(String trackingNumber) {
    
    
    
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number of the fulfillment
   * @return trackingNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "YT1231232113", required = true, value = "The tracking number of the fulfillment")

  public String getTrackingNumber() {
    return trackingNumber;
  }


  public void setTrackingNumber(String trackingNumber) {
    
    
    
    this.trackingNumber = trackingNumber;
  }


  public FulfillmentUpdateFulfillmentDetailsRequest carrier(String carrier) {
    
    
    
    
    this.carrier = carrier;
    return this;
  }

   /**
   * The shipping carrier of the fulfillment
   * @return carrier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USPS", required = true, value = "The shipping carrier of the fulfillment")

  public String getCarrier() {
    return carrier;
  }


  public void setCarrier(String carrier) {
    
    
    
    this.carrier = carrier;
  }


  public FulfillmentUpdateFulfillmentDetailsRequest trackingUrl(String trackingUrl) {
    
    
    
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * The tracking url of the fulfillment
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://tools.usps.com/go/TrackConfirmAction_input", value = "The tracking url of the fulfillment")

  public String getTrackingUrl() {
    return trackingUrl;
  }


  public void setTrackingUrl(String trackingUrl) {
    
    
    
    this.trackingUrl = trackingUrl;
  }


  public FulfillmentUpdateFulfillmentDetailsRequest shipmentStatus(ShipmentStatusEnum shipmentStatus) {
    
    
    
    
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * The shipping status of the fulfillment
   * @return shipmentStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DELIVERED", required = true, value = "The shipping status of the fulfillment")

  public ShipmentStatusEnum getShipmentStatus() {
    return shipmentStatus;
  }


  public void setShipmentStatus(ShipmentStatusEnum shipmentStatus) {
    
    
    
    this.shipmentStatus = shipmentStatus;
  }


  public FulfillmentUpdateFulfillmentDetailsRequest lineItems(List<FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner> lineItems) {
    
    
    
    
    this.lineItems = lineItems;
    return this;
  }

  public FulfillmentUpdateFulfillmentDetailsRequest addLineItemsItem(FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The list of items included in the fulfillment.
   * @return lineItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of items included in the fulfillment.")

  public List<FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner> lineItems) {
    
    
    
    this.lineItems = lineItems;
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
   * @return the FulfillmentUpdateFulfillmentDetailsRequest instance itself
   */
  public FulfillmentUpdateFulfillmentDetailsRequest putAdditionalProperty(String key, Object value) {
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
    FulfillmentUpdateFulfillmentDetailsRequest fulfillmentUpdateFulfillmentDetailsRequest = (FulfillmentUpdateFulfillmentDetailsRequest) o;
    return Objects.equals(this.updatedTs, fulfillmentUpdateFulfillmentDetailsRequest.updatedTs) &&
        Objects.equals(this.trackingNumber, fulfillmentUpdateFulfillmentDetailsRequest.trackingNumber) &&
        Objects.equals(this.carrier, fulfillmentUpdateFulfillmentDetailsRequest.carrier) &&
        Objects.equals(this.trackingUrl, fulfillmentUpdateFulfillmentDetailsRequest.trackingUrl) &&
        Objects.equals(this.shipmentStatus, fulfillmentUpdateFulfillmentDetailsRequest.shipmentStatus) &&
        Objects.equals(this.lineItems, fulfillmentUpdateFulfillmentDetailsRequest.lineItems)&&
        Objects.equals(this.additionalProperties, fulfillmentUpdateFulfillmentDetailsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedTs, trackingNumber, carrier, trackingUrl, shipmentStatus, lineItems, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentUpdateFulfillmentDetailsRequest {\n");
    sb.append("    updatedTs: ").append(toIndentedString(updatedTs)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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
    openapiFields.add("updated_ts");
    openapiFields.add("tracking_number");
    openapiFields.add("carrier");
    openapiFields.add("tracking_url");
    openapiFields.add("shipment_status");
    openapiFields.add("line_items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("updated_ts");
    openapiRequiredFields.add("tracking_number");
    openapiRequiredFields.add("carrier");
    openapiRequiredFields.add("shipment_status");
    openapiRequiredFields.add("line_items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FulfillmentUpdateFulfillmentDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FulfillmentUpdateFulfillmentDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentUpdateFulfillmentDetailsRequest is not found in the empty JSON string", FulfillmentUpdateFulfillmentDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FulfillmentUpdateFulfillmentDetailsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("tracking_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_number").toString()));
      }
      if (!jsonObj.get("carrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier").toString()));
      }
      if ((jsonObj.get("tracking_url") != null && !jsonObj.get("tracking_url").isJsonNull()) && !jsonObj.get("tracking_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_url").toString()));
      }
      if (!jsonObj.get("shipment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipment_status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("line_items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_items` to be an array in the JSON string but got `%s`", jsonObj.get("line_items").toString()));
      }

      JsonArray jsonArraylineItems = jsonObj.getAsJsonArray("line_items");
      // validate the required field `line_items` (array)
      for (int i = 0; i < jsonArraylineItems.size(); i++) {
        FulfillmentUpdateFulfillmentDetailsRequestLineItemsInner.validateJsonObject(jsonArraylineItems.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentUpdateFulfillmentDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentUpdateFulfillmentDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentUpdateFulfillmentDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentUpdateFulfillmentDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentUpdateFulfillmentDetailsRequest>() {
           @Override
           public void write(JsonWriter out, FulfillmentUpdateFulfillmentDetailsRequest value) throws IOException {
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
           public FulfillmentUpdateFulfillmentDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FulfillmentUpdateFulfillmentDetailsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FulfillmentUpdateFulfillmentDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FulfillmentUpdateFulfillmentDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to FulfillmentUpdateFulfillmentDetailsRequest
  */
  public static FulfillmentUpdateFulfillmentDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentUpdateFulfillmentDetailsRequest.class);
  }

 /**
  * Convert an instance of FulfillmentUpdateFulfillmentDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
