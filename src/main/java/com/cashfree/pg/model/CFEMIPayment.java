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

/** CFEMIPayment */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFEMIPayment {
    public static final String SERIALIZED_NAME_EMI = "emi";

    @SerializedName(SERIALIZED_NAME_EMI)
    private CFCardEMI emi;

    public CFEMIPayment() {}

    public CFEMIPayment emi(CFCardEMI emi) {

        this.emi = emi;
        return this;
    }

    /**
     * Get emi
     *
     * @return emi
     */
    @javax.annotation.Nullable
    public CFCardEMI getEmi() {
        return emi;
    }

    public void setEmi(CFCardEMI emi) {
        this.emi = emi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFEMIPayment cfEMIPayment = (CFEMIPayment) o;
        return Objects.equals(this.emi, cfEMIPayment.emi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFEMIPayment {\n");
        sb.append("    emi: ").append(toIndentedString(emi)).append("\n");
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
        openapiFields.add("emi");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFEMIPayment
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFEMIPayment.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFEMIPayment is not found in the"
                                        + " empty JSON string",
                                CFEMIPayment.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFEMIPayment.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFEMIPayment` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `emi`
        if (jsonObj.get("emi") != null && !jsonObj.get("emi").isJsonNull()) {
            CFCardEMI.validateJsonObject(jsonObj.getAsJsonObject("emi"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFEMIPayment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFEMIPayment' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFEMIPayment> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFEMIPayment.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFEMIPayment>() {
                        @Override
                        public void write(JsonWriter out, CFEMIPayment value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFEMIPayment read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFEMIPayment given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFEMIPayment
     * @throws IOException if the JSON string is invalid with respect to CFEMIPayment
     */
    public static CFEMIPayment fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFEMIPayment.class);
    }

    /**
     * Convert an instance of CFEMIPayment to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
