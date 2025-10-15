package com.ubagroup.Api.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ubagroup.Api.entities.Service;
import com.ubagroup.Api.service.ServiceServ;

@RestController
@RequestMapping("/api/CustomerFeedback")
public class ServiceController {
	
	private final ServiceServ serviceService;
	
	@Autowired
    public ServiceController(ServiceServ serviceService) {
        this.serviceService = serviceService;
    }
	
	@PostMapping("/service")
    public ResponseEntity<Service> saveService(@RequestBody Service service) {
        Service newService = serviceService.saveService(service);
        return ResponseEntity.ok(newService);
    } 
	
	 @GetMapping("/services")
	    public List<Service> getAllServices() {
	        return serviceService.getAllServices();
	    }
	
	@GetMapping("/service/{id}")
    public ResponseEntity<Service> getServiceById(@PathVariable Long id) {
        Optional<Service> service = serviceService.getServiceById(id);
        return service.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	@PutMapping("/service/{id}")
    public ResponseEntity<Service> updateService(@PathVariable Long id, @RequestBody Service service) {
        Service updatedService = serviceService.updateService(id, service);
        return ResponseEntity.ok(updatedService);
    }
	
	@DeleteMapping("/services/{id}")
    public ResponseEntity<String> deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
        return ResponseEntity.ok("Service deleted successfully");
    }  
 

}
