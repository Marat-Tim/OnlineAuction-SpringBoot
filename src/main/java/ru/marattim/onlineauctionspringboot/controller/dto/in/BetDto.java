package ru.marattim.onlineauctionspringboot.controller.dto.in;

import java.math.BigDecimal;

public record BetDto(long id, BigDecimal raise) {
}
