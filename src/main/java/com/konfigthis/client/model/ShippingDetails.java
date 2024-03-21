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
 * ShippingDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ShippingDetails {
  public static final String SERIALIZED_NAME_WEIGHT_G = "weight_g";
  @SerializedName(SERIALIZED_NAME_WEIGHT_G)
  private Double weightG;

  public static final String SERIALIZED_NAME_LENGTH_CM = "length_cm";
  @SerializedName(SERIALIZED_NAME_LENGTH_CM)
  private Double lengthCm;

  public static final String SERIALIZED_NAME_HEIGHT_CM = "height_cm";
  @SerializedName(SERIALIZED_NAME_HEIGHT_CM)
  private Double heightCm;

  public static final String SERIALIZED_NAME_WIDTH_CM = "width_cm";
  @SerializedName(SERIALIZED_NAME_WIDTH_CM)
  private Double widthCm;

  public static final String SERIALIZED_NAME_SHIPPING_COST = "shipping_cost";
  @SerializedName(SERIALIZED_NAME_SHIPPING_COST)
  private Double shippingCost;

  public ShippingDetails() {
  }

  public ShippingDetails weightG(Double weightG) {
    
    
    
    
    this.weightG = weightG;
    return this;
  }

   /**
   * The weight of the line item in grams. Used to calculate shipping costs.
   * @return weightG
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.99", value = "The weight of the line item in grams. Used to calculate shipping costs.")

  public Double getWeightG() {
    return weightG;
  }


  public void setWeightG(Double weightG) {
    
    
    
    this.weightG = weightG;
  }


  public ShippingDetails lengthCm(Double lengthCm) {
    
    
    
    
    this.lengthCm = lengthCm;
    return this;
  }

   /**
   * The length of the line item package in centimeters.
   * @return lengthCm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.99", value = "The length of the line item package in centimeters.")

  public Double getLengthCm() {
    return lengthCm;
  }


  public void setLengthCm(Double lengthCm) {
    
    
    
    this.lengthCm = lengthCm;
  }


  public ShippingDetails heightCm(Double heightCm) {
    
    
    
    
    this.heightCm = heightCm;
    return this;
  }

   /**
   * The height of the line item package in centimeters.
   * @return heightCm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.99", value = "The height of the line item package in centimeters.")

  public Double getHeightCm() {
    return heightCm;
  }


  public void setHeightCm(Double heightCm) {
    
    
    
    this.heightCm = heightCm;
  }


  public ShippingDetails widthCm(Double widthCm) {
    
    
    
    
    this.widthCm = widthCm;
    return this;
  }

   /**
   * The width of the line item package in centimeters.
   * @return widthCm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.99", value = "The width of the line item package in centimeters.")

  public Double getWidthCm() {
    return widthCm;
  }


  public void setWidthCm(Double widthCm) {
    
    
    
    this.widthCm = widthCm;
  }


  public ShippingDetails shippingCost(Double shippingCost) {
    
    
    
    
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * The calculated shipping cost for delivering this particular line item
   * @return shippingCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.99", value = "The calculated shipping cost for delivering this particular line item")

  public Double getShippingCost() {
    return shippingCost;
  }


  public void setShippingCost(Double shippingCost) {
    
    
    
    this.shippingCost = shippingCost;
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
   * @return the ShippingDetails instance itself
   */
  public ShippingDetails putAdditionalProperty(String key, Object value) {
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
    ShippingDetails shippingDetails = (ShippingDetails) o;
    return Objects.equals(this.weightG, shippingDetails.weightG) &&
        Objects.equals(this.lengthCm, shippingDetails.lengthCm) &&
        Objects.equals(this.heightCm, shippingDetails.heightCm) &&
        Objects.equals(this.widthCm, shippingDetails.widthCm) &&
        Objects.equals(this.shippingCost, shippingDetails.shippingCost)&&
        Objects.equals(this.additionalProperties, shippingDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weightG, lengthCm, heightCm, widthCm, shippingCost, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingDetails {\n");
    sb.append("    weightG: ").append(toIndentedString(weightG)).append("\n");
    sb.append("    lengthCm: ").append(toIndentedString(lengthCm)).append("\n");
    sb.append("    heightCm: ").append(toIndentedString(heightCm)).append("\n");
    sb.append("    widthCm: ").append(toIndentedString(widthCm)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
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
    openapiFields.add("weight_g");
    openapiFields.add("length_cm");
    openapiFields.add("height_cm");
    openapiFields.add("width_cm");
    openapiFields.add("shipping_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingDetails is not found in the empty JSON string", ShippingDetails.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingDetails>() {
           @Override
           public void write(JsonWriter out, ShippingDetails value) throws IOException {
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
           public ShippingDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ShippingDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ShippingDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingDetails
  * @throws IOException if the JSON string is invalid with respect to ShippingDetails
  */
  public static ShippingDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingDetails.class);
  }

 /**
  * Convert an instance of ShippingDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
