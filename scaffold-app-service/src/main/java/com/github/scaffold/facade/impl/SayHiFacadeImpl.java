package com.github.scaffold.facade.impl;

import com.github.scaffold.facade.api.SayHiFacade;
import com.github.scaffold.facade.req.SayHiReq;
import com.github.scaffold.facade.resp.SayHiResp;

/**
 * 样例
 * 
 * @author wangzhifeng
 * @date 2018年5月27日 下午9:44:26
 */
public class SayHiFacadeImpl implements SayHiFacade {

    @Override
    public SayHiResp sayHi(SayHiReq req) {
        SayHiResp resp = SayHiResp.buildSuccessResp(SayHiResp.class);
        resp.setMsg("HI " + req.getName());
        return resp;
    }

}
