# EmailInsightsApi

All URIs are relative to *https://api.opportify.ai/insights/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeEmail**](EmailInsightsApi.md#analyzeEmail) | **POST** /email/analyze | Analyze Email |
| [**batchAnalyzeEmails**](EmailInsightsApi.md#batchAnalyzeEmails) | **POST** /email/batch | Batch Analyze Emails |
| [**createEmailBatchExport**](EmailInsightsApi.md#createEmailBatchExport) | **POST** /email/batch/{jobId}/exports | Create Email Batch Export |
| [**getEmailBatchExportStatus**](EmailInsightsApi.md#getEmailBatchExportStatus) | **GET** /email/batch/{jobId}/exports/{exportId} | Get Email Batch Export Status |
| [**getEmailBatchStatus**](EmailInsightsApi.md#getEmailBatchStatus) | **GET** /email/batch/{jobId} | Get Email Batch Status |


<a id="analyzeEmail"></a>
# **analyzeEmail**
> AnalyzeEmail200Response analyzeEmail(analyzeEmailRequest)

Analyze Email

The **Analyze Email** endpoint validates an email address and returns its deliverability status, provider details, and potential corrections. This endpoint is ideal for ensuring accurate email data before usage.  ### Features: - **Syntax intelligence:** Validates RFC compliance, normalizes casing, and suggests corrections for typo-prone domains. - **Provider &amp; classification:** Identifies the provider slug, detects private/free/disposable usage, and flags role or no-reply inboxes. - **Live deliverability checks:** Performs DNS reachability, SMTP handshakes, catch-all detection, and mailbox-full assessments in real time. - **AI risk reporting:** Returns a normalized 200–1000 score with the top weighted reason codes and guardrails for high-risk findings. - **Domain enrichment &amp; DNS snapshot:** Surfaces registrar, age, security posture, and priority-ordered MX records when enrichment is enabled.  ### Example Request Body: &#x60;&#x60;&#x60;json {   \&quot;email\&quot;: \&quot;my-email@company.com\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true,   \&quot;enableDomainEnrichment\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use.  - **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API. - **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body. 

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
| **403** | Forbidden. Authorization errors from the API. |  -  |
| **500** | Internal server error. |  -  |

<a id="batchAnalyzeEmails"></a>
# **batchAnalyzeEmails**
> BatchAnalyzeEmails202Response batchAnalyzeEmails(batchAnalyzeEmailsRequest)

Batch Analyze Emails

The **Batch Analyze Emails** endpoint enables processing of large volumes of email addresses asynchronously. This endpoint accepts various input formats and returns a job ID for tracking the analysis progress.  ### Features: - **Asynchronous Processing**: Submit large lists of emails for background processing. - **Multiple Input Formats**: Submit data as JSON arrays, tabular CSV/TSV/XLSX uploads, or line-separated text. - **Job Tracking**: Monitor processing status using the returned job ID.  ### Example JSON Request: &#x60;&#x60;&#x60;json {   \&quot;emails\&quot;: [     \&quot;first-email@domain.com\&quot;,     \&quot;second-email@domain.com\&quot;   ],   \&quot;name\&quot;: \&quot;my list of emails\&quot;,   \&quot;enableAI\&quot;: true,   \&quot;enableAutoCorrection\&quot;: true } &#x60;&#x60;&#x60;  ### Authentication &amp; Security - **API Key:** Access requires an API key in the request headers. - **ACL Rules:** Optional IP-based access restrictions for enhanced security. - **No Query Parameters:** All data is transmitted securely through headers or request body.  ### Payload Limits - Maximum payload size: 3MB 

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
    BatchAnalyzeEmailsRequest batchAnalyzeEmailsRequest = new BatchAnalyzeEmailsRequest(); // BatchAnalyzeEmailsRequest | 
    try {
      BatchAnalyzeEmails202Response result = apiInstance.batchAnalyzeEmails(batchAnalyzeEmailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailInsightsApi#batchAnalyzeEmails");
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
| **batchAnalyzeEmailsRequest** | [**BatchAnalyzeEmailsRequest**](BatchAnalyzeEmailsRequest.md)|  | |

### Return type

[**BatchAnalyzeEmails202Response**](BatchAnalyzeEmails202Response.md)

### Authorization

[opportifyToken](../README.md#opportifyToken)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data, text/plain
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch job accepted for processing. |  -  |
| **400** | Bad Request. Either the request is improperly formatted, or contains invalid data. |  -  |
| **401** | Unauthorized. Invalid or missing authentication token. |  -  |
| **402** | Plan limitations or quota exceeded. |  -  |
| **403** | Forbidden. Authorization errors from the API. |  -  |
| **413** | Payload Too Large. The request exceeds the 3MB size limit. |  -  |
| **429** | Too Many Requests. Rate limit exceeded. |  -  |
| **500** | Internal server error. |  -  |

<a id="createEmailBatchExport"></a>
# **createEmailBatchExport**
> ExportCreatedResponse createEmailBatchExport(jobId, exportRequest)

Create Email Batch Export

The **Create Email Batch Export** endpoint allows you to request a custom export of completed batch analysis results. You can apply filters, select specific columns, and choose the output format (CSV or JSON).  ### Features: - **Format Options**: Export results as CSV or JSON - **Filtering**: Apply filters on any field in the response data - **Column Selection**: Choose specific fields to include in the export - **Async Processing**: Export requests are processed asynchronously  ### Filter Syntax: - **String filters**: Exact match, comma-separated values, or arrays - **Numeric filters**: Exact values, arrays, or range objects with &#x60;min&#x60;/&#x60;max&#x60; - **Nested fields**: Use dot notation (e.g., &#x60;riskReport.score&#x60;)  ### Example Request: &#x60;&#x60;&#x60;json {   \&quot;exportType\&quot;: \&quot;csv\&quot;,   \&quot;filters\&quot;: {     \&quot;isDeliverable\&quot;: \&quot;yes\&quot;,     \&quot;riskReport.score\&quot;: { \&quot;min\&quot;: 0, \&quot;max\&quot;: 400 },     \&quot;emailProvider\&quot;: [\&quot;gmail\&quot;, \&quot;yahoo\&quot;, \&quot;outlook\&quot;]   },   \&quot;columns\&quot;: [     \&quot;emailAddress\&quot;,     \&quot;emailProvider\&quot;,     \&quot;riskReport.score\&quot;,     \&quot;isDeliverable\&quot;   ] } &#x60;&#x60;&#x60; 

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
    UUID jobId = UUID.fromString("84d22c8b-2cb6-4606-bfb1-361244a097e4"); // UUID | The unique identifier of the completed batch job.
    ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
    try {
      ExportCreatedResponse result = apiInstance.createEmailBatchExport(jobId, exportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailInsightsApi#createEmailBatchExport");
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

<a id="getEmailBatchExportStatus"></a>
# **getEmailBatchExportStatus**
> ExportStatusResponse getEmailBatchExportStatus(jobId, exportId)

Get Email Batch Export Status

The **Get Email Batch Export Status** endpoint retrieves the status and download URL for a previously requested export job.  ### Export Status Values: - &#x60;QUEUED&#x60;: Export request received, waiting for processing - &#x60;PROCESSING&#x60;: Worker is filtering and generating the export file - &#x60;COMPLETED&#x60;: Export ready, &#x60;downloadUrl&#x60; available - &#x60;FAILED&#x60;: Export failed, check &#x60;errorCode&#x60; and &#x60;errorMessage&#x60; 

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
    UUID jobId = UUID.fromString("84d22c8b-2cb6-4606-bfb1-361244a097e4"); // UUID | The unique identifier of the batch job.
    UUID exportId = UUID.fromString("6f8d88ef-0896-4f69-90cd-7cc6ce5e6ddf"); // UUID | The unique identifier of the export job.
    try {
      ExportStatusResponse result = apiInstance.getEmailBatchExportStatus(jobId, exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailInsightsApi#getEmailBatchExportStatus");
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

<a id="getEmailBatchStatus"></a>
# **getEmailBatchStatus**
> GetEmailBatchStatus200Response getEmailBatchStatus(jobId)

Get Email Batch Status

The **Get Email Batch Status** endpoint allows you to retrieve the current status of a previously submitted batch processing job. Use this endpoint to track the progress of your batch email analysis request and retrieve results when processing is complete.  ### Response Information: - When status is &#x60;QUEUED&#x60;: The job is in the processing queue waiting to be processed. - When status is &#x60;PROCESSING&#x60;: The job is actively being processed. - When status is &#x60;COMPLETED&#x60;: The job has finished successfully. - When status is &#x60;ERROR&#x60;: An issue occurred during processing; check the statusDescription for details. 

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
    String jobId = "uuid-12345-67890"; // String | The unique identifier of the batch job to retrieve status for.
    try {
      GetEmailBatchStatus200Response result = apiInstance.getEmailBatchStatus(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailInsightsApi#getEmailBatchStatus");
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

[**GetEmailBatchStatus200Response**](GetEmailBatchStatus200Response.md)

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

