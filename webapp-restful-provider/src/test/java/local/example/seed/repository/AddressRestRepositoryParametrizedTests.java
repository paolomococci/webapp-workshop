/**
 *
 * Copyright 2020 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.seed.repository;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;
import java.util.stream.Stream;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddressRestRepositoryParametrizedTests {

    @Autowired
    MockMvc mockMvc;

    private static String ADDRESS_TEST_STRING =
            "{\"country\":\"Italy\",\"city\":\"Rome\",\"street\":\"some\",\"civic\":\"123\",\"code\":\"054321\"}";
    private static URI uri;

    @Test
    @Order(1)
    @Disabled
    void createTest() throws Exception {
        // TODO
    }

    @Disabled
    @Order(2)
    @ParameterizedTest
    @MethodSource("initUri")
    void readTest() throws Exception {
        // TODO
    }

    @Disabled
    @Order(3)
    @ParameterizedTest
    @MethodSource("initUri")
    void readAllTest() throws Exception {
        // TODO
    }

    @Disabled
    @Order(4)
    @ParameterizedTest
    @MethodSource("initUri")
    void updateTest() throws Exception {
        // TODO
    }

    @Disabled
    @Order(5)
    @ParameterizedTest
    @MethodSource("initUri")
    void partialUpdateTest() throws Exception {
        // TODO
    }

    @Disabled
    @Order(6)
    @ParameterizedTest
    @MethodSource("initUri")
    void deleteTest() throws Exception {}

    public static void setUri(URI uri) {
        AddressRestRepositoryParametrizedTests.uri = uri;
    }

    public static URI getUri() {
        return uri;
    }

    private static Stream<String> initUri() {
        return Stream.of(
                AddressRestRepositoryParametrizedTests.getUri().getPath()
        );
    }
}
