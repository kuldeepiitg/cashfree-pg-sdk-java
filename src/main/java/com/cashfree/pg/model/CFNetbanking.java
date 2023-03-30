/*
 * New Payment Gateway APIs
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-01-01
 * Contact: nextgenapi@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.cashfree.pg.model;


import com.cashfree.pg.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CFNetbanking */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFNetbanking {
    public static final String SERIALIZED_NAME_CHANNEL = "channel";

    @SerializedName(SERIALIZED_NAME_CHANNEL)
    private String channel;

    public static final String SERIALIZED_NAME_NETBANKING_BANK_CODE = "netbanking_bank_code";

    @SerializedName(SERIALIZED_NAME_NETBANKING_BANK_CODE)
    private Integer netbankingBankCode;

    public CFNetbanking() {}

    public CFNetbanking channel(String channel) {

        this.channel = channel;
        return this;
    }

    /**
     * The channel for netbanking will always be &#x60;link&#x60;
     *
     * @return channel
     */
    @javax.annotation.Nonnull
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public CFNetbanking netbankingBankCode(Integer netbankingBankCode) {

        this.netbankingBankCode = netbankingBankCode;
        return this;
    }

    /**
     * Bank code
     *
     * @return netbankingBankCode
     */
    @javax.annotation.Nonnull
    public Integer getNetbankingBankCode() {
        return netbankingBankCode;
    }

    public void setNetbankingBankCode(Integer netbankingBankCode) {
        this.netbankingBankCode = netbankingBankCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFNetbanking cfNetbanking = (CFNetbanking) o;
        return Objects.equals(this.channel, cfNetbanking.channel)
                && Objects.equals(this.netbankingBankCode, cfNetbanking.netbankingBankCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, netbankingBankCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFNetbanking {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    netbankingBankCode: ")
                .append(toIndentedString(netbankingBankCode))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("channel");
        openapiFields.add("netbanking_bank_code");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("channel");
        openapiRequiredFields.add("netbanking_bank_code");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFNetbanking
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFNetbanking.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFNetbanking is not found in the"
                                        + " empty JSON string",
                                CFNetbanking.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFNetbanking.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFNetbanking` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CFNetbanking.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("channel").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFNetbanking.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFNetbanking' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFNetbanking> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFNetbanking.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFNetbanking>() {
                        @Override
                        public void write(JsonWriter out, CFNetbanking value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFNetbanking read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFNetbanking given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFNetbanking
     * @throws IOException if the JSON string is invalid with respect to CFNetbanking
     */
    public static CFNetbanking fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFNetbanking.class);
    }

    /**
     * Convert an instance of CFNetbanking to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
