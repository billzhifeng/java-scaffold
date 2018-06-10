package com.github.scaffold.facade.api;

import com.github.scaffold.facade.req.SayHiReq;
import com.github.scaffold.facade.resp.SayHiResp;

/**
 * @author wangzhifeng
 * @date 2018年5月27日 下午7:41:47
 */
public interface SayHiFacade {

    public SayHiResp sayHi(SayHiReq req);
}
