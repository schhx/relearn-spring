package org.schhx.relearnspring.beans;

import org.springframework.stereotype.Repository;

/**
 * @author shanchao
 * @date 2019-12-07
 */
@Repository
public class UserDao {

    public void save() {
        System.out.println("save user");
    }
}
