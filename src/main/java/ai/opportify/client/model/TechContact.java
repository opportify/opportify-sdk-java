/*
 * Opportify Insights API
 * ## Overview  The **Opportify Insights API** provides access to a powerful and up-to-date platform. With advanced data warehousing and AI-driven capabilities, this API is designed to empower your business to make informed, data-driven decisions and effectively assess potential risks.  ### Base URL Use the following base URL for all API requests:  ```plaintext https://api.opportify.ai/insights/v1/<service>/<endpoint> ```  ### Features - [**Email Insights:**](/docs/api/api-reference/email-insights)   - Validate email syntax.   - Identify email types (free, disposable, corporate or unknown).   - Real time verifications:     - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.     - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.     - Catch-All: Detects if the domain accepts all emails (catch-all configuration).   - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses.   - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.      [Access Documentation >>](/docs/api/api-reference/email-insights)  - [**IP Insights:**](/docs/api/api-reference/ip-insights)   - Connection types: Detects connection types such as `wired`, `mobile`, `enterprise`, `satellite`, `VPN`, `cloud-provider`, `open-proxy`, or `Tor`.   - Geo location: Delivers detailed insights such as country, city, timezone, language preferences, and additional location-based information to enhance regional understanding.   - WHOIS: Provides main details including RIR, ASN, organization, and abuse/admin/technical contacts.   - Trusted Provider Recognition: Identifies if the IP is part of a known trusted provider (e.g., ZTNA - Zero Trust Network Access).   - Blocklist Reports: Retrieves up-to-date blocklist statuses, active reports, and the latest detections.   - Risk Report: Delivers an AI-driven normalized score (200-1000) to evaluate IP risk, supported by predefined thresholds.    [Access Documentation >>](/docs/api/api-reference/ip-insights)  ### Authentication & Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://www.opportify.ai).
 * https://www.opportify.ai
 * Do not edit the class manually.
 */


package ai.opportify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ai.opportify.client.JSON;

/**
 * Tech contact details.
 */
@javax.annotation.Generated(value = "ai.opportify.codegen.languages.JavaClientCodegen", date = "2025-01-07T17:36:50.096636-08:00[America/Los_Angeles]", comments = "Generator version: 7.10.0")
public class TechContact {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contactId";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  @javax.annotation.Nullable
  private String contactId;

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contactType";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  @javax.annotation.Nullable
  private String contactType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private List<String> address = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private List<String> phone = new ArrayList<>();

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  @javax.annotation.Nullable
  private List<String> fax = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private List<String> email = new ArrayList<>();

  public TechContact() {
  }

  public TechContact contactId(@javax.annotation.Nullable String contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Unique identifier for the tech contact.
   * @return contactId
   */
  @javax.annotation.Nullable
  public String getContactId() {
    return contactId;
  }

  public void setContactId(@javax.annotation.Nullable String contactId) {
    this.contactId = contactId;
  }


  public TechContact contactType(@javax.annotation.Nullable String contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Type of contact (e.g., \&quot;tech\&quot;).
   * @return contactType
   */
  @javax.annotation.Nullable
  public String getContactType() {
    return contactType;
  }

  public void setContactType(@javax.annotation.Nullable String contactType) {
    this.contactType = contactType;
  }


  public TechContact name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tech contact.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public TechContact address(@javax.annotation.Nullable List<String> address) {
    this.address = address;
    return this;
  }

  public TechContact addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Tech contact address details.
   * @return address
   */
  @javax.annotation.Nullable
  public List<String> getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable List<String> address) {
    this.address = address;
  }


  public TechContact phone(@javax.annotation.Nullable List<String> phone) {
    this.phone = phone;
    return this;
  }

  public TechContact addPhoneItem(String phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

  /**
   * Contact phone numbers for tech issues.
   * @return phone
   */
  @javax.annotation.Nullable
  public List<String> getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable List<String> phone) {
    this.phone = phone;
  }


  public TechContact fax(@javax.annotation.Nullable List<String> fax) {
    this.fax = fax;
    return this;
  }

  public TechContact addFaxItem(String faxItem) {
    if (this.fax == null) {
      this.fax = new ArrayList<>();
    }
    this.fax.add(faxItem);
    return this;
  }

  /**
   * Contact fax numbers for tech issues.
   * @return fax
   */
  @javax.annotation.Nullable
  public List<String> getFax() {
    return fax;
  }

  public void setFax(@javax.annotation.Nullable List<String> fax) {
    this.fax = fax;
  }


  public TechContact email(@javax.annotation.Nullable List<String> email) {
    this.email = email;
    return this;
  }

  public TechContact addEmailItem(String emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

  /**
   * Contact email addresses for tech issues.
   * @return email
   */
  @javax.annotation.Nullable
  public List<String> getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable List<String> email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechContact techContact = (TechContact) o;
    return Objects.equals(this.contactId, techContact.contactId) &&
        Objects.equals(this.contactType, techContact.contactType) &&
        Objects.equals(this.name, techContact.name) &&
        Objects.equals(this.address, techContact.address) &&
        Objects.equals(this.phone, techContact.phone) &&
        Objects.equals(this.fax, techContact.fax) &&
        Objects.equals(this.email, techContact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, name, address, phone, fax, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechContact {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("contactId");
    openapiFields.add("contactType");
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("phone");
    openapiFields.add("fax");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TechContact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TechContact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TechContact is not found in the empty JSON string", TechContact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TechContact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TechContact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contactId") != null && !jsonObj.get("contactId").isJsonNull()) && !jsonObj.get("contactId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactId").toString()));
      }
      if ((jsonObj.get("contactType") != null && !jsonObj.get("contactType").isJsonNull()) && !jsonObj.get("contactType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull() && !jsonObj.get("address").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be an array in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull() && !jsonObj.get("phone").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be an array in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fax") != null && !jsonObj.get("fax").isJsonNull() && !jsonObj.get("fax").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fax` to be an array in the JSON string but got `%s`", jsonObj.get("fax").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull() && !jsonObj.get("email").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be an array in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TechContact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TechContact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TechContact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TechContact.class));

       return (TypeAdapter<T>) new TypeAdapter<TechContact>() {
           @Override
           public void write(JsonWriter out, TechContact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TechContact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TechContact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TechContact
   * @throws IOException if the JSON string is invalid with respect to TechContact
   */
  public static TechContact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TechContact.class);
  }

  /**
   * Convert an instance of TechContact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

