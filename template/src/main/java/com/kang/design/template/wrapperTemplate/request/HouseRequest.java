package com.kang.design.template.wrapperTemplate.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Healthy
 * @title
 * @description
 * @date 2017/6/20
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HouseRequest extends BaseRequest {

    private Integer houseId;

    private String houseName;

}
