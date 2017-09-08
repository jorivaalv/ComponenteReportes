package com.macroproyectos.reportes.cucumber.stepdefs;

import com.macroproyectos.reportes.ComponenteReportesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ComponenteReportesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
