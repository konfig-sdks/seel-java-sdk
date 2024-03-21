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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * EventCreateNewEventRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventCreateNewEventRequest {
  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_EVENT_TS = "event_ts";
  @SerializedName(SERIALIZED_NAME_EVENT_TS)
  private String eventTs;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_CLIENT_IP = "client_ip";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP)
  private String clientIp;

  public static final String SERIALIZED_NAME_EVENT_SOURCE = "event_source";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private String eventSource;

  /**
   * Event type
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
 public enum EventTypeEnum {
    PRODUCT_PAGE_ENTER("product_page_enter"),
    
    PRODUCT_PAGE_EXIT("product_page_exit"),
    
    PRODUCT_SHARE("product_share"),
    
    FAVORITE_ADD("favorite_add"),
    
    FAVORITE_REMOVE("favorite_remove"),
    
    CART_ADD("cart_add"),
    
    CART_REMOVE("cart_remove"),
    
    RA_CHECKED("ra_checked"),
    
    RA_UNCHECKED("ra_unchecked"),
    
    CHECKOUT_BEGIN("checkout_begin"),
    
    CHECKOUT_COMPLETE("checkout_complete");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  public static final String SERIALIZED_NAME_EVENT_INFO = "event_info";
  @SerializedName(SERIALIZED_NAME_EVENT_INFO)
  private Object eventInfo;

  public EventCreateNewEventRequest() {
  }

  public EventCreateNewEventRequest sessionId(String sessionId) {
    
    
    
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Session ID
   * @return sessionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1680749645592", required = true, value = "Session ID")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    
    
    
    this.sessionId = sessionId;
  }


  public EventCreateNewEventRequest eventTs(String eventTs) {
    
    
    
    
    this.eventTs = eventTs;
    return this;
  }

   /**
   * Event created timestamp in milliseconds
   * @return eventTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1680749645592", value = "Event created timestamp in milliseconds")

  public String getEventTs() {
    return eventTs;
  }


  public void setEventTs(String eventTs) {
    
    
    
    this.eventTs = eventTs;
  }


  public EventCreateNewEventRequest customerId(String customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer ID
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "229413056", required = true, value = "Customer ID")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    
    
    
    this.customerId = customerId;
  }


  public EventCreateNewEventRequest deviceId(String deviceId) {
    
    
    
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device ID
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3kGv6F1i8L", value = "Device ID")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    
    
    
    this.deviceId = deviceId;
  }


  public EventCreateNewEventRequest clientIp(String clientIp) {
    
    
    
    
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Browser IP address
   * @return clientIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64.64.230.190", value = "Browser IP address")

  public String getClientIp() {
    return clientIp;
  }


  public void setClientIp(String clientIp) {
    
    
    
    this.clientIp = clientIp;
  }


  public EventCreateNewEventRequest eventSource(String eventSource) {
    
    
    
    
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Event source
   * @return eventSource
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "web", required = true, value = "Event source")

  public String getEventSource() {
    return eventSource;
  }


  public void setEventSource(String eventSource) {
    
    
    
    this.eventSource = eventSource;
  }


  public EventCreateNewEventRequest eventType(EventTypeEnum eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Event type
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CART_ADD", required = true, value = "Event type")

  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    
    
    
    this.eventType = eventType;
  }


  public EventCreateNewEventRequest eventInfo(Object eventInfo) {
    
    
    
    
    this.eventInfo = eventInfo;
    return this;
  }

   /**
   * Each event_type has its own unique schema. For specific details, please refer to the custom pixel guide.
   * @return eventInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{}", required = true, value = "Each event_type has its own unique schema. For specific details, please refer to the custom pixel guide.")

  public Object getEventInfo() {
    return eventInfo;
  }


  public void setEventInfo(Object eventInfo) {
    
    
    
    this.eventInfo = eventInfo;
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
   * @return the EventCreateNewEventRequest instance itself
   */
  public EventCreateNewEventRequest putAdditionalProperty(String key, Object value) {
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
    EventCreateNewEventRequest eventCreateNewEventRequest = (EventCreateNewEventRequest) o;
    return Objects.equals(this.sessionId, eventCreateNewEventRequest.sessionId) &&
        Objects.equals(this.eventTs, eventCreateNewEventRequest.eventTs) &&
        Objects.equals(this.customerId, eventCreateNewEventRequest.customerId) &&
        Objects.equals(this.deviceId, eventCreateNewEventRequest.deviceId) &&
        Objects.equals(this.clientIp, eventCreateNewEventRequest.clientIp) &&
        Objects.equals(this.eventSource, eventCreateNewEventRequest.eventSource) &&
        Objects.equals(this.eventType, eventCreateNewEventRequest.eventType) &&
        Objects.equals(this.eventInfo, eventCreateNewEventRequest.eventInfo)&&
        Objects.equals(this.additionalProperties, eventCreateNewEventRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, eventTs, customerId, deviceId, clientIp, eventSource, eventType, eventInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCreateNewEventRequest {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    eventTs: ").append(toIndentedString(eventTs)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
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
    openapiFields.add("session_id");
    openapiFields.add("event_ts");
    openapiFields.add("customer_id");
    openapiFields.add("device_id");
    openapiFields.add("client_ip");
    openapiFields.add("event_source");
    openapiFields.add("event_type");
    openapiFields.add("event_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("session_id");
    openapiRequiredFields.add("customer_id");
    openapiRequiredFields.add("event_source");
    openapiRequiredFields.add("event_type");
    openapiRequiredFields.add("event_info");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventCreateNewEventRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventCreateNewEventRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCreateNewEventRequest is not found in the empty JSON string", EventCreateNewEventRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCreateNewEventRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
      if ((jsonObj.get("event_ts") != null && !jsonObj.get("event_ts").isJsonNull()) && !jsonObj.get("event_ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_ts").toString()));
      }
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("device_id") != null && !jsonObj.get("device_id").isJsonNull()) && !jsonObj.get("device_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id").toString()));
      }
      if ((jsonObj.get("client_ip") != null && !jsonObj.get("client_ip").isJsonNull()) && !jsonObj.get("client_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip").toString()));
      }
      if (!jsonObj.get("event_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_source").toString()));
      }
      if (!jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCreateNewEventRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCreateNewEventRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCreateNewEventRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCreateNewEventRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCreateNewEventRequest>() {
           @Override
           public void write(JsonWriter out, EventCreateNewEventRequest value) throws IOException {
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
           public EventCreateNewEventRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventCreateNewEventRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventCreateNewEventRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCreateNewEventRequest
  * @throws IOException if the JSON string is invalid with respect to EventCreateNewEventRequest
  */
  public static EventCreateNewEventRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCreateNewEventRequest.class);
  }

 /**
  * Convert an instance of EventCreateNewEventRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

