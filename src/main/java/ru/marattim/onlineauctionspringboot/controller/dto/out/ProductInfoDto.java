package ru.marattim.onlineauctionspringboot.controller.dto.out;

import java.math.BigDecimal;
import java.time.Instant;

public record ProductInfoDto(long id,
                             long userId,
                             String title,
                             String description,
                             BigDecimal currentCost,
                             BigDecimal minStep,
                             Instant auctionEndDate) {
}
