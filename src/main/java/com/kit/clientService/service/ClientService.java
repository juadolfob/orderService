package com.kit.clientService.service;

import com.kit.clientService.mapper.ClientMapper;
import com.kit.clientService.model.dao.ClientDAO;
import com.kit.clientService.model.dto.ClientDTO;
import com.kit.clientService.repository.ClientRepository;
import com.kit.serviceSDK.service.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService extends
        BaseEntityService<
                ClientDTO,
                ClientDAO,
                UUID,
                ClientRepository,
                ClientMapper
                > {

}