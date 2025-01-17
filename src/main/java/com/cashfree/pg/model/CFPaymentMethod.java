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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CFPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFAppPayment> adapterCFAppPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFAppPayment.class));
            final TypeAdapter<CFCardPayment> adapterCFCardPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFCardPayment.class));
            final TypeAdapter<CFCardlessEMIPayment> adapterCFCardlessEMIPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFCardlessEMIPayment.class));
            final TypeAdapter<CFEMIPayment> adapterCFEMIPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFEMIPayment.class));
            final TypeAdapter<CFNetbankingPayment> adapterCFNetbankingPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFNetbankingPayment.class));
            final TypeAdapter<CFPaylaterPayment> adapterCFPaylaterPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaylaterPayment.class));
            final TypeAdapter<CFUPIPayment> adapterCFUPIPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFUPIPayment.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFPaymentMethod>() {
                        @Override
                        public void write(JsonWriter out, CFPaymentMethod value)
                                throws IOException {
                            if (value == null || value.getActualInstance() == null) {
                                elementAdapter.write(out, null);
                                return;
                            }

                            // check if the actual instance is of the type `CFAppPayment`
                            if (value.getActualInstance() instanceof CFAppPayment) {
                                JsonObject obj =
                                        adapterCFAppPayment
                                                .toJsonTree(
                                                        (CFAppPayment) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFCardPayment`
                            if (value.getActualInstance() instanceof CFCardPayment) {
                                JsonObject obj =
                                        adapterCFCardPayment
                                                .toJsonTree(
                                                        (CFCardPayment) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFCardlessEMIPayment`
                            if (value.getActualInstance() instanceof CFCardlessEMIPayment) {
                                JsonObject obj =
                                        adapterCFCardlessEMIPayment
                                                .toJsonTree(
                                                        (CFCardlessEMIPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFEMIPayment`
                            if (value.getActualInstance() instanceof CFEMIPayment) {
                                JsonObject obj =
                                        adapterCFEMIPayment
                                                .toJsonTree(
                                                        (CFEMIPayment) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFNetbankingPayment`
                            if (value.getActualInstance() instanceof CFNetbankingPayment) {
                                JsonObject obj =
                                        adapterCFNetbankingPayment
                                                .toJsonTree(
                                                        (CFNetbankingPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFPaylaterPayment`
                            if (value.getActualInstance() instanceof CFPaylaterPayment) {
                                JsonObject obj =
                                        adapterCFPaylaterPayment
                                                .toJsonTree(
                                                        (CFPaylaterPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `CFUPIPayment`
                            if (value.getActualInstance() instanceof CFUPIPayment) {
                                JsonObject obj =
                                        adapterCFUPIPayment
                                                .toJsonTree(
                                                        (CFUPIPayment) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            throw new IOException(
                                    "Failed to serialize as the type doesn't match oneOf schemas:"
                                        + " CFAppPayment, CFCardPayment, CFCardlessEMIPayment,"
                                        + " CFEMIPayment, CFNetbankingPayment, CFPaylaterPayment,"
                                        + " CFUPIPayment");
                        }

                        @Override
                        public CFPaymentMethod read(JsonReader in) throws IOException {
                            Object deserialized = null;
                            JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                            int match = 0;
                            ArrayList<String> errorMessages = new ArrayList<>();
                            TypeAdapter actualAdapter = elementAdapter;

                            // deserialize CFAppPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFAppPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFAppPayment;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'CFAppPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFAppPayment failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFAppPayment'",
                                        e);
                            }

                            // deserialize CFCardPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFCardPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFCardPayment;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'CFCardPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFCardPayment failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFCardPayment'",
                                        e);
                            }

                            // deserialize CFCardlessEMIPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFCardlessEMIPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFCardlessEMIPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFCardlessEMIPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFCardlessEMIPayment failed"
                                                        + " with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFCardlessEMIPayment'",
                                        e);
                            }

                            // deserialize CFEMIPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFEMIPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFEMIPayment;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'CFEMIPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFEMIPayment failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFEMIPayment'",
                                        e);
                            }

                            // deserialize CFNetbankingPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFNetbankingPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFNetbankingPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFNetbankingPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFNetbankingPayment failed"
                                                        + " with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFNetbankingPayment'",
                                        e);
                            }

                            // deserialize CFPaylaterPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaylaterPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaylaterPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFPaylaterPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFPaylaterPayment failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFPaylaterPayment'",
                                        e);
                            }

                            // deserialize CFUPIPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFUPIPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFUPIPayment;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'CFUPIPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFUPIPayment failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'CFUPIPayment'",
                                        e);
                            }

                            if (match == 1) {
                                CFPaymentMethod ret = new CFPaymentMethod();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                                return ret;
                            }

                            throw new IOException(
                                    String.format(
                                            "Failed deserialization for CFPaymentMethod: %d"
                                                + " classes match result, expected 1. Detailed"
                                                + " failure message for oneOf schemas: %s. JSON:"
                                                + " %s",
                                            match, errorMessages, jsonObject.toString()));
                        }
                    }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CFPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public CFPaymentMethod(CFAppPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFCardPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFCardlessEMIPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFEMIPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFNetbankingPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFPaylaterPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentMethod(CFUPIPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CFAppPayment", new GenericType<CFAppPayment>() {});
        schemas.put("CFCardPayment", new GenericType<CFCardPayment>() {});
        schemas.put("CFCardlessEMIPayment", new GenericType<CFCardlessEMIPayment>() {});
        schemas.put("CFEMIPayment", new GenericType<CFEMIPayment>() {});
        schemas.put("CFNetbankingPayment", new GenericType<CFNetbankingPayment>() {});
        schemas.put("CFPaylaterPayment", new GenericType<CFPaylaterPayment>() {});
        schemas.put("CFUPIPayment", new GenericType<CFUPIPayment>() {});
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CFPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: CFAppPayment, CFCardPayment, CFCardlessEMIPayment,
     * CFEMIPayment, CFNetbankingPayment, CFPaylaterPayment, CFUPIPayment
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CFAppPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFCardPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFCardlessEMIPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFEMIPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFNetbankingPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaylaterPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFUPIPayment) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be CFAppPayment, CFCardPayment, CFCardlessEMIPayment,"
                        + " CFEMIPayment, CFNetbankingPayment, CFPaylaterPayment, CFUPIPayment");
    }

    /**
     * Get the actual instance, which can be the following: CFAppPayment, CFCardPayment,
     * CFCardlessEMIPayment, CFEMIPayment, CFNetbankingPayment, CFPaylaterPayment, CFUPIPayment
     *
     * @return The actual instance (CFAppPayment, CFCardPayment, CFCardlessEMIPayment, CFEMIPayment,
     *     CFNetbankingPayment, CFPaylaterPayment, CFUPIPayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFAppPayment`. If the actual instance is not `CFAppPayment`, the
     * ClassCastException will be thrown.
     *
     * @return The actual instance of `CFAppPayment`
     * @throws ClassCastException if the instance is not `CFAppPayment`
     */
    public CFAppPayment getCFAppPayment() throws ClassCastException {
        return (CFAppPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFCardPayment`. If the actual instance is not `CFCardPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFCardPayment`
     * @throws ClassCastException if the instance is not `CFCardPayment`
     */
    public CFCardPayment getCFCardPayment() throws ClassCastException {
        return (CFCardPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFCardlessEMIPayment`. If the actual instance is not
     * `CFCardlessEMIPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFCardlessEMIPayment`
     * @throws ClassCastException if the instance is not `CFCardlessEMIPayment`
     */
    public CFCardlessEMIPayment getCFCardlessEMIPayment() throws ClassCastException {
        return (CFCardlessEMIPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFEMIPayment`. If the actual instance is not `CFEMIPayment`, the
     * ClassCastException will be thrown.
     *
     * @return The actual instance of `CFEMIPayment`
     * @throws ClassCastException if the instance is not `CFEMIPayment`
     */
    public CFEMIPayment getCFEMIPayment() throws ClassCastException {
        return (CFEMIPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFNetbankingPayment`. If the actual instance is not
     * `CFNetbankingPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFNetbankingPayment`
     * @throws ClassCastException if the instance is not `CFNetbankingPayment`
     */
    public CFNetbankingPayment getCFNetbankingPayment() throws ClassCastException {
        return (CFNetbankingPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaylaterPayment`. If the actual instance is not
     * `CFPaylaterPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaylaterPayment`
     * @throws ClassCastException if the instance is not `CFPaylaterPayment`
     */
    public CFPaylaterPayment getCFPaylaterPayment() throws ClassCastException {
        return (CFPaylaterPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFUPIPayment`. If the actual instance is not `CFUPIPayment`, the
     * ClassCastException will be thrown.
     *
     * @return The actual instance of `CFUPIPayment`
     * @throws ClassCastException if the instance is not `CFUPIPayment`
     */
    public CFUPIPayment getCFUPIPayment() throws ClassCastException {
        return (CFUPIPayment) super.getActualInstance();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFPaymentMethod
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CFAppPayment
        try {
            CFAppPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFAppPayment failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFCardPayment
        try {
            CFCardPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFCardPayment failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFCardlessEMIPayment
        try {
            CFCardlessEMIPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFCardlessEMIPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFEMIPayment
        try {
            CFEMIPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFEMIPayment failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFNetbankingPayment
        try {
            CFNetbankingPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFNetbankingPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaylaterPayment
        try {
            CFPaylaterPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaylaterPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFUPIPayment
        try {
            CFUPIPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFUPIPayment failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(
                    String.format(
                            "The JSON string is invalid for CFPaymentMethod with oneOf schemas:"
                                    + " CFAppPayment, CFCardPayment, CFCardlessEMIPayment,"
                                    + " CFEMIPayment, CFNetbankingPayment, CFPaylaterPayment,"
                                    + " CFUPIPayment. %d class(es) match the result, expected 1."
                                    + " Detailed failure message for oneOf schemas: %s. JSON: %s",
                            validCount, errorMessages, jsonObj.toString()));
        }
    }

    /**
     * Create an instance of CFPaymentMethod given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFPaymentMethod
     * @throws IOException if the JSON string is invalid with respect to CFPaymentMethod
     */
    public static CFPaymentMethod fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFPaymentMethod.class);
    }

    /**
     * Convert an instance of CFPaymentMethod to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
