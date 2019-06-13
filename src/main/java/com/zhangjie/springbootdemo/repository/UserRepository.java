package com.zhangjie.springbootdemo.repository;

import com.zhangjie.springbootdemo.dataobject.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jason
 */
@Repository
public interface UserRepository extends JpaRepository<UserDO,String>{

}
