package main

import (
	"fmt"
	"time"
)
import cloudevents "github.com/cloudevents/sdk-go/v2"

func main() {
	fmt.Println("hello")
	event := cloudevents.NewEvent()
	event.SetID("Idempotency-Id-01")
	event.SetSource("hubble.io/Invoice")
	event.SetType("hubble.io/GeneratePdfCommand")
	event.SetTime(time.Now())
	event.SetSubject("CN-Subject")
	event.SetData(cloudevents.ApplicationJSON, map[string]interface{}{
		"id":      1,
		"message": "Hello, World!",
	})
	event.SetDataContentType("")
	fmt.Println(event)
}
