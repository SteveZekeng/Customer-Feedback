package com.ubagroup.Api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.ubagroup.Api.entities.Service;
import com.ubagroup.Api.repositories.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceServ {
	
	private final ServiceRepository serviceRepository;
	
	@Autowired
    public ServiceServ(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
	
	public Service saveService(Service service) {
        return serviceRepository.save(service);
    }
	
	public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
	
	public Optional<Service> getServiceById(Long id) {
        return serviceRepository.findById(id);
    }
	
	public Service updateService(Long id, Service updatedservice) {
        Optional<Service> existingservice = serviceRepository.findById(id);
        if (existingservice.isPresent()) {
            Service service = existingservice.get();
            service.setNomService(updatedservice.getNomService());
            
            return serviceRepository.save(service);
        } else {
            throw new RuntimeException("Service not found");
        }
    }
	
	public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

	

}
