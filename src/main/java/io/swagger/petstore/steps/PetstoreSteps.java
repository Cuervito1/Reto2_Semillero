package io.swagger.petstore.steps;

import io.restassured.RestAssured;
import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearOrden7() {
        SerenityRest.given().baseUri(dataInyection.getUrlStorePost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarOrden9() {
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarOrden7() {
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete7()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarOrden9() {
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void crearUserPet() {
        SerenityRest.given().baseUri(dataInyection.getUrlpostPet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodypostPet()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarUserPet() {
        SerenityRest.given().baseUri(dataInyection.getUrlgetPet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodygetPet()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarUserPet() {
        SerenityRest.given().baseUri(dataInyection.getUrldeletePet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodydeletePet()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }




    @Step
    public void crearUserUser() {
        SerenityRest.given().baseUri(dataInyection.getUrlpostUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodypostUSer()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarUserUser() {
        SerenityRest.given().baseUri(dataInyection.getUrlgetUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodygetUser()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarUserUser() {
        SerenityRest.given().baseUri(dataInyection.getUrldeleteUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodydeleteUser()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
}