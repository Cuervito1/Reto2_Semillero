package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class PetStepDefinition {

    @Steps
    PetstoreSteps usuariopet = new PetstoreSteps();

    @When("^cuando quiero crear un usuario$")
    public void cuandoQuieroCrearUnUsuario() {

        usuariopet.crearUserPet();
        usuariopet.consultarUserPet();
        usuariopet.eliminarUserPet();
    }


    @Then("^selecciono el servicio de pet$")
    public void seleccionoElServicioDePet() {

    }
}
