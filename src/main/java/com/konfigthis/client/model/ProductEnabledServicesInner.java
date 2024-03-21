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
import java.time.OffsetDateTime;

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
 * Information about enabled services for this product.
 */
@ApiModel(description = "Information about enabled services for this product.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductEnabledServicesInner {
  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CREATED_TS = "created_ts";
  @SerializedName(SERIALIZED_NAME_CREATED_TS)
  private OffsetDateTime createdTs;

  public static final String SERIALIZED_NAME_UPDATED_TS = "updated_ts";
  @SerializedName(SERIALIZED_NAME_UPDATED_TS)
  private OffsetDateTime updatedTs;

  public ProductEnabledServicesInner() {
  }

  public ProductEnabledServicesInner serviceType(String serviceType) {
    
    
    
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Service type (e.g., extended-warranty, buyback-guarantee).
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "extended-warranty", value = "Service type (e.g., extended-warranty, buyback-guarantee).")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    
    
    
    this.serviceType = serviceType;
  }


  public ProductEnabledServicesInner isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Enable/disable selling of the service type on this product.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable/disable selling of the service type on this product.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public ProductEnabledServicesInner createdTs(OffsetDateTime createdTs) {
    
    
    
    
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Timestamp when the service was created.
   * @return createdTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-28T10:30Z", value = "Timestamp when the service was created.")

  public OffsetDateTime getCreatedTs() {
    return createdTs;
  }


  public void setCreatedTs(OffsetDateTime createdTs) {
    
    
    
    this.createdTs = createdTs;
  }


  public ProductEnabledServicesInner updatedTs(OffsetDateTime updatedTs) {
    
    
    
    
    this.updatedTs = updatedTs;
    return this;
  }

   /**
   * Timestamp when the service was last updated.
   * @return updatedTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-28T10:30Z", value = "Timestamp when the service was last updated.")

  public OffsetDateTime getUpdatedTs() {
    return updatedTs;
  }


  public void setUpdatedTs(OffsetDateTime updatedTs) {
    
    
    
    this.updatedTs = updatedTs;
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
   * @return the ProductEnabledServicesInner instance itself
   */
  public ProductEnabledServicesInner putAdditionalProperty(String key, Object value) {
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
    ProductEnabledServicesInner productEnabledServicesInner = (ProductEnabledServicesInner) o;
    return Objects.equals(this.serviceType, productEnabledServicesInner.serviceType) &&
        Objects.equals(this.isEnabled, productEnabledServicesInner.isEnabled) &&
        Objects.equals(this.createdTs, productEnabledServicesInner.createdTs) &&
        Objects.equals(this.updatedTs, productEnabledServicesInner.updatedTs)&&
        Objects.equals(this.additionalProperties, productEnabledServicesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, isEnabled, createdTs, updatedTs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEnabledServicesInner {\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    updatedTs: ").append(toIndentedString(updatedTs)).append("\n");
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
    openapiFields.add("service_type");
    openapiFields.add("is_enabled");
    openapiFields.add("created_ts");
    openapiFields.add("updated_ts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductEnabledServicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductEnabledServicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductEnabledServicesInner is not found in the empty JSON string", ProductEnabledServicesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("service_type") != null && !jsonObj.get("service_type").isJsonNull()) && !jsonObj.get("service_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductEnabledServicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductEnabledServicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductEnabledServicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductEnabledServicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductEnabledServicesInner>() {
           @Override
           public void write(JsonWriter out, ProductEnabledServicesInner value) throws IOException {
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
           public ProductEnabledServicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductEnabledServicesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductEnabledServicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductEnabledServicesInner
  * @throws IOException if the JSON string is invalid with respect to ProductEnabledServicesInner
  */
  public static ProductEnabledServicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductEnabledServicesInner.class);
  }

 /**
  * Convert an instance of ProductEnabledServicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

