package com.macro.mall.tiny.modules.tron.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.tron.model.TronTransfer;
import com.macro.mall.tiny.modules.tron.service.TronTransferService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author macro
 * @since 2020-11-11
 */
@RestController
@RequestMapping("/tron/tronTransfer")
public class TronTransferController {

    @Autowired
    private TronTransferService tronTransferService;

    @ApiOperation("获取所有交易")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<TronTransfer>> listAll() {
        List<TronTransfer> roleList = tronTransferService.list();
        return CommonResult.success(roleList);
    }

}

