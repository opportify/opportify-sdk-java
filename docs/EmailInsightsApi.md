# EmailInsightsApi

All URIs are relative to *https://api.opportify.ai/insights/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeEmail**](EmailInsightsApi.md#analyzeEmail) | **POST** /email/analyze | Analyze Email |


<a id="analyzeEmail"></a>
# **analyzeEmail**
> AnalyzeEmail200Response analyzeEmail(analyzeEmailRequest)

Analyze Email

The **Analyze Email** endpoint validates an email address and returns its deliverability status, provider details, and potential corrections. This endpoint is ideal for ensuring accurate email data before usage.  ### Features: - Validate email syntax. - Identify email types (free, disposable, corporate or unknown). - Real time verifications:   - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.   - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.   - Catch-All: Detects if the domain accepts all emails (catch-all configuration). - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses. - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;email\&quot;: \&quot;my-email@company.com\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 

### Example
```java
// Import classes:
import ai.opportify.client.ApiClient;
import ai.opportify.client.ApiException;
import ai.opportify.client.Configuration;
import ai.opportify.client.auth.*;
import ai.opportify.client.models.*;
import ai.opportify.client.api.EmailInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opportify.ai/insights/v1");
    
    // Configure API key authorization: opportifyToken
    ApiKeyAuth opportifyToken = (ApiKeyAuth) defaultClient.getAuthentication("opportifyToken");
    opportifyToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //opportifyToken.setApiKeyPrefix("Token");

    EmailInsightsApi apiInstance = new EmailInsightsApi(defaultClient);
    AnalyzeEmailRequest analyzeEmailRequest = new AnalyzeEmailRequest(); // AnalyzeEmailRequest | 
    try {
      AnalyzeEmail200Response result = apiInstance.analyzeEmail(analyzeEmailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailInsightsApi#analyzeEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analyzeEmailRequest** | [**AnalyzeEmailRequest**](AnalyzeEmailRequest.md)|  | |

### Return type

[**AnalyzeEmail200Response**](AnalyzeEmail200Response.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email validation successful. |  -  |
| **400** | Bad Request. Either the request is improperly formatted, or the email is invalid. |  -  |
| **500** | Internal server error. |  -  |

