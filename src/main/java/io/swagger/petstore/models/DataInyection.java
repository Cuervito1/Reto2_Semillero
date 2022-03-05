package io.swagger.petstore.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker = new Faker(new Locale("en-US"));

    private String urlStorePost,urlStoreGetDelete7, urlStoreGetDelete9,
            urlpostUser, urlgetUser, urldeleteUser, urlpostPet, urlgetPet, urldeletePet;
    private String bodypostPet, bodygetPet, bodydeletePet, bodypostUSer, bodygetUser, bodydeleteUser,
            bodyOrder9,bodyOrder7, headers;
    private final int STATUSCODE;


    //url de consumos: https://petstore.swagger.io/#/
    public DataInyection() {
        this.urlStorePost = "https://petstore.swagger.io/v2/store/order";
        this.urlStoreGetDelete7 = "https://petstore.swagger.io/v2/store/order/7";
        this.urlStoreGetDelete9 = "https://petstore.swagger.io/v2/store/order/9";

        this.urlpostUser = "https://petstore.swagger.io/v2/user/createWithArray";
        this.urlgetUser = "https://petstore.swagger.io/v2/user/logout";
        this.urldeleteUser = "https://petstore.swagger.io/v2/user/doggie";

        this.urlpostPet = "https://petstore.swagger.io/v2/pet";
        this.urlgetPet = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";
        this.urldeletePet = "https://petstore.swagger.io/v2/pet/0";

        this.headers = "application/json";

        this.bodyOrder9 = "{\n" +
                "  \"id\": 9,\n" +
                "  \"petId\": 9,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";
        this.bodyOrder7= "{\n" +
                "  \"id\": 4,\n" +
                "  \"petId\": 4,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";
        this.bodypostUSer="{\n" +
                "    \"id\": 0,\n" +
                "    \"username\": \"string\",\n" +
                "    \"firstName\": \"string\",\n" +
                "    \"lastName\": \"string\",\n" +
                "    \"email\": \"string\",\n" +
                "    \"password\": \"string\",\n" +
                "    \"phone\": \"string\",\n" +
                "    \"userStatus\": 0\n" +
                "  }";
        this.bodypostPet = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\":\n" +
                "  \"id\": 0,\n" +
                "  \"name\": \"string\",\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [ \"string\",\n" +
                "  \"tags\":,[ \n" +
                "{\n" +
                "  \"id\":0,\n" +
                "  \"name\":\"string\",\n" +
                "  \"status\":\"available\",\n" +
               "}";
        this.STATUSCODE = 200;
    }

    public String getUrlStorePost() {
        return urlStorePost;
    }

    public String getUrlpostUser() {
        return urlpostUser;
    }

    public String getUrlgetUser() {
        return urlgetUser;
    }

    public String getUrldeleteUser() {
        return urldeleteUser;
    }

    public String getUrlpostPet() {
        return urlpostPet;
    }

    public String getUrlgetPet() {
        return urlgetPet;
    }

    public String getUrldeletePet() {
        return urldeletePet;
    }

    public String getBodypostPet() {
        return bodypostPet;
    }

    public String getBodygetPet() {
        return bodygetPet;
    }

    public String getBodydeletePet() {
        return bodydeletePet;
    }

    public String getBodypostUSer() {
        return bodypostUSer;
    }

    public String getBodygetUser() {
        return bodygetUser;
    }
    public String getBodydeleteUser() {
        return bodydeleteUser;
    }

    public String getUrlStoreGetDelete7() {
        return urlStoreGetDelete7;
    }
    public String getUrlStoreGetDelete9() {
        return urlStoreGetDelete9;
    }
    public String getBodyOrder9() {
        return bodyOrder9;
    }
    public String getBodyOrder7() {
        return bodyOrder7;
    }
    public String getHeaders() {
        return headers;
    }
    public int getSTATUSCODE() {
        return STATUSCODE;
    }
}
