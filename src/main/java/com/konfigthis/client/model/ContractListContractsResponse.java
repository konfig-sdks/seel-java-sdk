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
import com.konfigthis.client.model.Contract;
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
 * ContractListContractsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContractListContractsResponse {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_CONTRACTS = "contracts";
  @SerializedName(SERIALIZED_NAME_CONTRACTS)
  private List<Contract> contracts = null;

  public ContractListContractsResponse() {
  }

  public ContractListContractsResponse page(Integer page) {
    
    
    
    
    this.page = page;
    return this;
  }

   /**
   * Current page number.
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Current page number.")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    
    
    
    this.page = page;
  }


  public ContractListContractsResponse pageSize(Integer pageSize) {
    
    
    
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of contracts per page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Number of contracts per page.")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    
    
    
    this.pageSize = pageSize;
  }


  public ContractListContractsResponse total(Integer total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Total number of contracts.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of contracts.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    
    
    
    this.total = total;
  }


  public ContractListContractsResponse contracts(List<Contract> contracts) {
    
    
    
    
    this.contracts = contracts;
    return this;
  }

  public ContractListContractsResponse addContractsItem(Contract contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * List of contracts.
   * @return contracts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of contracts.")

  public List<Contract> getContracts() {
    return contracts;
  }


  public void setContracts(List<Contract> contracts) {
    
    
    
    this.contracts = contracts;
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
   * @return the ContractListContractsResponse instance itself
   */
  public ContractListContractsResponse putAdditionalProperty(String key, Object value) {
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
    ContractListContractsResponse contractListContractsResponse = (ContractListContractsResponse) o;
    return Objects.equals(this.page, contractListContractsResponse.page) &&
        Objects.equals(this.pageSize, contractListContractsResponse.pageSize) &&
        Objects.equals(this.total, contractListContractsResponse.total) &&
        Objects.equals(this.contracts, contractListContractsResponse.contracts)&&
        Objects.equals(this.additionalProperties, contractListContractsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, contracts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractListContractsResponse {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total");
    openapiFields.add("contracts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractListContractsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContractListContractsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractListContractsResponse is not found in the empty JSON string", ContractListContractsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("contracts") != null && !jsonObj.get("contracts").isJsonNull()) {
        JsonArray jsonArraycontracts = jsonObj.getAsJsonArray("contracts");
        if (jsonArraycontracts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contracts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contracts` to be an array in the JSON string but got `%s`", jsonObj.get("contracts").toString()));
          }

          // validate the optional field `contracts` (array)
          for (int i = 0; i < jsonArraycontracts.size(); i++) {
            Contract.validateJsonObject(jsonArraycontracts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractListContractsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractListContractsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractListContractsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractListContractsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractListContractsResponse>() {
           @Override
           public void write(JsonWriter out, ContractListContractsResponse value) throws IOException {
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
           public ContractListContractsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContractListContractsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContractListContractsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractListContractsResponse
  * @throws IOException if the JSON string is invalid with respect to ContractListContractsResponse
  */
  public static ContractListContractsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractListContractsResponse.class);
  }

 /**
  * Convert an instance of ContractListContractsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

