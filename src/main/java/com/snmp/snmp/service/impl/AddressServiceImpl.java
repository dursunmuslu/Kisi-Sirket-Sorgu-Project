package com.snmp.snmp.service.impl;

import com.snmp.snmp.dto.AddressDto;
import com.snmp.snmp.entity.Address;
import com.snmp.snmp.repository.AddressRepository;
import com.snmp.snmp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public AddressDto save(AddressDto addressDto) {
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        address.setNumber(addressDto.getNumber());
        address.setStreet(addressDto.getStreet());
        address.setPostalCode(addressDto.getPostalCode());

        Address savedAddress = addressRepository.save(address);

        return new AddressDto(
                savedAddress.getStreet(),
                savedAddress.getCity(),
                savedAddress.getPostalCode(),
                savedAddress.getCountry(),
                savedAddress.getNumber()
        );
    }
}
