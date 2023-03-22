package com.spocktest.spocktestcontainer.test.service

import com.spocktest.spocktestcontainer.test.AbstractIntegrationContainerBaseTest

class DirectionServiceTest extends AbstractIntegrationContainerBaseTest {

    def '실행테스트'() {
        given:
        print("1")
        when:
        print("2")
        then:
        print("3")
    }
}
