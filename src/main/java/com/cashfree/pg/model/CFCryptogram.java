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

/** CFCryptogram */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFCryptogram {
    public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrument_id";

    @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
    private String instrumentId;

    public static final String SERIALIZED_NAME_TOKEN_REQUESTOR_ID = "token_requestor_id";

    @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTOR_ID)
    private String tokenRequestorId;

    public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";

    @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
    private String cardNumber;

    public static final String SERIALIZED_NAME_CARD_EXPIRY_MM = "card_expiry_mm";

    @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MM)
    private String cardExpiryMm;

    public static final String SERIALIZED_NAME_CARD_EXPIRY_YY = "card_expiry_yy";

    @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YY)
    private String cardExpiryYy;

    public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";

    @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
    private String cryptogram;

    public static final String SERIALIZED_NAME_CARD_DISPLAY = "card_display";

    @SerializedName(SERIALIZED_NAME_CARD_DISPLAY)
    private String cardDisplay;

    public CFCryptogram() {}

    public CFCryptogram instrumentId(String instrumentId) {

        this.instrumentId = instrumentId;
        return this;
    }

    /**
     * instrument_id of saved instrument
     *
     * @return instrumentId
     */
    @javax.annotation.Nullable
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public CFCryptogram tokenRequestorId(String tokenRequestorId) {

        this.tokenRequestorId = tokenRequestorId;
        return this;
    }

    /**
     * TRID issued by card networks
     *
     * @return tokenRequestorId
     */
    @javax.annotation.Nullable
    public String getTokenRequestorId() {
        return tokenRequestorId;
    }

    public void setTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId;
    }

    public CFCryptogram cardNumber(String cardNumber) {

        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * token pan number
     *
     * @return cardNumber
     */
    @javax.annotation.Nullable
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CFCryptogram cardExpiryMm(String cardExpiryMm) {

        this.cardExpiryMm = cardExpiryMm;
        return this;
    }

    /**
     * token pan expiry month
     *
     * @return cardExpiryMm
     */
    @javax.annotation.Nullable
    public String getCardExpiryMm() {
        return cardExpiryMm;
    }

    public void setCardExpiryMm(String cardExpiryMm) {
        this.cardExpiryMm = cardExpiryMm;
    }

    public CFCryptogram cardExpiryYy(String cardExpiryYy) {

        this.cardExpiryYy = cardExpiryYy;
        return this;
    }

    /**
     * token pan expiry year
     *
     * @return cardExpiryYy
     */
    @javax.annotation.Nullable
    public String getCardExpiryYy() {
        return cardExpiryYy;
    }

    public void setCardExpiryYy(String cardExpiryYy) {
        this.cardExpiryYy = cardExpiryYy;
    }

    public CFCryptogram cryptogram(String cryptogram) {

        this.cryptogram = cryptogram;
        return this;
    }

    /**
     * cryptogram
     *
     * @return cryptogram
     */
    @javax.annotation.Nullable
    public String getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    public CFCryptogram cardDisplay(String cardDisplay) {

        this.cardDisplay = cardDisplay;
        return this;
    }

    /**
     * last 4 digits of original card number
     *
     * @return cardDisplay
     */
    @javax.annotation.Nullable
    public String getCardDisplay() {
        return cardDisplay;
    }

    public void setCardDisplay(String cardDisplay) {
        this.cardDisplay = cardDisplay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFCryptogram cfCryptogram = (CFCryptogram) o;
        return Objects.equals(this.instrumentId, cfCryptogram.instrumentId)
                && Objects.equals(this.tokenRequestorId, cfCryptogram.tokenRequestorId)
                && Objects.equals(this.cardNumber, cfCryptogram.cardNumber)
                && Objects.equals(this.cardExpiryMm, cfCryptogram.cardExpiryMm)
                && Objects.equals(this.cardExpiryYy, cfCryptogram.cardExpiryYy)
                && Objects.equals(this.cryptogram, cfCryptogram.cryptogram)
                && Objects.equals(this.cardDisplay, cfCryptogram.cardDisplay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                instrumentId,
                tokenRequestorId,
                cardNumber,
                cardExpiryMm,
                cardExpiryYy,
                cryptogram,
                cardDisplay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFCryptogram {\n");
        sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
        sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
        sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
        sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
        sb.append("    cardDisplay: ").append(toIndentedString(cardDisplay)).append("\n");
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
        openapiFields.add("instrument_id");
        openapiFields.add("token_requestor_id");
        openapiFields.add("card_number");
        openapiFields.add("card_expiry_mm");
        openapiFields.add("card_expiry_yy");
        openapiFields.add("cryptogram");
        openapiFields.add("card_display");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFCryptogram
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFCryptogram.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFCryptogram is not found in the"
                                        + " empty JSON string",
                                CFCryptogram.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFCryptogram.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFCryptogram` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("instrument_id") != null && !jsonObj.get("instrument_id").isJsonNull())
                && !jsonObj.get("instrument_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instrument_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("instrument_id").toString()));
        }
        if ((jsonObj.get("token_requestor_id") != null
                        && !jsonObj.get("token_requestor_id").isJsonNull())
                && !jsonObj.get("token_requestor_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `token_requestor_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("token_requestor_id").toString()));
        }
        if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull())
                && !jsonObj.get("card_number").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_number` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_number").toString()));
        }
        if ((jsonObj.get("card_expiry_mm") != null && !jsonObj.get("card_expiry_mm").isJsonNull())
                && !jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_expiry_mm` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_expiry_mm").toString()));
        }
        if ((jsonObj.get("card_expiry_yy") != null && !jsonObj.get("card_expiry_yy").isJsonNull())
                && !jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_expiry_yy` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_expiry_yy").toString()));
        }
        if ((jsonObj.get("cryptogram") != null && !jsonObj.get("cryptogram").isJsonNull())
                && !jsonObj.get("cryptogram").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cryptogram` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cryptogram").toString()));
        }
        if ((jsonObj.get("card_display") != null && !jsonObj.get("card_display").isJsonNull())
                && !jsonObj.get("card_display").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_display` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_display").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFCryptogram.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFCryptogram' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFCryptogram> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFCryptogram.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFCryptogram>() {
                        @Override
                        public void write(JsonWriter out, CFCryptogram value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFCryptogram read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFCryptogram given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFCryptogram
     * @throws IOException if the JSON string is invalid with respect to CFCryptogram
     */
    public static CFCryptogram fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFCryptogram.class);
    }

    /**
     * Convert an instance of CFCryptogram to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
