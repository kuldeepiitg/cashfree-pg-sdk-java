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

/** CFLinkNotifyEntity */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFLinkNotifyEntity {
    public static final String SERIALIZED_NAME_SEND_SMS = "send_sms";

    @SerializedName(SERIALIZED_NAME_SEND_SMS)
    private Boolean sendSms;

    public static final String SERIALIZED_NAME_SEND_EMAIL = "send_email";

    @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
    private Boolean sendEmail;

    public CFLinkNotifyEntity() {}

    public CFLinkNotifyEntity sendSms(Boolean sendSms) {

        this.sendSms = sendSms;
        return this;
    }

    /**
     * If \&quot;true\&quot;, Cashfree will send sms on customer_phone
     *
     * @return sendSms
     */
    @javax.annotation.Nullable
    public Boolean getSendSms() {
        return sendSms;
    }

    public void setSendSms(Boolean sendSms) {
        this.sendSms = sendSms;
    }

    public CFLinkNotifyEntity sendEmail(Boolean sendEmail) {

        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * If \&quot;true\&quot;, Cashfree will send email on customer_email
     *
     * @return sendEmail
     */
    @javax.annotation.Nullable
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFLinkNotifyEntity cfLinkNotifyEntity = (CFLinkNotifyEntity) o;
        return Objects.equals(this.sendSms, cfLinkNotifyEntity.sendSms)
                && Objects.equals(this.sendEmail, cfLinkNotifyEntity.sendEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendSms, sendEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFLinkNotifyEntity {\n");
        sb.append("    sendSms: ").append(toIndentedString(sendSms)).append("\n");
        sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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
        openapiFields.add("send_sms");
        openapiFields.add("send_email");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFLinkNotifyEntity
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFLinkNotifyEntity.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFLinkNotifyEntity is not found in"
                                        + " the empty JSON string",
                                CFLinkNotifyEntity.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFLinkNotifyEntity.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFLinkNotifyEntity` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFLinkNotifyEntity.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFLinkNotifyEntity' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFLinkNotifyEntity> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFLinkNotifyEntity.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFLinkNotifyEntity>() {
                        @Override
                        public void write(JsonWriter out, CFLinkNotifyEntity value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFLinkNotifyEntity read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFLinkNotifyEntity given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFLinkNotifyEntity
     * @throws IOException if the JSON string is invalid with respect to CFLinkNotifyEntity
     */
    public static CFLinkNotifyEntity fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFLinkNotifyEntity.class);
    }

    /**
     * Convert an instance of CFLinkNotifyEntity to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
