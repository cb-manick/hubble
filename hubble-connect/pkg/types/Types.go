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
		ID:  "0001",
		Urn: "hubble.io/invoice/InvoiceNumberGeneration",
		Description: "Invoice Number Generation",
	},
	RegisteredCapability{
		ID:  "0002",
		Urn: "hubble.io/invoice/PDFGeneration",
		Description: "Invoice PDF Generation",
	},
}
