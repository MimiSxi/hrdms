package com.hrdms.common.core.exception.file;

import com.hrdms.common.core.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author hrdms
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args, String msg)
    {
        super("file", code, args, msg);
    }

}
