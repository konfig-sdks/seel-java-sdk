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
 * ProductPlan
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductPlan {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private URI imageUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_TERM_LENGTH = "term_length";
  @SerializedName(SERIALIZED_NAME_TERM_LENGTH)
  private Integer termLength;

  public static final String SERIALIZED_NAME_COVERAGE_STARTS = "coverage_starts";
  @SerializedName(SERIALIZED_NAME_COVERAGE_STARTS)
  private String coverageStarts;

  public static final String SERIALIZED_NAME_COVERAGE_INCLUDES = "coverage_includes";
  @SerializedName(SERIALIZED_NAME_COVERAGE_INCLUDES)
  private String coverageIncludes;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_REPLACEMENT_TYPE = "replacement_type";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_TYPE)
  private String replacementType;

  public static final String SERIALIZED_NAME_DEDUCTIBLE = "deductible";
  @SerializedName(SERIALIZED_NAME_DEDUCTIBLE)
  private Double deductible;

  public ProductPlan() {
  }

  public ProductPlan description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the protection plan.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This plan provides coverage for one year.", value = "Description of the protection plan.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProductPlan id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * ID of the protection plan.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "ID of the protection plan.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ProductPlan name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the protection plan.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1 year warranty", required = true, value = "Name of the protection plan.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProductPlan price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Price of the plan.
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "49.99", required = true, value = "Price of the plan.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public ProductPlan currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code (ISO 4217 format).
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "The three-letter currency code (ISO 4217 format).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public ProductPlan imageUrl(URI imageUrl) {
    
    
    
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The imageUrl for the warranty plan. Use this as the product image for the warranty plan SKU(s) in your store.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/warranty.jpg", value = "The imageUrl for the warranty plan. Use this as the product image for the warranty plan SKU(s) in your store.")

  public URI getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(URI imageUrl) {
    
    
    
    this.imageUrl = imageUrl;
  }


  public ProductPlan url(URI url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * A link to the extended warranty plan terms and information. Any offer display must include a “Learn More” or “See Plan Details” call-to-action that enables the customer to see exactly what the warranty plan covers.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/warranty-terms", value = "A link to the extended warranty plan terms and information. Any offer display must include a “Learn More” or “See Plan Details” call-to-action that enables the customer to see exactly what the warranty plan covers.")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    
    
    
    this.url = url;
  }


  public ProductPlan termLength(Integer termLength) {
    
    
    
    
    this.termLength = termLength;
    return this;
  }

   /**
   * The length of term in months.
   * @return termLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "The length of term in months.")

  public Integer getTermLength() {
    return termLength;
  }


  public void setTermLength(Integer termLength) {
    
    
    
    this.termLength = termLength;
  }


  public ProductPlan coverageStarts(String coverageStarts) {
    
    
    
    
    this.coverageStarts = coverageStarts;
    return this;
  }

   /**
   * \&quot;immediate\&quot; - right after purchase \&quot;after\&quot; - coverage starts after the manufacturer&#39;s warranty has expired
   * @return coverageStarts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "immediate", required = true, value = "\"immediate\" - right after purchase \"after\" - coverage starts after the manufacturer's warranty has expired")

  public String getCoverageStarts() {
    return coverageStarts;
  }


  public void setCoverageStarts(String coverageStarts) {
    
    
    
    this.coverageStarts = coverageStarts;
  }


  public ProductPlan coverageIncludes(String coverageIncludes) {
    
    
    
    
    this.coverageIncludes = coverageIncludes;
    return this;
  }

   /**
   * \&quot;base”, which means the extended warranty is a base plan covering mechanical and electrical failures through normal use, or “adh”, which means the plan includes coverage for accidental damage (i.e. “Accidental Damage in Handling”)
   * @return coverageIncludes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "base", required = true, value = "\"base”, which means the extended warranty is a base plan covering mechanical and electrical failures through normal use, or “adh”, which means the plan includes coverage for accidental damage (i.e. “Accidental Damage in Handling”)")

  public String getCoverageIncludes() {
    return coverageIncludes;
  }


  public void setCoverageIncludes(String coverageIncludes) {
    
    
    
    this.coverageIncludes = coverageIncludes;
  }


  public ProductPlan serviceType(String serviceType) {
    
    
    
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * “replacement” (the damaged item is replaced by a new or refurbished equivalent), “repair_depot” (the customer mails the damaged item to a repair facility), or “repair_onsite” (a repair technician goes out to the customer’s home to repair the item)
   * @return serviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "replacement", required = true, value = "“replacement” (the damaged item is replaced by a new or refurbished equivalent), “repair_depot” (the customer mails the damaged item to a repair facility), or “repair_onsite” (a repair technician goes out to the customer’s home to repair the item)")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    
    
    
    this.serviceType = serviceType;
  }


  public ProductPlan replacementType(String replacementType) {
    
    
    
    
    this.replacementType = replacementType;
    return this;
  }

   /**
   * Indicates whether the damaged item will be replaced by a “new” or “refurbished” item.
   * @return replacementType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "new", required = true, value = "Indicates whether the damaged item will be replaced by a “new” or “refurbished” item.")

  public String getReplacementType() {
    return replacementType;
  }


  public void setReplacementType(String replacementType) {
    
    
    
    this.replacementType = replacementType;
  }


  public ProductPlan deductible(Double deductible) {
    
    
    
    
    this.deductible = deductible;
    return this;
  }

   /**
   * The amount of the deductible charged to the customer during a claim, if there is one. For most Extend protection plans, there is no deductible.
   * @return deductible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The amount of the deductible charged to the customer during a claim, if there is one. For most Extend protection plans, there is no deductible.")

  public Double getDeductible() {
    return deductible;
  }


  public void setDeductible(Double deductible) {
    
    
    
    this.deductible = deductible;
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
   * @return the ProductPlan instance itself
   */
  public ProductPlan putAdditionalProperty(String key, Object value) {
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
    ProductPlan productPlan = (ProductPlan) o;
    return Objects.equals(this.description, productPlan.description) &&
        Objects.equals(this.id, productPlan.id) &&
        Objects.equals(this.name, productPlan.name) &&
        Objects.equals(this.price, productPlan.price) &&
        Objects.equals(this.currency, productPlan.currency) &&
        Objects.equals(this.imageUrl, productPlan.imageUrl) &&
        Objects.equals(this.url, productPlan.url) &&
        Objects.equals(this.termLength, productPlan.termLength) &&
        Objects.equals(this.coverageStarts, productPlan.coverageStarts) &&
        Objects.equals(this.coverageIncludes, productPlan.coverageIncludes) &&
        Objects.equals(this.serviceType, productPlan.serviceType) &&
        Objects.equals(this.replacementType, productPlan.replacementType) &&
        Objects.equals(this.deductible, productPlan.deductible)&&
        Objects.equals(this.additionalProperties, productPlan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, price, currency, imageUrl, url, termLength, coverageStarts, coverageIncludes, serviceType, replacementType, deductible, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPlan {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    termLength: ").append(toIndentedString(termLength)).append("\n");
    sb.append("    coverageStarts: ").append(toIndentedString(coverageStarts)).append("\n");
    sb.append("    coverageIncludes: ").append(toIndentedString(coverageIncludes)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    replacementType: ").append(toIndentedString(replacementType)).append("\n");
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("currency");
    openapiFields.add("image_url");
    openapiFields.add("url");
    openapiFields.add("term_length");
    openapiFields.add("coverage_starts");
    openapiFields.add("coverage_includes");
    openapiFields.add("service_type");
    openapiFields.add("replacement_type");
    openapiFields.add("deductible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("term_length");
    openapiRequiredFields.add("coverage_starts");
    openapiRequiredFields.add("coverage_includes");
    openapiRequiredFields.add("service_type");
    openapiRequiredFields.add("replacement_type");
    openapiRequiredFields.add("deductible");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductPlan is not found in the empty JSON string", ProductPlan.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductPlan.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("coverage_starts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverage_starts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverage_starts").toString()));
      }
      if (!jsonObj.get("coverage_includes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverage_includes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverage_includes").toString()));
      }
      if (!jsonObj.get("service_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_type").toString()));
      }
      if (!jsonObj.get("replacement_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replacement_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replacement_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductPlan>() {
           @Override
           public void write(JsonWriter out, ProductPlan value) throws IOException {
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
           public ProductPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductPlan instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductPlan
  * @throws IOException if the JSON string is invalid with respect to ProductPlan
  */
  public static ProductPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductPlan.class);
  }

 /**
  * Convert an instance of ProductPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

