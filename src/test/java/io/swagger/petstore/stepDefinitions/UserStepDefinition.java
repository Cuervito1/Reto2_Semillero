package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinition {

    @Steps
    PetstoreSteps usuarioUser = new PetstoreSteps();

    @When("^cuando quiero crear un usuario con user$")
    public void cuandoQuieroCrearUnUsuarioConUser()  {
        usuarioUser.crearUserUser();
        usuarioUser.consultarUserUser();
        usuarioUser.eliminarUserUser();

    }


    @Then("^selecciono el servicio de user$")
    public void seleccionoElServicioDeUser(){

    }


}
