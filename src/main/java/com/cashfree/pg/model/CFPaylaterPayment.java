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

/** CFPaylaterPayment */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFPaylaterPayment {
    public static final String SERIALIZED_NAME_PAYLATER = "paylater";

    @SerializedName(SERIALIZED_NAME_PAYLATER)
    private CFPaylater paylater;

    public CFPaylaterPayment() {}

    public CFPaylaterPayment paylater(CFPaylater paylater) {

        this.paylater = paylater;
        return this;
    }

    /**
     * Get paylater
     *
     * @return paylater
     */
    @javax.annotation.Nonnull
    public CFPaylater getPaylater() {
        return paylater;
    }

    public void setPaylater(CFPaylater paylater) {
        this.paylater = paylater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFPaylaterPayment cfPaylaterPayment = (CFPaylaterPayment) o;
        return Objects.equals(this.paylater, cfPaylaterPayment.paylater);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paylater);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFPaylaterPayment {\n");
        sb.append("    paylater: ").append(toIndentedString(paylater)).append("\n");
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
        openapiFields.add("paylater");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("paylater");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFPaylaterPayment
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFPaylaterPayment.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFPaylaterPayment is not found in the"
                                        + " empty JSON string",
                                CFPaylaterPayment.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFPaylaterPayment.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFPaylaterPayment` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CFPaylaterPayment.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        // validate the required field `paylater`
        CFPaylater.validateJsonObject(jsonObj.getAsJsonObject("paylater"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFPaylaterPayment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFPaylaterPayment' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFPaylaterPayment> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaylaterPayment.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFPaylaterPayment>() {
                        @Override
                        public void write(JsonWriter out, CFPaylaterPayment value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFPaylaterPayment read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFPaylaterPayment given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFPaylaterPayment
     * @throws IOException if the JSON string is invalid with respect to CFPaylaterPayment
     */
    public static CFPaylaterPayment fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFPaylaterPayment.class);
    }

    /**
     * Convert an instance of CFPaylaterPayment to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
