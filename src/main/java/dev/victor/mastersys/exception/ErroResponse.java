package dev.victor.mastersys.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ErroResponse(LocalDateTime timestamp, String erro, Integer status, List<String> mensagens) {

}
