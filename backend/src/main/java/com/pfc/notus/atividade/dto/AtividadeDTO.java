package com.pfc.notus.atividade.dto;

import jakarta.validation.constraints.NotBlank;

public record AtividadeDTO(@NotBlank String title, @NotBlank  String content, @NotBlank String status) {
}
