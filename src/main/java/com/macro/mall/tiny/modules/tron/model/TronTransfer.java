package com.macro.mall.tiny.modules.tron.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author macro
 * @since 2020-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tron_transfer")
@ApiModel(value="TronTransfer对象", description="")
public class TronTransfer implements Serializable {

    private static final long serialVersionUID=1L;

    private String transactionId;

    private String fromAddress;

    private String toAddress;

    private Long quant;

    private String contractAddress;

    @TableField("tokenId")
    private String tokenId;

    @TableField("tokenAbbr")
    private String tokenAbbr;

    private Date blockTs;

    private Integer block;


}
