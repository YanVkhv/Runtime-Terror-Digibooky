package com.mavenmasters.digibooky.domain.users.member;

import com.mavenmasters.digibooky.domain.exceptions.InvalidEmailAddressException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberTest {
    @Test
    void whenGivenCorrectInput_thenNewMemberIsCreated() {
        Assertions.assertDoesNotThrow(() -> new Member("123", "Lastname", new Email("test@test.test"), "First", "City"));
    }

    @Test
    void whenGivenWrongEmail_thenErrorIsThrown() {
        Assertions.assertThrows(InvalidEmailAddressException.class, () -> new Member("123", "Lastname", new Email("testtest.test"), "First", "City"));
    }


}