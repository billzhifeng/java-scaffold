package com.github.scaffold.facade.api;

import com.github.java.common.base.BaseResp;
import com.github.scaffold.facade.req.SayHiReq;

/**
 * @author bill
 * @date 2018年5月27日 下午7:41:47
 */
public interface SayHiFacade {

    public BaseResp sayHi(SayHiReq req);
}
