

# BlockListed

### Block Listed Details  The `BlockListed` object provides detailed information about whether an IP address is listed in known blocklists and related data.   ---  #### Key Highlights: - **Continuous Monitoring**: We constantly monitor and update blocklist sources to ensure the information is accurate and reflects the latest active reports. - **Expanding Coverage**: Our system incorporates a wide range of trusted sources, with continuous efforts to onboard additional blocklist data providers.  ---  ### Response Elements 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isBlockListed** | **Boolean** | Indicates if the IP is blocklisted in some of the known blocklist sources. |  |
|**sources** | **Integer** | Number of blocklist sources. |  |
|**activeReports** | **Integer** | Number of blocklist active reports for the given IP address. We constantly monitor and update this value as new reports are detected or resolved. |  |
|**lastDetected** | **OffsetDateTime** | Date and time of the last blocklist detection. ISO 8601 standard. |  [optional] |



