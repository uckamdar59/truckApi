package com.TruckApi.TruckApi.Model;

import java.util.UUID;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.TruckApi.TruckApi.Model.TruckRequest.TruckType;
//import com.TruckApi.TruckApi.Model.TruckRequest.Tyres;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckCreateResponse {
	
	private String status;
	private String transporterId;
	private String truckId;
	
	private String truckNo;

	private Boolean truckApproved;
	private String imei;
	private long passingWeight;
	private String driverId;
	private Integer tyres;

	private Long truckLength;
	
	
	private TruckType truckType;
	
}
