package com.lmig.fusion.hack.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClassCode {
    private String classCd;
    private String classCdDesc;
    private Integer amount;
}
