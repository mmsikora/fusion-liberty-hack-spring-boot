package com.lmig.fusion.hack.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Agent {

    private String niprId;
    private List<State> states;
    private List<ClassCode> classCodes;

    private Double totalAgentPremium;
    private Double totalWrittenPremium;

    private Double totalAgentCommission;
    private Double totalWrittenCommission;

    private Double averageAgentCommission;
    private Double averageWrittenCommission;

    private Double averageAgentExposure;
    private Double averageWrittenExposure;

}
