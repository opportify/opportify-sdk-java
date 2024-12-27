

# Geo

### Geolocation Determination & Confidence Levels Geolocation details are derived by analyzing the provided IP address using data aggregated from a wide range of sources, both official and unofficial (such as user-generated data, open-source, or crowdsourced). This data is meticulously evaluated and ranked using a proprietary weighted reliability score that is tailored to the specific characteristics and trustworthiness of each data source.  ---  #### Confidence Levels  The geolocation process assigns a confidence level to each level of granularity. These levels reflect the probability of accuracy based on the reliability of the data and analysis:  - **Continent-Level (99%)**: The determination of the continent is highly reliable, with a near-certain accuracy rate of 99%. - **Country-Level (98%)**: Locating the specific country has a very high accuracy of 98%, reflecting reliable cross-verification. - **Region-Level (70–90%)**: Identifying regions (such as states or provinces) has moderate to high accuracy, depending on the data quality and density for the given area. - **City-Level (50–70%)**: Pinpointing the specific city is moderately accurate, influenced by factors such as ISP data resolution and urban vs. rural settings. - **Specific Area/Point (5–40%)**: Pinpointing a highly specific area (e.g., a neighborhood or street) has a significantly lower confidence level due to inherent limitations in IP-based geolocation technology.  ---  #### Key Features  - **Alphabetical Object Sorting**:     The keys in the returned geolocation object are consistently sorted alphabetically, ensuring a predictable structure for easier integration and parsing.  ---  ### Response Elements 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**continent** | **String** | Name of the continent. Normalized as \&quot;Title Case\&quot;. |  [optional] |
|**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional] |
|**countryName** | **String** | Full name of the country. Normalized as \&quot;Title Case\&quot;. |  [optional] |
|**countryShortName** | **String** | ISO 3166-1 English short version. Normalized as \&quot;Title Case\&quot;. |  [optional] |
|**city** | **String** | Name of the city. Normalized as \&quot;Title Case\&quot;. |  [optional] |
|**currencyCode** | **String** | ISO 4217 currency code. |  [optional] |
|**domainExtension** | **String** | Top-level domain (TLD) for the country. 63 characters limit. IANA / ICANN defined. |  [optional] |
|**languages** | **String** | List of languages spoken in the country separated by commas. (BCP 47 (Best Current Practice 47)) |  [optional] |
|**latitude** | **BigDecimal** | Latitude coordinate. |  [optional] |
|**longitude** | **BigDecimal** | Longitude coordinate. |  [optional] |
|**postalCode** | **String** | Postal code. Normalized to all capital letters when applicable. |  [optional] |
|**phoneIntCode** | **String** | International dialing code. |  [optional] |
|**region** | **String** | Name of the region, province, or state. Normalized as \&quot;Title Case\&quot;. |  [optional] |
|**timezone** | **String** | Timezone in IANA format. |  [optional] |



