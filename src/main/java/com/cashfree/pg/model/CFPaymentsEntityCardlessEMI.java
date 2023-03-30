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

/** CFPaymentsEntityCardlessEMI */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFPaymentsEntityCardlessEMI {
    public static final String SERIALIZED_NAME_CHANNEL = "channel";

    @SerializedName(SERIALIZED_NAME_CHANNEL)
    private String channel;

    public static final String SERIALIZED_NAME_PROVIDER = "provider";

    @SerializedName(SERIALIZED_NAME_PROVIDER)
    private String provider;

    public static final String SERIALIZED_NAME_PHONE = "phone";

    @SerializedName(SERIALIZED_NAME_PHONE)
    private String phone;

    public CFPaymentsEntityCardlessEMI() {}

    public CFPaymentsEntityCardlessEMI channel(String channel) {

        this.channel = channel;
        return this;
    }

    /**
     * Get channel
     *
     * @return channel
     */
    @javax.annotation.Nullable
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public CFPaymentsEntityCardlessEMI provider(String provider) {

        this.provider = provider;
        return this;
    }

    /**
     * Get provider
     *
     * @return provider
     */
    @javax.annotation.Nullable
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CFPaymentsEntityCardlessEMI phone(String phone) {

        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFPaymentsEntityCardlessEMI cfPaymentsEntityCardlessEMI = (CFPaymentsEntityCardlessEMI) o;
        return Objects.equals(this.channel, cfPaymentsEntityCardlessEMI.channel)
                && Objects.equals(this.provider, cfPaymentsEntityCardlessEMI.provider)
                && Objects.equals(this.phone, cfPaymentsEntityCardlessEMI.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, provider, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFPaymentsEntityCardlessEMI {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
        openapiFields.add("provider");
        openapiFields.add("phone");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFPaymentsEntityCardlessEMI
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFPaymentsEntityCardlessEMI.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFPaymentsEntityCardlessEMI is not"
                                        + " found in the empty JSON string",
                                CFPaymentsEntityCardlessEMI.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFPaymentsEntityCardlessEMI.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFPaymentsEntityCardlessEMI` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull())
                && !jsonObj.get("channel").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channel` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channel").toString()));
        }
        if ((jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull())
                && !jsonObj.get("provider").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `provider` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("provider").toString()));
        }
        if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull())
                && !jsonObj.get("phone").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `phone` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("phone").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFPaymentsEntityCardlessEMI.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFPaymentsEntityCardlessEMI' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFPaymentsEntityCardlessEMI> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaymentsEntityCardlessEMI.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFPaymentsEntityCardlessEMI>() {
                        @Override
                        public void write(JsonWriter out, CFPaymentsEntityCardlessEMI value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFPaymentsEntityCardlessEMI read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFPaymentsEntityCardlessEMI given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFPaymentsEntityCardlessEMI
     * @throws IOException if the JSON string is invalid with respect to CFPaymentsEntityCardlessEMI
     */
    public static CFPaymentsEntityCardlessEMI fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFPaymentsEntityCardlessEMI.class);
    }

    /**
     * Convert an instance of CFPaymentsEntityCardlessEMI to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
