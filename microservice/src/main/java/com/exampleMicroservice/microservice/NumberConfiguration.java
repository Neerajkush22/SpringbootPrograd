package com.exampleMicroservice.microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("maxminnumber")
public class NumberConfiguration {
    public NumberConfiguration() {
    }

    public float maxnum;
    public float minnum;

    public float getMaxnum() {
        return maxnum>=minnum?maxnum:minnum;
    }

    public void setMaxnum(float maxnum) {
        this.maxnum = maxnum;
    }

    public float getMinnum() {
        return (minnum<=maxnum?minnum:maxnum);
    }

    public void setMinnum(float minnum) {
        this.minnum = minnum;
    }

    public NumberConfiguration(float maxnum, float minnum)
    {
        this.maxnum=maxnum;
        this.minnum=minnum;
    }
}
