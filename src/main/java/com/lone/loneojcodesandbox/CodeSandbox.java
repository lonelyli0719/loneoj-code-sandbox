package com.lone.loneojcodesandbox;


import com.lone.loneojcodesandbox.model.ExecuteCodeRequest;
import com.lone.loneojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
