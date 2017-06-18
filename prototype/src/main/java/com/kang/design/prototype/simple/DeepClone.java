package com.kang.design.prototype.simple;

import com.google.common.base.Throwables;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/16.
 * @Author Healthy
 * @Version
 */
@AllArgsConstructor
@Data
class Tom implements Cloneable{
    private String name;
}

@AllArgsConstructor
@Data
@Slf4j
public class DeepClone implements Cloneable {
    private Tom tom;
    @Override
    protected Object clone() {
        DeepClone cloneObject = null;
        try {
            cloneObject = (DeepClone) super.clone();
            cloneObject.setTom(new Tom("hh"));
        } catch (CloneNotSupportedException e) {
            log.info(Throwables.getStackTraceAsString(e));
        }
        return cloneObject;
    }

    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone(new Tom("abc"));
        DeepClone cloneObject = (DeepClone) deepClone.clone();
        log.info("menony address:{}",deepClone.getTom() == cloneObject.getTom());
    }
}
