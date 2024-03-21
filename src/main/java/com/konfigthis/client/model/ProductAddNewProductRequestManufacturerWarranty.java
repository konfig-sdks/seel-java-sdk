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
import java.net.URI;

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
 * Information about the manufacturer&#39;s warranty. This is optional, but if you can provide it please do as it can significantly speed up the warranty matching process.
 */
@ApiModel(description = "Information about the manufacturer's warranty. This is optional, but if you can provide it please do as it can significantly speed up the warranty matching process.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductAddNewProductRequestManufacturerWarranty {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_TERM_LENGTH = "term_length";
  @SerializedName(SERIALIZED_NAME_TERM_LENGTH)
  private Double termLength;

  public ProductAddNewProductRequestManufacturerWarranty() {
  }

  public ProductAddNewProductRequestManufacturerWarranty url(URI url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * A URL linking to the full details of the manufacturer&#39;s warranty, probably on the manufacturer&#39;s website.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/warranty-info", value = "A URL linking to the full details of the manufacturer's warranty, probably on the manufacturer's website.")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    
    
    
    this.url = url;
  }


  public ProductAddNewProductRequestManufacturerWarranty termLength(Double termLength) {
    
    
    
    
    this.termLength = termLength;
    return this;
  }

  public ProductAddNewProductRequestManufacturerWarranty termLength(Integer termLength) {
    
    
    
    
    this.termLength = termLength.doubleValue();
    return this;
  }

   /**
   * The length of the manufacturer warranty coverage in months.
   * @return termLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "The length of the manufacturer warranty coverage in months.")

  public Double getTermLength() {
    return termLength;
  }


  public void setTermLength(Double termLength) {
    
    
    
    this.termLength = termLength;
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
   * @return the ProductAddNewProductRequestManufacturerWarranty instance itself
   */
  public ProductAddNewProductRequestManufacturerWarranty putAdditionalProperty(String key, Object value) {
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
    ProductAddNewProductRequestManufacturerWarranty productAddNewProductRequestManufacturerWarranty = (ProductAddNewProductRequestManufacturerWarranty) o;
    return Objects.equals(this.url, productAddNewProductRequestManufacturerWarranty.url) &&
        Objects.equals(this.termLength, productAddNewProductRequestManufacturerWarranty.termLength)&&
        Objects.equals(this.additionalProperties, productAddNewProductRequestManufacturerWarranty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, termLength, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAddNewProductRequestManufacturerWarranty {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    termLength: ").append(toIndentedString(termLength)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("term_length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductAddNewProductRequestManufacturerWarranty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductAddNewProductRequestManufacturerWarranty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductAddNewProductRequestManufacturerWarranty is not found in the empty JSON string", ProductAddNewProductRequestManufacturerWarranty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductAddNewProductRequestManufacturerWarranty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductAddNewProductRequestManufacturerWarranty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductAddNewProductRequestManufacturerWarranty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductAddNewProductRequestManufacturerWarranty.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductAddNewProductRequestManufacturerWarranty>() {
           @Override
           public void write(JsonWriter out, ProductAddNewProductRequestManufacturerWarranty value) throws IOException {
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
           public ProductAddNewProductRequestManufacturerWarranty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductAddNewProductRequestManufacturerWarranty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductAddNewProductRequestManufacturerWarranty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductAddNewProductRequestManufacturerWarranty
  * @throws IOException if the JSON string is invalid with respect to ProductAddNewProductRequestManufacturerWarranty
  */
  public static ProductAddNewProductRequestManufacturerWarranty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductAddNewProductRequestManufacturerWarranty.class);
  }

 /**
  * Convert an instance of ProductAddNewProductRequestManufacturerWarranty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

