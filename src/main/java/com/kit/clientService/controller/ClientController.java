package com.kit.clientService.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kit.clientService.api.ClientApi;
import com.kit.clientService.mapper.ClientMapper;
import com.kit.clientService.model.dao.ClientDAO;
import com.kit.clientService.model.dto.ClientDTO;
import com.kit.clientService.repository.ClientRepository;
import com.kit.clientService.service.ClientService;
import com.kit.serviceSDK.controller.BaseEntityController;
import com.kit.serviceSDK.model.dao.BaseEntityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kit.serviceSDK.utils.ServletUriUtil;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@RestController
public class ClientController
        extends BaseEntityController<
        ClientDTO,
        ClientDAO,
        UUID,
        ClientRepository,
        ClientMapper,
        ClientService
        >
        implements ClientApi {
}