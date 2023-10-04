package ru.marattim.onlineauctionspringboot.controller.dto.in;

import java.math.BigDecimal;
import java.time.Instant;

public record ProductInfoDto(String title,
                             String description,
                             BigDecimal initialCost,
                             BigDecimal minStep,
                             Instant auctionEndDate) {
}
