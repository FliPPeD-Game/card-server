package com.card.game.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("skill_costs")
public class SkillCostEntity extends BaseEntity {
    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("数量")
    private Integer costNum;

    @ApiModelProperty("类型")
    private Integer costType;


    @ApiModelProperty("技能id")
    private Long SkillId;

    @ApiModelProperty("图片路径")
    private String icon;

}
