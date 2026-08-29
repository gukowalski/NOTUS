package com.pfc.notus.Entrega.dto;

import java.time.LocalDateTime;

public record EntregaDTO(LocalDateTime submissionDate, String content, String status) {
}
