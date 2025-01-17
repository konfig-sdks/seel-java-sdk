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
 * InvoiceInvoiceItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceInvoiceItemsInner {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType;

  public static final String SERIALIZED_NAME_CREATED_TS = "created_ts";
  @SerializedName(SERIALIZED_NAME_CREATED_TS)
  private OffsetDateTime createdTs;

  public static final String SERIALIZED_NAME_CANCELLED_TS = "cancelled_ts";
  @SerializedName(SERIALIZED_NAME_CANCELLED_TS)
  private OffsetDateTime cancelledTs;

  public static final String SERIALIZED_NAME_AMOUNT_COLLECTED = "amount_collected";
  @SerializedName(SERIALIZED_NAME_AMOUNT_COLLECTED)
  private Double amountCollected;

  public static final String SERIALIZED_NAME_AMOUNT_RECONCILED = "amount_reconciled";
  @SerializedName(SERIALIZED_NAME_AMOUNT_RECONCILED)
  private Double amountReconciled;

  public InvoiceInvoiceItemsInner() {
  }

  public InvoiceInvoiceItemsInner contractId(String contractId) {
    
    
    
    
    this.contractId = contractId;
    return this;
  }

   /**
   * The ID of the contract sold during the billing cycle.
   * @return contractId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the contract sold during the billing cycle.")

  public String getContractId() {
    return contractId;
  }


  public void setContractId(String contractId) {
    
    
    
    this.contractId = contractId;
  }


  public InvoiceInvoiceItemsInner orderId(String orderId) {
    
    
    
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The ID of the order.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the order.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    
    
    
    this.orderId = orderId;
  }


  public InvoiceInvoiceItemsInner orderNumber(String orderNumber) {
    
    
    
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Order number
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order number")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    
    
    
    this.orderNumber = orderNumber;
  }


  public InvoiceInvoiceItemsInner productType(String productType) {
    
    
    
    
    this.productType = productType;
    return this;
  }

   /**
   * The protection plan name.
   * @return productType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "buyer protection", value = "The protection plan name.")

  public String getProductType() {
    return productType;
  }


  public void setProductType(String productType) {
    
    
    
    this.productType = productType;
  }


  public InvoiceInvoiceItemsInner createdTs(OffsetDateTime createdTs) {
    
    
    
    
    this.createdTs = createdTs;
    return this;
  }

   /**
   * The timestamp when the contract was purchased.
   * @return createdTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the contract was purchased.")

  public OffsetDateTime getCreatedTs() {
    return createdTs;
  }


  public void setCreatedTs(OffsetDateTime createdTs) {
    
    
    
    this.createdTs = createdTs;
  }


  public InvoiceInvoiceItemsInner cancelledTs(OffsetDateTime cancelledTs) {
    
    
    
    
    this.cancelledTs = cancelledTs;
    return this;
  }

   /**
   * The timestamp when the contract was cancelled.
   * @return cancelledTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the contract was cancelled.")

  public OffsetDateTime getCancelledTs() {
    return cancelledTs;
  }


  public void setCancelledTs(OffsetDateTime cancelledTs) {
    
    
    
    this.cancelledTs = cancelledTs;
  }


  public InvoiceInvoiceItemsInner amountCollected(Double amountCollected) {
    
    
    
    
    this.amountCollected = amountCollected;
    return this;
  }

   /**
   * The protection cost of the contract to collect from the merchant.
   * @return amountCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.99", value = "The protection cost of the contract to collect from the merchant.")

  public Double getAmountCollected() {
    return amountCollected;
  }


  public void setAmountCollected(Double amountCollected) {
    
    
    
    this.amountCollected = amountCollected;
  }


  public InvoiceInvoiceItemsInner amountReconciled(Double amountReconciled) {
    
    
    
    
    this.amountReconciled = amountReconciled;
    return this;
  }

   /**
   * The amount refunded due to contract cancellation.
   * @return amountReconciled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.99", value = "The amount refunded due to contract cancellation.")

  public Double getAmountReconciled() {
    return amountReconciled;
  }


  public void setAmountReconciled(Double amountReconciled) {
    
    
    
    this.amountReconciled = amountReconciled;
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
   * @return the InvoiceInvoiceItemsInner instance itself
   */
  public InvoiceInvoiceItemsInner putAdditionalProperty(String key, Object value) {
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
    InvoiceInvoiceItemsInner invoiceInvoiceItemsInner = (InvoiceInvoiceItemsInner) o;
    return Objects.equals(this.contractId, invoiceInvoiceItemsInner.contractId) &&
        Objects.equals(this.orderId, invoiceInvoiceItemsInner.orderId) &&
        Objects.equals(this.orderNumber, invoiceInvoiceItemsInner.orderNumber) &&
        Objects.equals(this.productType, invoiceInvoiceItemsInner.productType) &&
        Objects.equals(this.createdTs, invoiceInvoiceItemsInner.createdTs) &&
        Objects.equals(this.cancelledTs, invoiceInvoiceItemsInner.cancelledTs) &&
        Objects.equals(this.amountCollected, invoiceInvoiceItemsInner.amountCollected) &&
        Objects.equals(this.amountReconciled, invoiceInvoiceItemsInner.amountReconciled)&&
        Objects.equals(this.additionalProperties, invoiceInvoiceItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, orderId, orderNumber, productType, createdTs, cancelledTs, amountCollected, amountReconciled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceInvoiceItemsInner {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    cancelledTs: ").append(toIndentedString(cancelledTs)).append("\n");
    sb.append("    amountCollected: ").append(toIndentedString(amountCollected)).append("\n");
    sb.append("    amountReconciled: ").append(toIndentedString(amountReconciled)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("order_id");
    openapiFields.add("order_number");
    openapiFields.add("product_type");
    openapiFields.add("created_ts");
    openapiFields.add("cancelled_ts");
    openapiFields.add("amount_collected");
    openapiFields.add("amount_reconciled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceInvoiceItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceInvoiceItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceInvoiceItemsInner is not found in the empty JSON string", InvoiceInvoiceItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_number") != null && !jsonObj.get("order_number").isJsonNull()) && !jsonObj.get("order_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_number").toString()));
      }
      if ((jsonObj.get("product_type") != null && !jsonObj.get("product_type").isJsonNull()) && !jsonObj.get("product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceInvoiceItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceInvoiceItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceInvoiceItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceInvoiceItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceInvoiceItemsInner>() {
           @Override
           public void write(JsonWriter out, InvoiceInvoiceItemsInner value) throws IOException {
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
           public InvoiceInvoiceItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceInvoiceItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceInvoiceItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceInvoiceItemsInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceInvoiceItemsInner
  */
  public static InvoiceInvoiceItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceInvoiceItemsInner.class);
  }

 /**
  * Convert an instance of InvoiceInvoiceItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

