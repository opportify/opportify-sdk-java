# IpInsightsApi

All URIs are relative to *https://api.opportify.ai/insights/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeIp**](IpInsightsApi.md#analyzeIp) | **POST** /ip/analyze | Analyze IP |
| [**batchAnalyzeIps**](IpInsightsApi.md#batchAnalyzeIps) | **POST** /ip/batch | Batch Analyze IPs |
| [**createIpBatchExport**](IpInsightsApi.md#createIpBatchExport) | **POST** /ip/batch/{jobId}/exports | Create IP Batch Export |
| [**getIpBatchExportStatus**](IpInsightsApi.md#getIpBatchExportStatus) | **GET** /ip/batch/{jobId}/exports/{exportId} | Get IP Batch Export Status |
| [**getIpBatchStatus**](IpInsightsApi.md#getIpBatchStatus) | **GET** /ip/batch/{jobId} | Get IP Batch Status |


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
| **403** | Forbidden. Authorization errors from the API. |  -  |
| **500** | Internal server error. |  -  |

<a id="batchAnalyzeIps"></a>
# **batchAnalyzeIps**
> BatchAnalyzeIps202Response batchAnalyzeIps(batchAnalyzeIpsRequest)

Batch Analyze IPs

The **Batch Analyze IPs** endpoint enables processing of large volumes of IP addresses asynchronously. This endpoint accepts various input formats and returns a job ID for tracking the analysis progress.  ### Features: - **Asynchronous Processing**: Submit large lists of IP addresses for background processing. - **Multiple Input Formats**: Submit data as JSON arrays, tabular CSV/TSV/XLSX uploads, or line-separated text. - **Job Tracking**: Monitor processing status using the returned job ID.  ### Example JSON Request: &#x60;&#x60;&#x60;json {   \&quot;ips\&quot;: [     \&quot;192.168.0.1\&quot;,     \&quot;10.0.0.1\&quot;,     \&quot;172.16.0.1\&quot;   ],   \&quot;name\&quot;: \&quot;my list of IPs\&quot;,   \&quot;enableAI\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access requires an API key in the request headers. - **ACL Rules:** Optional IP-based access restrictions for enhanced security. - **No Query Parameters:** All data is transmitted securely through headers or request body.  ### Payload Limits - Maximum payload size: 3MB 

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
    BatchAnalyzeIpsRequest batchAnalyzeIpsRequest = new BatchAnalyzeIpsRequest(); // BatchAnalyzeIpsRequest | 
    try {
      BatchAnalyzeIps202Response result = apiInstance.batchAnalyzeIps(batchAnalyzeIpsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpInsightsApi#batchAnalyzeIps");
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
| **batchAnalyzeIpsRequest** | [**BatchAnalyzeIpsRequest**](BatchAnalyzeIpsRequest.md)|  | |

### Return type

[**BatchAnalyzeIps202Response**](BatchAnalyzeIps202Response.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, text/plain
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch job accepted for processing. |  -  |
| **400** | Bad Request. Either the request is improperly formatted, or contains invalid IP addresses. |  -  |
| **401** | Unauthorized. Invalid or missing authentication token. |  -  |
| **402** | Plan limitations or quota exceeded. |  -  |
| **403** | Forbidden. Authorization errors from the API. |  -  |
| **413** | Payload Too Large. The request exceeds the 3MB size limit. |  -  |
| **429** | Too Many Requests. Rate limit exceeded. |  -  |
| **500** | Internal server error. |  -  |

<a id="createIpBatchExport"></a>
# **createIpBatchExport**
> ExportCreatedResponse createIpBatchExport(jobId, exportRequest)

Create IP Batch Export

The **Create IP Batch Export** endpoint allows you to request a custom export of completed batch analysis results. You can apply filters, select specific columns, and choose the output format (CSV or JSON).  ### Features: - **Format Options**: Export results as CSV or JSON - **Filtering**: Apply filters on any field in the response data - **Column Selection**: Choose specific fields to include in the export - **Async Processing**: Export requests are processed asynchronously  ### Filter Syntax: - **String filters**: Exact match, comma-separated values, or arrays - **Numeric filters**: Exact values, arrays, or range objects with &#x60;min&#x60;/&#x60;max&#x60; - **Nested fields**: Use dot notation (e.g., &#x60;result.riskReport.score&#x60;)  ### Example Request: &#x60;&#x60;&#x60;json {   \&quot;exportType\&quot;: \&quot;json\&quot;,   \&quot;filters\&quot;: {     \&quot;result.riskReport.level\&quot;: \&quot;low,medium\&quot;,     \&quot;result.riskReport.score\&quot;: { \&quot;max\&quot;: 500 },     \&quot;result.geo.countryCode\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;, \&quot;GB\&quot;]   } } &#x60;&#x60;&#x60; 

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
    UUID jobId = UUID.fromString("52b36b1f-0c21-41fa-8a4f-423d25a9a8e2"); // UUID | The unique identifier of the completed batch job.
    ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
    try {
      ExportCreatedResponse result = apiInstance.createIpBatchExport(jobId, exportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpInsightsApi#createIpBatchExport");
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
| **jobId** | **UUID**| The unique identifier of the completed batch job. | |
| **exportRequest** | [**ExportRequest**](ExportRequest.md)|  | [optional] |

### Return type

[**ExportCreatedResponse**](ExportCreatedResponse.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Export request accepted for processing. |  -  |
| **400** | Bad Request. Invalid request parameters or body. |  -  |
| **403** | Forbidden. Access denied to this job. |  -  |
| **404** | Job not found. |  -  |
| **409** | Conflict. Job not ready for export. |  -  |

<a id="getIpBatchExportStatus"></a>
# **getIpBatchExportStatus**
> ExportStatusResponse getIpBatchExportStatus(jobId, exportId)

Get IP Batch Export Status

The **Get IP Batch Export Status** endpoint retrieves the status and download URL for a previously requested export job.  ### Export Status Values: - &#x60;QUEUED&#x60;: Export request received, waiting for processing - &#x60;PROCESSING&#x60;: Worker is filtering and generating the export file - &#x60;COMPLETED&#x60;: Export ready, &#x60;downloadUrl&#x60; available - &#x60;FAILED&#x60;: Export failed, check &#x60;errorCode&#x60; and &#x60;errorMessage&#x60; 

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
    UUID jobId = UUID.fromString("52b36b1f-0c21-41fa-8a4f-423d25a9a8e2"); // UUID | The unique identifier of the batch job.
    UUID exportId = UUID.fromString("3b90d156-a0d8-4630-8230-f59e9a4e9e33"); // UUID | The unique identifier of the export job.
    try {
      ExportStatusResponse result = apiInstance.getIpBatchExportStatus(jobId, exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpInsightsApi#getIpBatchExportStatus");
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
| **jobId** | **UUID**| The unique identifier of the batch job. | |
| **exportId** | **UUID**| The unique identifier of the export job. | |

### Return type

[**ExportStatusResponse**](ExportStatusResponse.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved export status. |  -  |
| **400** | Bad Request. Invalid path parameters. |  -  |
| **403** | Forbidden. Access denied to this job. |  -  |
| **404** | Job or export not found. |  -  |

<a id="getIpBatchStatus"></a>
# **getIpBatchStatus**
> GetIpBatchStatus200Response getIpBatchStatus(jobId)

Get IP Batch Status

The **Get IP Batch Status** endpoint allows you to retrieve the current status of a previously submitted batch processing job. Use this endpoint to track the progress of your batch IP analysis request and retrieve results when processing is complete.  ### Response Information: - When status is &#x60;QUEUED&#x60;: The job is in the processing queue waiting to be processed. - When status is &#x60;PROCESSING&#x60;: The job is actively being processed. - When status is &#x60;COMPLETED&#x60;: The job has finished successfully. - When status is &#x60;ERROR&#x60;: An issue occurred during processing; check the statusDescription for details. 

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
    String jobId = "uuid-12345-67890"; // String | The unique identifier of the batch job to retrieve status for.
    try {
      GetIpBatchStatus200Response result = apiInstance.getIpBatchStatus(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpInsightsApi#getIpBatchStatus");
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
| **jobId** | **String**| The unique identifier of the batch job to retrieve status for. | |

### Return type

[**GetIpBatchStatus200Response**](GetIpBatchStatus200Response.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved batch job status. |  -  |
| **401** | Unauthorized. Invalid or missing authentication token. |  -  |
| **402** | Plan limitations or quota exceeded. |  -  |
| **403** | Forbidden. Authorization errors from the API. |  -  |
| **404** | Job not found. The specified jobId doesn&#39;t exist or has expired. |  -  |
| **429** | Too Many Requests. Rate limit exceeded. |  -  |
| **500** | Internal server error. |  -  |

