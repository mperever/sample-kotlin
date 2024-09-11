package com.maia.simplespringkafkastreamkotlin.api.dto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class LeveragePriceDTOTests {

    @Test
    fun simpleTest() {
        val dto = LeveragePriceDTO("symbol", BigDecimal.ZERO)
        assertEquals(dto.leverage, BigDecimal.TEN)
    }
}