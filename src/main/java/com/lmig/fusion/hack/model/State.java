package com.lmig.fusion.hack.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class State {
    private String name;
    private Integer amount;
}
