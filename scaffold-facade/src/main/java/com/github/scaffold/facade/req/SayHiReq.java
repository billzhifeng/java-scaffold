package com.github.scaffold.facade.req;

import java.io.Serializable;

import com.github.java.common.base.BaseReq;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangzhifeng
 * @date 2018年5月27日 下午7:43:52
 */
@Setter
@Getter
public class SayHiReq extends BaseReq implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6433282525059920494L;

    private String            name             = "scaffold";
}
