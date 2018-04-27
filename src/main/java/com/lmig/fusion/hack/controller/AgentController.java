package com.lmig.fusion.hack.controller;

import com.lmig.fusion.hack.model.Agent;
import com.lmig.fusion.hack.model.ClassCode;
import com.lmig.fusion.hack.model.State;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RestController
public class AgentController {

    @GetMapping("/agents")
    public ResponseEntity<List<String>> getAgents() {
        List<String> agents = Arrays.asList("16158086", "16158034", "2232345", "2332345", "7232345", "9232345", "2232345", "1232345");
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

    @GetMapping("/agent/{NIPRId}")
    public ResponseEntity<Agent> getAgent(@PathParam("NIPRId") String niprId) {

        Agent agent = Agent.builder().niprId("16158086").states(
                Arrays.asList(State.builder().name("IN").amount(3).build(), State.builder().name("MA").amount(8).build()))
                .classCodes(Arrays.asList(ClassCode.builder().classCd("23232").classCdDesc("Beautician - independent operator").amount(3).build(),
                        ClassCode.builder().classCd("89999").classCdDesc("Countertop installation - ceramic, stone, laminate, etc. Also contemplates file flooring").amount(3).build()))
                .totalAgentPremium(4000.45)
                .totalWrittenPremium(20000.00)
                .totalAgentCommission(500.00)
                .totalWrittenCommission(5000.00)
                .averageAgentCommission(200.00)
                .averageAgentExposure(2.3)
                .averageWrittenCommission(203.00)
                .averageWrittenExposure(2.1)
                .build();

        return new ResponseEntity<> (agent, HttpStatus.OK);
    }
}
