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
import java.util.Arrays;
import ai.opportify.client.model.EmailDNS;
import ai.opportify.client.model.RiskReport;

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
 * AnalyzeEmail200Response
 */
@javax.annotation.Generated(value = "ai.opportify.codegen.languages.JavaClientCodegen", date = "2025-01-07T17:36:50.096636-08:00[America/Los_Angeles]", comments = "Generator version: 7.10.0")
public class AnalyzeEmail200Response {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  @javax.annotation.Nonnull
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_PROVIDER = "emailProvider";
  @SerializedName(SERIALIZED_NAME_EMAIL_PROVIDER)
  @javax.annotation.Nonnull
  private String emailProvider;

  public static final String SERIALIZED_NAME_EMAIL_TYPE = "emailType";
  @SerializedName(SERIALIZED_NAME_EMAIL_TYPE)
  @javax.annotation.Nonnull
  private String emailType;

  public static final String SERIALIZED_NAME_IS_FORMAT_VALID = "isFormatValid";
  @SerializedName(SERIALIZED_NAME_IS_FORMAT_VALID)
  @javax.annotation.Nonnull
  private Boolean isFormatValid;

  public static final String SERIALIZED_NAME_EMAIL_CORRECTION = "emailCorrection";
  @SerializedName(SERIALIZED_NAME_EMAIL_CORRECTION)
  @javax.annotation.Nonnull
  private String emailCorrection;

  public static final String SERIALIZED_NAME_IS_DELIVERABLE = "isDeliverable";
  @SerializedName(SERIALIZED_NAME_IS_DELIVERABLE)
  @javax.annotation.Nonnull
  private Boolean isDeliverable;

  public static final String SERIALIZED_NAME_IS_CATCH_ALL = "isCatchAll";
  @SerializedName(SERIALIZED_NAME_IS_CATCH_ALL)
  @javax.annotation.Nonnull
  private Boolean isCatchAll;

  public static final String SERIALIZED_NAME_IS_REACHABLE = "isReachable";
  @SerializedName(SERIALIZED_NAME_IS_REACHABLE)
  @javax.annotation.Nonnull
  private Boolean isReachable;

  public static final String SERIALIZED_NAME_EMAIL_D_N_S = "emailDNS";
  @SerializedName(SERIALIZED_NAME_EMAIL_D_N_S)
  @javax.annotation.Nonnull
  private EmailDNS emailDNS;

  public static final String SERIALIZED_NAME_RISK_REPORT = "riskReport";
  @SerializedName(SERIALIZED_NAME_RISK_REPORT)
  @javax.annotation.Nonnull
  private RiskReport riskReport;

  public AnalyzeEmail200Response() {
  }

  public AnalyzeEmail200Response emailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The validated email address.
   * @return emailAddress
   */
  @javax.annotation.Nonnull
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@javax.annotation.Nonnull String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AnalyzeEmail200Response emailProvider(@javax.annotation.Nonnull String emailProvider) {
    this.emailProvider = emailProvider;
    return this;
  }

  /**
   * The email provider or domain name.
   * @return emailProvider
   */
  @javax.annotation.Nonnull
  public String getEmailProvider() {
    return emailProvider;
  }

  public void setEmailProvider(@javax.annotation.Nonnull String emailProvider) {
    this.emailProvider = emailProvider;
  }


  public AnalyzeEmail200Response emailType(@javax.annotation.Nonnull String emailType) {
    this.emailType = emailType;
    return this;
  }

  /**
   * Type of email address (e.g., free, disposable, corporate, unknown).
   * @return emailType
   */
  @javax.annotation.Nonnull
  public String getEmailType() {
    return emailType;
  }

  public void setEmailType(@javax.annotation.Nonnull String emailType) {
    this.emailType = emailType;
  }


  public AnalyzeEmail200Response isFormatValid(@javax.annotation.Nonnull Boolean isFormatValid) {
    this.isFormatValid = isFormatValid;
    return this;
  }

  /**
   * Indicates if the email address has a valid format.
   * @return isFormatValid
   */
  @javax.annotation.Nonnull
  public Boolean getIsFormatValid() {
    return isFormatValid;
  }

  public void setIsFormatValid(@javax.annotation.Nonnull Boolean isFormatValid) {
    this.isFormatValid = isFormatValid;
  }


  public AnalyzeEmail200Response emailCorrection(@javax.annotation.Nonnull String emailCorrection) {
    this.emailCorrection = emailCorrection;
    return this;
  }

  /**
   * Suggested corrected email address, if applicable.
   * @return emailCorrection
   */
  @javax.annotation.Nonnull
  public String getEmailCorrection() {
    return emailCorrection;
  }

  public void setEmailCorrection(@javax.annotation.Nonnull String emailCorrection) {
    this.emailCorrection = emailCorrection;
  }


  public AnalyzeEmail200Response isDeliverable(@javax.annotation.Nonnull Boolean isDeliverable) {
    this.isDeliverable = isDeliverable;
    return this;
  }

  /**
   * Checks if the email address exists and is deliverable using SMTP handshake simulation. This involves connecting to the mail server and issuing commands to verify deliverability. 
   * @return isDeliverable
   */
  @javax.annotation.Nonnull
  public Boolean getIsDeliverable() {
    return isDeliverable;
  }

  public void setIsDeliverable(@javax.annotation.Nonnull Boolean isDeliverable) {
    this.isDeliverable = isDeliverable;
  }


  public AnalyzeEmail200Response isCatchAll(@javax.annotation.Nonnull Boolean isCatchAll) {
    this.isCatchAll = isCatchAll;
    return this;
  }

  /**
   * Determines if the email domain is configured as a catch-all, which accepts emails for all addresses within the domain. This is verified through multiple email tests. 
   * @return isCatchAll
   */
  @javax.annotation.Nonnull
  public Boolean getIsCatchAll() {
    return isCatchAll;
  }

  public void setIsCatchAll(@javax.annotation.Nonnull Boolean isCatchAll) {
    this.isCatchAll = isCatchAll;
  }


  public AnalyzeEmail200Response isReachable(@javax.annotation.Nonnull Boolean isReachable) {
    this.isReachable = isReachable;
    return this;
  }

  /**
   * Confirms if the email domain has valid MX DNS records using DNS lookup.
   * @return isReachable
   */
  @javax.annotation.Nonnull
  public Boolean getIsReachable() {
    return isReachable;
  }

  public void setIsReachable(@javax.annotation.Nonnull Boolean isReachable) {
    this.isReachable = isReachable;
  }


  public AnalyzeEmail200Response emailDNS(@javax.annotation.Nonnull EmailDNS emailDNS) {
    this.emailDNS = emailDNS;
    return this;
  }

  /**
   * Get emailDNS
   * @return emailDNS
   */
  @javax.annotation.Nonnull
  public EmailDNS getEmailDNS() {
    return emailDNS;
  }

  public void setEmailDNS(@javax.annotation.Nonnull EmailDNS emailDNS) {
    this.emailDNS = emailDNS;
  }


  public AnalyzeEmail200Response riskReport(@javax.annotation.Nonnull RiskReport riskReport) {
    this.riskReport = riskReport;
    return this;
  }

  /**
   * Get riskReport
   * @return riskReport
   */
  @javax.annotation.Nonnull
  public RiskReport getRiskReport() {
    return riskReport;
  }

  public void setRiskReport(@javax.annotation.Nonnull RiskReport riskReport) {
    this.riskReport = riskReport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeEmail200Response analyzeEmail200Response = (AnalyzeEmail200Response) o;
    return Objects.equals(this.emailAddress, analyzeEmail200Response.emailAddress) &&
        Objects.equals(this.emailProvider, analyzeEmail200Response.emailProvider) &&
        Objects.equals(this.emailType, analyzeEmail200Response.emailType) &&
        Objects.equals(this.isFormatValid, analyzeEmail200Response.isFormatValid) &&
        Objects.equals(this.emailCorrection, analyzeEmail200Response.emailCorrection) &&
        Objects.equals(this.isDeliverable, analyzeEmail200Response.isDeliverable) &&
        Objects.equals(this.isCatchAll, analyzeEmail200Response.isCatchAll) &&
        Objects.equals(this.isReachable, analyzeEmail200Response.isReachable) &&
        Objects.equals(this.emailDNS, analyzeEmail200Response.emailDNS) &&
        Objects.equals(this.riskReport, analyzeEmail200Response.riskReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailProvider, emailType, isFormatValid, emailCorrection, isDeliverable, isCatchAll, isReachable, emailDNS, riskReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeEmail200Response {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailProvider: ").append(toIndentedString(emailProvider)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    isFormatValid: ").append(toIndentedString(isFormatValid)).append("\n");
    sb.append("    emailCorrection: ").append(toIndentedString(emailCorrection)).append("\n");
    sb.append("    isDeliverable: ").append(toIndentedString(isDeliverable)).append("\n");
    sb.append("    isCatchAll: ").append(toIndentedString(isCatchAll)).append("\n");
    sb.append("    isReachable: ").append(toIndentedString(isReachable)).append("\n");
    sb.append("    emailDNS: ").append(toIndentedString(emailDNS)).append("\n");
    sb.append("    riskReport: ").append(toIndentedString(riskReport)).append("\n");
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
    openapiFields.add("emailAddress");
    openapiFields.add("emailProvider");
    openapiFields.add("emailType");
    openapiFields.add("isFormatValid");
    openapiFields.add("emailCorrection");
    openapiFields.add("isDeliverable");
    openapiFields.add("isCatchAll");
    openapiFields.add("isReachable");
    openapiFields.add("emailDNS");
    openapiFields.add("riskReport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emailAddress");
    openapiRequiredFields.add("emailProvider");
    openapiRequiredFields.add("emailType");
    openapiRequiredFields.add("isFormatValid");
    openapiRequiredFields.add("emailCorrection");
    openapiRequiredFields.add("isDeliverable");
    openapiRequiredFields.add("isCatchAll");
    openapiRequiredFields.add("isReachable");
    openapiRequiredFields.add("emailDNS");
    openapiRequiredFields.add("riskReport");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnalyzeEmail200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnalyzeEmail200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeEmail200Response is not found in the empty JSON string", AnalyzeEmail200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnalyzeEmail200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalyzeEmail200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnalyzeEmail200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if (!jsonObj.get("emailProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailProvider").toString()));
      }
      if (!jsonObj.get("emailType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailType").toString()));
      }
      if (!jsonObj.get("emailCorrection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailCorrection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailCorrection").toString()));
      }
      // validate the required field `emailDNS`
      EmailDNS.validateJsonElement(jsonObj.get("emailDNS"));
      // validate the required field `riskReport`
      RiskReport.validateJsonElement(jsonObj.get("riskReport"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeEmail200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeEmail200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeEmail200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeEmail200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeEmail200Response>() {
           @Override
           public void write(JsonWriter out, AnalyzeEmail200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyzeEmail200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnalyzeEmail200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnalyzeEmail200Response
   * @throws IOException if the JSON string is invalid with respect to AnalyzeEmail200Response
   */
  public static AnalyzeEmail200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeEmail200Response.class);
  }

  /**
   * Convert an instance of AnalyzeEmail200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

