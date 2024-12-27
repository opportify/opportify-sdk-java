/*
 * Opportify Insights API
 * ## Overview  The **Opportify Insights API** provides access to a powerful and up-to-date platform. With advanced data warehousing and AI-driven capabilities, this API is designed to empower your business to make informed, data-driven decisions and effectively assess potential risks.  ### Base URL Use the following base URL for all API requests:  ```plaintext https://api.opportify.ai/insights/v1/<service>/<endpoint> ```  ### Features - [**Email Insights:**](/docs/api-reference/email-insights)   - Validate email syntax.   - Identify email types (free, disposable, corporate or unknown).   - Real time verifications:     - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.     - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.     - Catch-All: Detects if the domain accepts all emails (catch-all configuration).   - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses.   - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.      [Access Documentation >>](/docs/api-reference/email-insights)  - [**IP Insights:**](/docs/api-reference/ip-insights)   - Connection types: Detects connection types such as `wired`, `mobile`, `enterprise`, `satellite`, `VPN`, `cloud-provider`, `open-proxy`, or `Tor`.   - Geo location: Delivers detailed insights such as country, city, timezone, language preferences, and additional location-based information to enhance regional understanding.   - WHOIS: Provides main details including RIR, ASN, organization, and abuse/admin/technical contacts.   - Trusted Provider Recognition: Identifies if the IP is part of a known trusted provider (e.g., ZTNA - Zero Trust Network Access).   - Blocklist Reports: Retrieves up-to-date blocklist statuses, active reports, and the latest detections.   - Risk Report: Delivers an AI-driven normalized score (200-1000) to evaluate IP risk, supported by predefined thresholds.    [Access Documentation >>](/docs/api-reference/ip-insights)  ### Authentication & Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://Opportify.ai.tech).
 * https://Opportify.ai.tech
 * Do not edit the class manually.
 */


package ai.opportify.client.api;

import ai.opportify.client.ApiCallback;
import ai.opportify.client.ApiClient;
import ai.opportify.client.ApiException;
import ai.opportify.client.ApiResponse;
import ai.opportify.client.Configuration;
import ai.opportify.client.Pair;
import ai.opportify.client.ProgressRequestBody;
import ai.opportify.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ai.opportify.client.model.AnalyzeEmail200Response;
import ai.opportify.client.model.AnalyzeEmail400Response;
import ai.opportify.client.model.AnalyzeEmail500Response;
import ai.opportify.client.model.AnalyzeEmailRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailInsightsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmailInsightsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailInsightsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for analyzeEmail
     * @param analyzeEmailRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email validation successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Either the request is improperly formatted, or the email is invalid. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyzeEmailCall(AnalyzeEmailRequest analyzeEmailRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = analyzeEmailRequest;

        // create path and map variables
        String localVarPath = "/email/analyze";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "opportifyToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call analyzeEmailValidateBeforeCall(AnalyzeEmailRequest analyzeEmailRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'analyzeEmailRequest' is set
        if (analyzeEmailRequest == null) {
            throw new ApiException("Missing the required parameter 'analyzeEmailRequest' when calling analyzeEmail(Async)");
        }

        return analyzeEmailCall(analyzeEmailRequest, _callback);

    }

    /**
     * Analyze Email
     * The **Analyze Email** endpoint validates an email address and returns its deliverability status, provider details, and potential corrections. This endpoint is ideal for ensuring accurate email data before usage.  ### Features: - Validate email syntax. - Identify email types (free, disposable, corporate or unknown). - Real time verifications:   - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.   - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.   - Catch-All: Detects if the domain accepts all emails (catch-all configuration). - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses. - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;email\&quot;: \&quot;my-email@company.com\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 
     * @param analyzeEmailRequest  (required)
     * @return AnalyzeEmail200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email validation successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Either the request is improperly formatted, or the email is invalid. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public AnalyzeEmail200Response analyzeEmail(AnalyzeEmailRequest analyzeEmailRequest) throws ApiException {
        ApiResponse<AnalyzeEmail200Response> localVarResp = analyzeEmailWithHttpInfo(analyzeEmailRequest);
        return localVarResp.getData();
    }

    /**
     * Analyze Email
     * The **Analyze Email** endpoint validates an email address and returns its deliverability status, provider details, and potential corrections. This endpoint is ideal for ensuring accurate email data before usage.  ### Features: - Validate email syntax. - Identify email types (free, disposable, corporate or unknown). - Real time verifications:   - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.   - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.   - Catch-All: Detects if the domain accepts all emails (catch-all configuration). - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses. - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;email\&quot;: \&quot;my-email@company.com\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 
     * @param analyzeEmailRequest  (required)
     * @return ApiResponse&lt;AnalyzeEmail200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email validation successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Either the request is improperly formatted, or the email is invalid. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AnalyzeEmail200Response> analyzeEmailWithHttpInfo(AnalyzeEmailRequest analyzeEmailRequest) throws ApiException {
        okhttp3.Call localVarCall = analyzeEmailValidateBeforeCall(analyzeEmailRequest, null);
        Type localVarReturnType = new TypeToken<AnalyzeEmail200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Analyze Email (asynchronously)
     * The **Analyze Email** endpoint validates an email address and returns its deliverability status, provider details, and potential corrections. This endpoint is ideal for ensuring accurate email data before usage.  ### Features: - Validate email syntax. - Identify email types (free, disposable, corporate or unknown). - Real time verifications:   - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.   - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.   - Catch-All: Detects if the domain accepts all emails (catch-all configuration). - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses. - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;email\&quot;: \&quot;my-email@company.com\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 
     * @param analyzeEmailRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email validation successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Either the request is improperly formatted, or the email is invalid. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call analyzeEmailAsync(AnalyzeEmailRequest analyzeEmailRequest, final ApiCallback<AnalyzeEmail200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = analyzeEmailValidateBeforeCall(analyzeEmailRequest, _callback);
        Type localVarReturnType = new TypeToken<AnalyzeEmail200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
