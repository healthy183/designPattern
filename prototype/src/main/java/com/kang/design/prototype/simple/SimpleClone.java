package com.kang.design.prototype.simple;

import com.google.common.base.Throwables;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
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
class Jim{
    private Integer id;
}
@Data
@Slf4j
@ToString
@AllArgsConstructor
public class SimpleClone implements Cloneable {
    private Jim jim;
    private String value;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        SimpleClone simpleClone  = new SimpleClone(new Jim(1),"Tom");
        try {
            SimpleClone cloneObject = (SimpleClone) simpleClone.clone();
            log.info("simpleClone toString [{}]",simpleClone);
            log.info("cloneObject toString [{}]",cloneObject);
            log.info("memory address:{}",cloneObject == simpleClone);//false
            log.info(" jim memory address:{}",cloneObject.getJim() == simpleClone.getJim());//true
            cloneObject.setValue("abc");
            log.info("simpleClone value is {}",simpleClone.getValue());//different
            cloneObject.getJim().setId(2);
            log.info("simpleClone jim id is {}",simpleClone.getJim().getId());//same
        } catch (CloneNotSupportedException e) {
           log.info(Throwables.getStackTraceAsString(e));
        }
    }
}
