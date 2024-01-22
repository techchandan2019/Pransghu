package com.neosoft.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.request.TrialRequest;
import com.neosoft.request.changeDestination.ChangeDestinationRequest;
import com.neosoft.request.delivery.DeliveryRequest;
import com.neosoft.response.delivery.GeneralResponse;
import com.neosoft.response.trailer.TrialResponse;

@RestController
public class TestController {
	
	@PostMapping("/shipment/trailer-summary")
	public ResponseEntity<TrialResponse> getTrialInfo(@RequestBody TrialRequest req){
		
		return new ResponseEntity(null,HttpStatus.OK);
	}
	@PostMapping("/shipment/delivery-creation")
	public ResponseEntity<GeneralResponse> createDelivery(@RequestBody DeliveryRequest req){
		
		return new ResponseEntity(null,HttpStatus.OK);
	}
	@PostMapping("/shipment/change-destination")
	public ResponseEntity<GeneralResponse> changeDestination(@RequestBody ChangeDestinationRequest req){
		
		return new ResponseEntity(null,HttpStatus.OK);
	}

}
