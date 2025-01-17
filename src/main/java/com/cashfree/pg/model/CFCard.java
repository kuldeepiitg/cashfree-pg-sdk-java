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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CFCard */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFCard {
    public static final String SERIALIZED_NAME_CHANNEL = "channel";

    @SerializedName(SERIALIZED_NAME_CHANNEL)
    private String channel;

    public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";

    @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
    private String cardNumber;

    public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "card_holder_name";

    @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
    private String cardHolderName;

    public static final String SERIALIZED_NAME_CARD_EXPIRY_MM = "card_expiry_mm";

    @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MM)
    private String cardExpiryMm;

    public static final String SERIALIZED_NAME_CARD_EXPIRY_YY = "card_expiry_yy";

    @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YY)
    private String cardExpiryYy;

    public static final String SERIALIZED_NAME_CARD_CVV = "card_cvv";

    @SerializedName(SERIALIZED_NAME_CARD_CVV)
    private String cardCvv;

    public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrument_id";

    @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
    private String instrumentId;

    public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";

    @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
    private String cryptogram;

    public static final String SERIALIZED_NAME_TOKEN_REQUESTOR_ID = "token_requestor_id";

    @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTOR_ID)
    private String tokenRequestorId;

    public static final String SERIALIZED_NAME_CARD_DISPLAY = "card_display";

    @SerializedName(SERIALIZED_NAME_CARD_DISPLAY)
    private String cardDisplay;

    public static final String SERIALIZED_NAME_CARD_ALIAS = "card_alias";

    @SerializedName(SERIALIZED_NAME_CARD_ALIAS)
    private String cardAlias;

    /**
     * One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;,
     * \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the
     * bank user has selected for EMI
     */
    @JsonAdapter(CardBankNameEnum.Adapter.class)
    public enum CardBankNameEnum {
        KOTAK("Kotak"),

        ICICI("ICICI"),

        RBL("RBL"),

        BOB("BOB"),

        STANDARD_CHARTERED("Standard Chartered");

        private String value;

        CardBankNameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CardBankNameEnum fromValue(String value) {
            for (CardBankNameEnum b : CardBankNameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<CardBankNameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CardBankNameEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CardBankNameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CardBankNameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CARD_BANK_NAME = "card_bank_name";

    @SerializedName(SERIALIZED_NAME_CARD_BANK_NAME)
    private CardBankNameEnum cardBankName;

    public static final String SERIALIZED_NAME_EMI_TENURE = "emi_tenure";

    @SerializedName(SERIALIZED_NAME_EMI_TENURE)
    private Integer emiTenure;

    public CFCard() {}

    public CFCard channel(String channel) {

        this.channel = channel;
        return this;
    }

    /**
     * The channel for card payments will always be \&quot;link\&quot;
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

    public CFCard cardNumber(String cardNumber) {

        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * Customer card number for plain card transactions. Token pan number for tokenized card
     * transactions.
     *
     * @return cardNumber
     */
    @javax.annotation.Nonnull
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CFCard cardHolderName(String cardHolderName) {

        this.cardHolderName = cardHolderName;
        return this;
    }

    /**
     * Customer name mentioned on the card.
     *
     * @return cardHolderName
     */
    @javax.annotation.Nonnull
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public CFCard cardExpiryMm(String cardExpiryMm) {

        this.cardExpiryMm = cardExpiryMm;
        return this;
    }

    /**
     * Card expiry month for plain card transactions. Token expiry month for tokenized card
     * transactions.
     *
     * @return cardExpiryMm
     */
    @javax.annotation.Nonnull
    public String getCardExpiryMm() {
        return cardExpiryMm;
    }

    public void setCardExpiryMm(String cardExpiryMm) {
        this.cardExpiryMm = cardExpiryMm;
    }

    public CFCard cardExpiryYy(String cardExpiryYy) {

        this.cardExpiryYy = cardExpiryYy;
        return this;
    }

    /**
     * Card expiry year for plain card transactions. Token expiry year for tokenized card
     * transactions.
     *
     * @return cardExpiryYy
     */
    @javax.annotation.Nonnull
    public String getCardExpiryYy() {
        return cardExpiryYy;
    }

    public void setCardExpiryYy(String cardExpiryYy) {
        this.cardExpiryYy = cardExpiryYy;
    }

    public CFCard cardCvv(String cardCvv) {

        this.cardCvv = cardCvv;
        return this;
    }

    /**
     * CVV mentioned on the card.
     *
     * @return cardCvv
     */
    @javax.annotation.Nonnull
    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public CFCard instrumentId(String instrumentId) {

        this.instrumentId = instrumentId;
        return this;
    }

    /**
     * instrument id of saved card. Required only to make payment using saved instrument.
     *
     * @return instrumentId
     */
    @javax.annotation.Nonnull
    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public CFCard cryptogram(String cryptogram) {

        this.cryptogram = cryptogram;
        return this;
    }

    /**
     * cryptogram received from card network. Required only for tokenized card transactions.
     *
     * @return cryptogram
     */
    @javax.annotation.Nonnull
    public String getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    public CFCard tokenRequestorId(String tokenRequestorId) {

        this.tokenRequestorId = tokenRequestorId;
        return this;
    }

    /**
     * TRID issued by card networks. Required only for tokenized card transactions.
     *
     * @return tokenRequestorId
     */
    @javax.annotation.Nonnull
    public String getTokenRequestorId() {
        return tokenRequestorId;
    }

    public void setTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId;
    }

    public CFCard cardDisplay(String cardDisplay) {

        this.cardDisplay = cardDisplay;
        return this;
    }

    /**
     * last 4 digits of original card number. Required only for tokenized card transactions.
     *
     * @return cardDisplay
     */
    @javax.annotation.Nonnull
    public String getCardDisplay() {
        return cardDisplay;
    }

    public void setCardDisplay(String cardDisplay) {
        this.cardDisplay = cardDisplay;
    }

    public CFCard cardAlias(String cardAlias) {

        this.cardAlias = cardAlias;
        return this;
    }

    /**
     * Card alias as returned by Cashfree Vault API.
     *
     * @return cardAlias
     */
    @javax.annotation.Nonnull
    public String getCardAlias() {
        return cardAlias;
    }

    public void setCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
    }

    public CFCard cardBankName(CardBankNameEnum cardBankName) {

        this.cardBankName = cardBankName;
        return this;
    }

    /**
     * One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;,
     * \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the
     * bank user has selected for EMI
     *
     * @return cardBankName
     */
    @javax.annotation.Nonnull
    public CardBankNameEnum getCardBankName() {
        return cardBankName;
    }

    public void setCardBankName(CardBankNameEnum cardBankName) {
        this.cardBankName = cardBankName;
    }

    public CFCard emiTenure(Integer emiTenure) {

        this.emiTenure = emiTenure;
        return this;
    }

    /**
     * EMI tenure selected by the user
     *
     * @return emiTenure
     */
    @javax.annotation.Nonnull
    public Integer getEmiTenure() {
        return emiTenure;
    }

    public void setEmiTenure(Integer emiTenure) {
        this.emiTenure = emiTenure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFCard cfCard = (CFCard) o;
        return Objects.equals(this.channel, cfCard.channel)
                && Objects.equals(this.cardNumber, cfCard.cardNumber)
                && Objects.equals(this.cardHolderName, cfCard.cardHolderName)
                && Objects.equals(this.cardExpiryMm, cfCard.cardExpiryMm)
                && Objects.equals(this.cardExpiryYy, cfCard.cardExpiryYy)
                && Objects.equals(this.cardCvv, cfCard.cardCvv)
                && Objects.equals(this.instrumentId, cfCard.instrumentId)
                && Objects.equals(this.cryptogram, cfCard.cryptogram)
                && Objects.equals(this.tokenRequestorId, cfCard.tokenRequestorId)
                && Objects.equals(this.cardDisplay, cfCard.cardDisplay)
                && Objects.equals(this.cardAlias, cfCard.cardAlias)
                && Objects.equals(this.cardBankName, cfCard.cardBankName)
                && Objects.equals(this.emiTenure, cfCard.emiTenure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                channel,
                cardNumber,
                cardHolderName,
                cardExpiryMm,
                cardExpiryYy,
                cardCvv,
                instrumentId,
                cryptogram,
                tokenRequestorId,
                cardDisplay,
                cardAlias,
                cardBankName,
                emiTenure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFCard {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
        sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
        sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
        sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
        sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
        sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
        sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
        sb.append("    cardDisplay: ").append(toIndentedString(cardDisplay)).append("\n");
        sb.append("    cardAlias: ").append(toIndentedString(cardAlias)).append("\n");
        sb.append("    cardBankName: ").append(toIndentedString(cardBankName)).append("\n");
        sb.append("    emiTenure: ").append(toIndentedString(emiTenure)).append("\n");
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
        openapiFields.add("card_number");
        openapiFields.add("card_holder_name");
        openapiFields.add("card_expiry_mm");
        openapiFields.add("card_expiry_yy");
        openapiFields.add("card_cvv");
        openapiFields.add("instrument_id");
        openapiFields.add("cryptogram");
        openapiFields.add("token_requestor_id");
        openapiFields.add("card_display");
        openapiFields.add("card_alias");
        openapiFields.add("card_bank_name");
        openapiFields.add("emi_tenure");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("channel");
        openapiRequiredFields.add("card_number");
        openapiRequiredFields.add("card_holder_name");
        openapiRequiredFields.add("card_expiry_mm");
        openapiRequiredFields.add("card_expiry_yy");
        openapiRequiredFields.add("card_cvv");
        openapiRequiredFields.add("instrument_id");
        openapiRequiredFields.add("cryptogram");
        openapiRequiredFields.add("token_requestor_id");
        openapiRequiredFields.add("card_display");
        openapiRequiredFields.add("card_alias");
        openapiRequiredFields.add("card_bank_name");
        openapiRequiredFields.add("emi_tenure");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFCard
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFCard.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFCard is not found in the empty JSON"
                                        + " string",
                                CFCard.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFCard.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `CFCard`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CFCard.openapiRequiredFields) {
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
        if (!jsonObj.get("card_number").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_number` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_number").toString()));
        }
        if (!jsonObj.get("card_holder_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_holder_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_holder_name").toString()));
        }
        if (!jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_expiry_mm` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_expiry_mm").toString()));
        }
        if (!jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_expiry_yy` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_expiry_yy").toString()));
        }
        if (!jsonObj.get("card_cvv").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_cvv` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_cvv").toString()));
        }
        if (!jsonObj.get("instrument_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `instrument_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("instrument_id").toString()));
        }
        if (!jsonObj.get("cryptogram").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cryptogram` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("cryptogram").toString()));
        }
        if (!jsonObj.get("token_requestor_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `token_requestor_id` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("token_requestor_id").toString()));
        }
        if (!jsonObj.get("card_display").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_display` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_display").toString()));
        }
        if (!jsonObj.get("card_alias").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_alias` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("card_alias").toString()));
        }
        if (!jsonObj.get("card_bank_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `card_bank_name` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("card_bank_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFCard.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFCard' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFCard> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFCard.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFCard>() {
                        @Override
                        public void write(JsonWriter out, CFCard value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFCard read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFCard given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFCard
     * @throws IOException if the JSON string is invalid with respect to CFCard
     */
    public static CFCard fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFCard.class);
    }

    /**
     * Convert an instance of CFCard to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
