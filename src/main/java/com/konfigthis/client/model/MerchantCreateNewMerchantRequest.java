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
import com.konfigthis.client.model.MerchantCreateNewMerchantRequestSeelServicesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * MerchantCreateNewMerchantRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantCreateNewMerchantRequest {
  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_ADMIN_DOMAIN = "admin_domain";
  @SerializedName(SERIALIZED_NAME_ADMIN_DOMAIN)
  private String adminDomain;

  public static final String SERIALIZED_NAME_SHOP_DOMAIN = "shop_domain";
  @SerializedName(SERIALIZED_NAME_SHOP_DOMAIN)
  private String shopDomain;

  public static final String SERIALIZED_NAME_SHOP_PLATFORM = "shop_platform";
  @SerializedName(SERIALIZED_NAME_SHOP_PLATFORM)
  private String shopPlatform;

  public static final String SERIALIZED_NAME_SHOP_CURRENCY = "shop_currency";
  @SerializedName(SERIALIZED_NAME_SHOP_CURRENCY)
  private String shopCurrency;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contact_email";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public static final String SERIALIZED_NAME_CONTACT_PHONE_NUMBER = "contact_phone_number";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE_NUMBER)
  private String contactPhoneNumber;

  public static final String SERIALIZED_NAME_SEEL_SERVICES = "seel_services";
  @SerializedName(SERIALIZED_NAME_SEEL_SERVICES)
  private List<MerchantCreateNewMerchantRequestSeelServicesInner> seelServices = new ArrayList<>();

  public MerchantCreateNewMerchantRequest() {
  }

  public MerchantCreateNewMerchantRequest shopId(String shopId) {
    
    
    
    
    this.shopId = shopId;
    return this;
  }

   /**
   * The identifier for the shop or store within the partner&#39;s platform.
   * @return shopId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "shop123", required = true, value = "The identifier for the shop or store within the partner's platform.")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    
    
    
    this.shopId = shopId;
  }


  public MerchantCreateNewMerchantRequest adminDomain(String adminDomain) {
    
    
    
    
    this.adminDomain = adminDomain;
    return this;
  }

   /**
   * The original subdomain domain for the shop provided by the ecommerce platform, e.g. subdomain.myshopify.com
   * @return adminDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "shop.myshopify.com", required = true, value = "The original subdomain domain for the shop provided by the ecommerce platform, e.g. subdomain.myshopify.com")

  public String getAdminDomain() {
    return adminDomain;
  }


  public void setAdminDomain(String adminDomain) {
    
    
    
    this.adminDomain = adminDomain;
  }


  public MerchantCreateNewMerchantRequest shopDomain(String shopDomain) {
    
    
    
    
    this.shopDomain = shopDomain;
    return this;
  }

   /**
   * The custom domain name assigned to the shop, e.g. www.myshop.com.
   * @return shopDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "www.myshop.com", required = true, value = "The custom domain name assigned to the shop, e.g. www.myshop.com.")

  public String getShopDomain() {
    return shopDomain;
  }


  public void setShopDomain(String shopDomain) {
    
    
    
    this.shopDomain = shopDomain;
  }


  public MerchantCreateNewMerchantRequest shopPlatform(String shopPlatform) {
    
    
    
    
    this.shopPlatform = shopPlatform;
    return this;
  }

   /**
   * The source ecommerce platform for the shop, e.g. Shopify, BigCommerce.
   * @return shopPlatform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Shopify", required = true, value = "The source ecommerce platform for the shop, e.g. Shopify, BigCommerce.")

  public String getShopPlatform() {
    return shopPlatform;
  }


  public void setShopPlatform(String shopPlatform) {
    
    
    
    this.shopPlatform = shopPlatform;
  }


  public MerchantCreateNewMerchantRequest shopCurrency(String shopCurrency) {
    
    
    
    
    this.shopCurrency = shopCurrency;
    return this;
  }

   /**
   * 3-letter ISO 4217 currency code for the primary currency used in the shop, e.g. USD, EUR.
   * @return shopCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "3-letter ISO 4217 currency code for the primary currency used in the shop, e.g. USD, EUR.")

  public String getShopCurrency() {
    return shopCurrency;
  }


  public void setShopCurrency(String shopCurrency) {
    
    
    
    this.shopCurrency = shopCurrency;
  }


  public MerchantCreateNewMerchantRequest shopName(String shopName) {
    
    
    
    
    this.shopName = shopName;
    return this;
  }

   /**
   * The registered business name for the shop.
   * @return shopName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Shop", required = true, value = "The registered business name for the shop.")

  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    
    
    
    this.shopName = shopName;
  }


  public MerchantCreateNewMerchantRequest contactName(String contactName) {
    
    
    
    
    this.contactName = contactName;
    return this;
  }

   /**
   * The registered business name for the merchant.
   * @return contactName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Shop", required = true, value = "The registered business name for the merchant.")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    
    
    
    this.contactName = contactName;
  }


  public MerchantCreateNewMerchantRequest contactEmail(String contactEmail) {
    
    
    
    
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * The contact email address on file for the merchant.
   * @return contactEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "contact@myshop.com", required = true, value = "The contact email address on file for the merchant.")

  public String getContactEmail() {
    return contactEmail;
  }


  public void setContactEmail(String contactEmail) {
    
    
    
    this.contactEmail = contactEmail;
  }


  public MerchantCreateNewMerchantRequest contactPhoneNumber(String contactPhoneNumber) {
    
    
    
    
    this.contactPhoneNumber = contactPhoneNumber;
    return this;
  }

   /**
   * The phone number on file for the merchant.
   * @return contactPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "555-1234", value = "The phone number on file for the merchant.")

  public String getContactPhoneNumber() {
    return contactPhoneNumber;
  }


  public void setContactPhoneNumber(String contactPhoneNumber) {
    
    
    
    this.contactPhoneNumber = contactPhoneNumber;
  }


  public MerchantCreateNewMerchantRequest seelServices(List<MerchantCreateNewMerchantRequestSeelServicesInner> seelServices) {
    
    
    
    
    this.seelServices = seelServices;
    return this;
  }

  public MerchantCreateNewMerchantRequest addSeelServicesItem(MerchantCreateNewMerchantRequestSeelServicesInner seelServicesItem) {
    this.seelServices.add(seelServicesItem);
    return this;
  }

   /**
   * Get seelServices
   * @return seelServices
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MerchantCreateNewMerchantRequestSeelServicesInner> getSeelServices() {
    return seelServices;
  }


  public void setSeelServices(List<MerchantCreateNewMerchantRequestSeelServicesInner> seelServices) {
    
    
    
    this.seelServices = seelServices;
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
   * @return the MerchantCreateNewMerchantRequest instance itself
   */
  public MerchantCreateNewMerchantRequest putAdditionalProperty(String key, Object value) {
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
    MerchantCreateNewMerchantRequest merchantCreateNewMerchantRequest = (MerchantCreateNewMerchantRequest) o;
    return Objects.equals(this.shopId, merchantCreateNewMerchantRequest.shopId) &&
        Objects.equals(this.adminDomain, merchantCreateNewMerchantRequest.adminDomain) &&
        Objects.equals(this.shopDomain, merchantCreateNewMerchantRequest.shopDomain) &&
        Objects.equals(this.shopPlatform, merchantCreateNewMerchantRequest.shopPlatform) &&
        Objects.equals(this.shopCurrency, merchantCreateNewMerchantRequest.shopCurrency) &&
        Objects.equals(this.shopName, merchantCreateNewMerchantRequest.shopName) &&
        Objects.equals(this.contactName, merchantCreateNewMerchantRequest.contactName) &&
        Objects.equals(this.contactEmail, merchantCreateNewMerchantRequest.contactEmail) &&
        Objects.equals(this.contactPhoneNumber, merchantCreateNewMerchantRequest.contactPhoneNumber) &&
        Objects.equals(this.seelServices, merchantCreateNewMerchantRequest.seelServices)&&
        Objects.equals(this.additionalProperties, merchantCreateNewMerchantRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, adminDomain, shopDomain, shopPlatform, shopCurrency, shopName, contactName, contactEmail, contactPhoneNumber, seelServices, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCreateNewMerchantRequest {\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    adminDomain: ").append(toIndentedString(adminDomain)).append("\n");
    sb.append("    shopDomain: ").append(toIndentedString(shopDomain)).append("\n");
    sb.append("    shopPlatform: ").append(toIndentedString(shopPlatform)).append("\n");
    sb.append("    shopCurrency: ").append(toIndentedString(shopCurrency)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhoneNumber: ").append(toIndentedString(contactPhoneNumber)).append("\n");
    sb.append("    seelServices: ").append(toIndentedString(seelServices)).append("\n");
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
    openapiFields.add("shop_id");
    openapiFields.add("admin_domain");
    openapiFields.add("shop_domain");
    openapiFields.add("shop_platform");
    openapiFields.add("shop_currency");
    openapiFields.add("shop_name");
    openapiFields.add("contact_name");
    openapiFields.add("contact_email");
    openapiFields.add("contact_phone_number");
    openapiFields.add("seel_services");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shop_id");
    openapiRequiredFields.add("admin_domain");
    openapiRequiredFields.add("shop_domain");
    openapiRequiredFields.add("shop_platform");
    openapiRequiredFields.add("shop_currency");
    openapiRequiredFields.add("shop_name");
    openapiRequiredFields.add("contact_name");
    openapiRequiredFields.add("contact_email");
    openapiRequiredFields.add("seel_services");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantCreateNewMerchantRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantCreateNewMerchantRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantCreateNewMerchantRequest is not found in the empty JSON string", MerchantCreateNewMerchantRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MerchantCreateNewMerchantRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (!jsonObj.get("admin_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin_domain").toString()));
      }
      if (!jsonObj.get("shop_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_domain").toString()));
      }
      if (!jsonObj.get("shop_platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_platform").toString()));
      }
      if (!jsonObj.get("shop_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_currency").toString()));
      }
      if (!jsonObj.get("shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_name").toString()));
      }
      if (!jsonObj.get("contact_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_name").toString()));
      }
      if (!jsonObj.get("contact_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_email").toString()));
      }
      if ((jsonObj.get("contact_phone_number") != null && !jsonObj.get("contact_phone_number").isJsonNull()) && !jsonObj.get("contact_phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_phone_number").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("seel_services").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `seel_services` to be an array in the JSON string but got `%s`", jsonObj.get("seel_services").toString()));
      }

      JsonArray jsonArrayseelServices = jsonObj.getAsJsonArray("seel_services");
      // validate the required field `seel_services` (array)
      for (int i = 0; i < jsonArrayseelServices.size(); i++) {
        MerchantCreateNewMerchantRequestSeelServicesInner.validateJsonObject(jsonArrayseelServices.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantCreateNewMerchantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantCreateNewMerchantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantCreateNewMerchantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantCreateNewMerchantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantCreateNewMerchantRequest>() {
           @Override
           public void write(JsonWriter out, MerchantCreateNewMerchantRequest value) throws IOException {
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
           public MerchantCreateNewMerchantRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantCreateNewMerchantRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantCreateNewMerchantRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantCreateNewMerchantRequest
  * @throws IOException if the JSON string is invalid with respect to MerchantCreateNewMerchantRequest
  */
  public static MerchantCreateNewMerchantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantCreateNewMerchantRequest.class);
  }

 /**
  * Convert an instance of MerchantCreateNewMerchantRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
