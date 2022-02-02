package types

type RegisteredCapabilities []struct {
	ID  string `json:"id"`
	Urn string `json:"urn"`
}

type RegisteredProviders []struct {
	ID           string `json:"id"`
	Urn          string `json:"Urn"`
	CapabilityId string `json:"capability_id"`
}

type Ownership []struct {
	CapabilityID string `json:"capability_id"`
	MerchantID   string `json:"merchant_id"`
}
