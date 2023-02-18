package com.management.usermanagementsystem.dao;

import com.management.usermanagementsystem.model.Usermanagementmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagementRepository extends JpaRepository<Usermanagementmodel, Integer> {


}
