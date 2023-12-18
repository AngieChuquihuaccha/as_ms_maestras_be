/*package com.gestion.teenager;

import com.gestion.teenager.domain.model.Teenager;
import com.gestion.teenager.repository.TeenagerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import java.util.List;



@SpringBootTest
@AutoConfigureWebTestClient
class TeenagerApplicationTests {
    @Autowired
    TeenagerRepository teenagerRepository;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTeenager() {
        Teenager teenager = new Teenager(
                "testeoName",
                "testeoDirector",
                "testeoDirector",
                "DNI",
                "16574829",
                "913509167",
                "San Vicente",
                "A",
                "testeoprocej",
                "testeosoa");

        webTestClient.post()
                .uri("/ms-soa")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(teenager), Teenager.class)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(Teenager.class)
                .value(Teenager::getId, notNullValue())
                .value(Teenager::getName, equalTo("testeoName"))
                .value(Teenager::getFather_last_name, equalTo("testeoDirector"))
                .value(Teenager::getMother_last_name, equalTo("testeoDirector"))
                .value(Teenager::getDocument_type, equalTo("DNI"))
                .value(Teenager::getDocument_number, equalTo("16574829"))
                .value(Teenager::getCellphone, equalTo("913509167"))
                .value(Teenager::getAddress, equalTo("San Vicente"))
                .value(Teenager::getActive, equalTo("A"))
                .value(Teenager::getType_pronacej, equalTo("testeopronacej"))
                .value(Teenager::getType_soa, equalTo("testeosoa"));

    }

    @Test
    public void testListTeenager() {
        webTestClient.get().uri("/ms-soa/listData")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Teenager.class)
                .consumeWith(response -> {
                    List<Teenager> dataList = response.getResponseBody();
                    Assertions.assertTrue(dataList != null && !dataList.isEmpty(), "La lista no debe de estar vacía: ");
                    Assertions.assertFalse(false, "La lista debe contener al menos " + 1 + " elementos");
                    System.out.println(dataList);
                });


    }

    @Test
    public void testListInactiveLegalGuardian() {
        webTestClient.get().uri("/ms-soa/listData/inactive")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Teenager.class)
                .consumeWith(response -> {
                    List<Teenager> dataList = response.getResponseBody();
                    Assertions.assertTrue(dataList != null && !dataList.isEmpty(), "La lista no debe de estar vacía: ");
                    Assertions.assertTrue(true, "La lista debe contener al menos " + 1 + " elementos");
                    System.out.println(dataList);
                });

    }

    @Test
    public void testListActiveLegalGuardian() {
        webTestClient.get().uri("/ms-soa/listData/active")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Teenager.class)
                .consumeWith(response -> {
                    List<Teenager> dataList = response.getResponseBody();
                    Assertions.assertTrue(dataList != null && !dataList.isEmpty(), "La lista no debe de estar vacía: ");
                    Assertions.assertTrue(true, "La lista debe contener al menos " + 1 + " elementos");
                    System.out.println(dataList);
                });

    }

    @ParameterizedTest
    @ValueSource(ints = {2})
    public void testUpdateTeenger(int dataId) {
        Teenager UpdateTeenager = new Teenager(
                "testeoNameUpdate",
                "testeoDirectorUpdate",
                "testeoDirector",
                "DNI",
                "16574829",
                "913509167",
                "San Vicente Update",
                "A",
                "testeoprocejUpdate",
                "testeosoauUpdate");

        webTestClient.put().uri("/ms-soa/{id}", dataId)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(UpdateTeenager)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Teenager.class)
                .consumeWith(response -> {
                });
    }
}
*/