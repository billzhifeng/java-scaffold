package com.github.scaffold.facade.resp;

import java.io.Serializable;

import com.github.java.common.base.BaseResp;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangzhifeng
 * @date 2018年5月27日 下午7:48:11
 */
@Setter
@Getter
public class SayHiResp extends BaseResp<String> implements Serializable {

    private static final long serialVersionUID = 4954430213991935295L;

    public String             msg;

}
