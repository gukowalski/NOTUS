package com.pfc.notus.Disciplina.dto;

import java.time.LocalDateTime;

public record DisciplinaDTO(String title, String description, LocalDateTime dueDate) {
}
