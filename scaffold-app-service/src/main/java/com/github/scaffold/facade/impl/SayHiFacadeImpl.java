package com.github.scaffold.facade.impl;

import com.github.java.common.base.BaseResp;
import com.github.scaffold.facade.api.SayHiFacade;
import com.github.scaffold.facade.req.SayHiReq;

/**
 * 样例
 * 
 * @author bill
 * @date 2018年5月27日 下午9:44:26
 */
public class SayHiFacadeImpl implements SayHiFacade {

    @Override
    public BaseResp sayHi(SayHiReq req) {
    	BaseResp resp = BaseResp.buildSuccessResp(BaseResp.class);
        resp.setData("HI " + req.getName());
        return resp;
    }

}
