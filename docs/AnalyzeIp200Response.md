

# AnalyzeIp200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddress** | **String** | The analyzed IP address. |  |
|**ipAddressNumber** | **Integer** | Numeric representation of the IP address. |  |
|**ipType** | **String** | Type of the IP address (IPv4 or IPv6). |  |
|**ipCidr** | **String** | CIDR notation of the IP address. |  |
|**connectionType** | **String** | The **connectionType** element provides information about the type of connection associated with a given IP address. Our system employs a **dynamic and evolving approach**, leveraging multiple data points to identify the connection type as accurately as possible.  - **wired**: A traditional wired connection (e.g., DSL, fiber, cable). - **mobile**: A mobile network connection (e.g., 4G, 5G). - **enterprise**: A connection from a known large business or corporate network. - **satellite**: A satellite internet connection. - **vpn**: A connection routed through a Virtual Private Network. - **cloud-provider**: A connection from a cloud hosting provider (e.g., AWS, Azure). - **open-proxy**: A connection using an open or public proxy. - **tor**: A connection routed through the Tor network.  |  |
|**hostReverse** | **String** | Real time reverse DNS lookup result for the IP address. |  |
|**geo** | [**Geo**](Geo.md) |  |  |
|**whois** | [**Whois**](Whois.md) |  |  |
|**trustedProvider** | [**TrustedProvider**](TrustedProvider.md) |  |  |
|**blocklisted** | [**BlockListed**](BlockListed.md) |  |  |
|**riskReport** | [**RiskReportIp**](RiskReportIp.md) |  |  |



