package org.dubbo.provider;

import org.dubbo.api.Login;

public class LoginImpl implements Login {
    public boolean login(String userName,String password){
        return true;
    }

}
