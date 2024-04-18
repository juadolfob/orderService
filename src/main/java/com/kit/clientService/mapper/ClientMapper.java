package com.kit.clientService.mapper;

import com.kit.clientService.model.dao.ClientDAO;
import com.kit.clientService.model.dto.ClientDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.kit.serviceSDK.mapper.BaseEntityMapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends BaseEntityMapper<ClientDTO,ClientDAO> {

    ClientDAO toDAO(ClientDTO client);

    @InheritInverseConfiguration
    ClientDTO toDTO(ClientDAO clientDAO);
}