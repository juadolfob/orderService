package com.kit.clientService.model.dao;

import com.kit.serviceSDK.model.dao.BaseEntityDAO;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class ClientDAO extends BaseEntityDAO<ClientDAO> {
    private String fullName;
    private String phoneNumber;
    private String address;

    @Override
    public void update(ClientDAO clientDAO) {
        setFullName(clientDAO.getFullName());
        setPhoneNumber(clientDAO.getPhoneNumber());
        setAddress(clientDAO.getAddress());
    }
}