package com.javaproject.Services;

import com.javaproject.Models.Item;
import com.javaproject.Models.Role;
import com.javaproject.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll(){
        List<Role> allRoles= roleRepository.findAll();
        return allRoles;
    }
}
