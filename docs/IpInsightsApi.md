# IpInsightsApi

All URIs are relative to *https://api.opportify.ai/insights/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeIp**](IpInsightsApi.md#analyzeIp) | **POST** /ip/analyze | Analyze IP |


<a id="analyzeIp"></a>
# **analyzeIp**
> AnalyzeIp200Response analyzeIp(analyzeIpRequest)

Analyze IP

The **Analyze IP** endpoint provides comprehensive insights into a specified IP address, leveraging AI-driven analysis to deliver actionable intelligence. This includes connection type identification, detailed geolocation data, WHOIS information, trusted provider verification, up-to-date blocklist reports, and a robust risk assessment. Compatible with both IPv4 and IPv6, this endpoint is designed to empower businesses with precise and reliable IP data.  ### Features: - Connection types: Detects connection types such as &#x60;wired&#x60;, &#x60;mobile&#x60;, &#x60;enterprise&#x60;, &#x60;satellite&#x60;, &#x60;vpn&#x60;, &#x60;cloud-provider&#x60;, &#x60;open-proxy&#x60;, or &#x60;Tor&#x60;. - Geo location: Delivers detailed insights such as country, city, timezone, language preferences, and additional location-based information to enhance regional understanding. - WHOIS: Provides main details including RIR, ASN, organization, and abuse/admin/technical contacts. - Trusted Provider Recognition: Identifies if the IP is part of a known trusted provider (e.g., ZTNA - Zero Trust Network Access). - Blocklist Reports: Retrieves up-to-date blocklist statuses, active reports, and the latest detections. - Risk Report: Delivers an AI-driven normalized score (200-1000) to evaluate IP risk, supported by predefined thresholds.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;ip\&quot;: \&quot;192.168.0.1\&quot;,   \&quot;enableAI\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 

### Example
```java
// Import classes:
import ai.opportify.client.ApiClient;
import ai.opportify.client.ApiException;
import ai.opportify.client.Configuration;
import ai.opportify.client.auth.*;
import ai.opportify.client.models.*;
import ai.opportify.client.api.IpInsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.opportify.ai/insights/v1");
    
    // Configure API key authorization: opportifyToken
    ApiKeyAuth opportifyToken = (ApiKeyAuth) defaultClient.getAuthentication("opportifyToken");
    opportifyToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //opportifyToken.setApiKeyPrefix("Token");

    IpInsightsApi apiInstance = new IpInsightsApi(defaultClient);
    AnalyzeIpRequest analyzeIpRequest = new AnalyzeIpRequest(); // AnalyzeIpRequest | 
    try {
      AnalyzeIp200Response result = apiInstance.analyzeIp(analyzeIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpInsightsApi#analyzeIp");
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
| **analyzeIpRequest** | [**AnalyzeIpRequest**](AnalyzeIpRequest.md)|  | |

### Return type

[**AnalyzeIp200Response**](AnalyzeIp200Response.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The IP analysis is successful. |  -  |
| **400** | Bad Request. Either the request is improperly formatted, or the IP is invalid. |  -  |
| **404** | IP address not found in any RIR database. |  -  |
| **500** | Internal server error. |  -  |

