package types

type RegisteredCapability struct {
	ID          string `json:"id"`
	Urn         string `json:"urn"`
	Description string `json:"description"`
}

type RegisteredProvider struct {
	ID           string `json:"id"`
	Urn          string `json:"Urn"`
	CapabilityId string `json:"capability_id"`
	Description  string `json:"description"`
}

type Ownership struct {
	CapabilityID string `json:"capability_id"`
	MerchantID   string `json:"merchant_id"`
	Description  string `json:"description"`
}

var RegisteredCapabilitiesData = []RegisteredCapability{
	RegisteredCapability{
		ID:          "0001",
		Urn:         "hubble.io/invoice/InvoiceNumberGeneration",
		Description: "Invoice Number Generation",
	},
	RegisteredCapability{
		ID:          "0002",
		Urn:         "hubble.io/invoice/PDFGeneration",
		Description: "Invoice PDF Generation",
	},
}

var RegisteredProviderData = []RegisteredProvider{
	{"PROVIDER-001", "hubble.io/providers/providers/provider001", "0001", "Registered Provider Data"},
	{"PROVIDER-001", "hubble.io/providers/providers/provider001", "0002", "Registered Provider Data"},
	{"PROVIDER-002", "hubble.io/providers/providers/provider002", "0001", "Registered Provider Data"},
	{"PROVIDER-002", "hubble.io/providers/providers/provider002", "0002", "Registered Provider Data"},
}
