# opportify-sdk-client

Opportify Insights API
- API version: 0.1.0
  - Build date: 2024-12-26T14:40:56.270361-08:00[America/Los_Angeles]
  - Generator version: 7.10.0

## Overview

The **Opportify Insights API** provides access to a powerful and up-to-date platform. With advanced data warehousing and AI-driven capabilities, this API is designed to empower your business to make informed, data-driven decisions and effectively assess potential risks.

### Base URL
Use the following base URL for all API requests:

```plaintext
https://api.opportify.ai/insights/v1/<service>/<endpoint>
```

### Features
- [**Email Insights:**](/docs/api-reference/email-insights)
  - Validate email syntax.
  - Identify email types (free, disposable, corporate or unknown).
  - Real time verifications:
    - Reachable: Confirms if the email domain has valid MX DNS records using DNS lookup.
    - Deliverable: Simulates an SMTP handshake to check if the email address exists and is deliverable.
    - Catch-All: Detects if the domain accepts all emails (catch-all configuration).
  - Intelligent Error Correction: Automatically corrects well-known misspelled email addresses.
  - Risk Report: Provides an AI-driven normalized score (200-1000) to evaluate email risk, using predefined thresholds.
  
  [Access Documentation >>](/docs/api-reference/email-insights)

- [**IP Insights:**](/docs/api-reference/ip-insights)
  - Connection types: Detects connection types such as `wired`, `mobile`, `enterprise`, `satellite`, `VPN`, `cloud-provider`, `open-proxy`, or `Tor`.
  - Geo location: Delivers detailed insights such as country, city, timezone, language preferences, and additional location-based information to enhance regional understanding.
  - WHOIS: Provides main details including RIR, ASN, organization, and abuse/admin/technical contacts.
  - Trusted Provider Recognition: Identifies if the IP is part of a known trusted provider (e.g., ZTNA - Zero Trust Network Access).
  - Blocklist Reports: Retrieves up-to-date blocklist statuses, active reports, and the latest detections.
  - Risk Report: Delivers an AI-driven normalized score (200-1000) to evaluate IP risk, supported by predefined thresholds.

  [Access Documentation >>](/docs/api-reference/ip-insights)

### Authentication & Security
- **API Key:** Access to the API requires an API key, which must be included in the request headers. Businesses can generate unlimited API keys directly from their account, offering flexibility and ease of use. 
- **ACL Rules:** Enhance security with Access Control Lists (ACL), allowing you to restrict API access from specific IP addresses or ranges. This feature provides an additional layer of protection by ensuring only authorized IPs can interact with the API.
- **No Query Parameters:** As a precautionary measure, our API avoids the use of query parameters for all operations, including authentication and handling Personally Identifiable Information (PII). This approach minimizes security risks by preventing sensitive data from being exposed in access logs, browser history, cached URLs, debugging tools, or inadvertently shared URLs. All sensitive information is securely transmitted through headers or the request body.



*Automatically generated by the [OpenAPI Generator](https://Opportify.ai.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ai.opportify</groupId>
  <artifactId>opportify-sdk-java</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'opportify-sdk-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'opportify-sdk-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "ai.opportify:opportify-sdk-java:0.1.0"
  }
```

### Local development

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/opportify-sdk-java-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import ai.opportify.client.ApiClient;
import ai.opportify.client.ApiException;
import ai.opportify.client.Configuration;
import ai.opportify.client.auth.*;
import ai.opportify.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://api.opportify.ai/insights/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EmailInsightsApi* | [**analyzeEmail**](docs/EmailInsightsApi.md#analyzeEmail) | **POST** /email/analyze | Analyze Email
*IpInsightsApi* | [**analyzeIp**](docs/IpInsightsApi.md#analyzeIp) | **POST** /ip/analyze | Analyze IP


## Documentation for Models

 - [AbuseContact](docs/AbuseContact.md)
 - [AdminContact](docs/AdminContact.md)
 - [AnalyzeEmail200Response](docs/AnalyzeEmail200Response.md)
 - [AnalyzeEmail400Response](docs/AnalyzeEmail400Response.md)
 - [AnalyzeEmail400ResponseError](docs/AnalyzeEmail400ResponseError.md)
 - [AnalyzeEmail500Response](docs/AnalyzeEmail500Response.md)
 - [AnalyzeEmail500ResponseError](docs/AnalyzeEmail500ResponseError.md)
 - [AnalyzeEmailRequest](docs/AnalyzeEmailRequest.md)
 - [AnalyzeIp200Response](docs/AnalyzeIp200Response.md)
 - [AnalyzeIp400Response](docs/AnalyzeIp400Response.md)
 - [AnalyzeIp400ResponseError](docs/AnalyzeIp400ResponseError.md)
 - [AnalyzeIp404Response](docs/AnalyzeIp404Response.md)
 - [AnalyzeIp500Response](docs/AnalyzeIp500Response.md)
 - [AnalyzeIpRequest](docs/AnalyzeIpRequest.md)
 - [Asn](docs/Asn.md)
 - [BlockListed](docs/BlockListed.md)
 - [EmailDNS](docs/EmailDNS.md)
 - [Geo](docs/Geo.md)
 - [INTERNALERROR](docs/INTERNALERROR.md)
 - [INVALIDEMAIL](docs/INVALIDEMAIL.md)
 - [IPVALIDATIONFAILED](docs/IPVALIDATIONFAILED.md)
 - [MALFORMEDREQUEST](docs/MALFORMEDREQUEST.md)
 - [MALFORMEDREQUEST1](docs/MALFORMEDREQUEST1.md)
 - [NOTFOUND](docs/NOTFOUND.md)
 - [Organization](docs/Organization.md)
 - [RiskReport](docs/RiskReport.md)
 - [TechContact](docs/TechContact.md)
 - [TrustedProvider](docs/TrustedProvider.md)
 - [Whois](docs/Whois.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="opportifyToken"></a>
### opportifyToken

- **Type**: API key
- **API key parameter name**: x-opportify-token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



