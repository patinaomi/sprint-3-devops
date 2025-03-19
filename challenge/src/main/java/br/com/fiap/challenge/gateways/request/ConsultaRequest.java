package br.com.fiap.challenge.gateways.request;

import br.com.fiap.challenge.domains.Cliente;
import br.com.fiap.challenge.domains.Clinica;
import br.com.fiap.challenge.domains.Dentista;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;

@Data
public class ConsultaRequest extends RepresentationModel<ConsultaRequest> {

    @NotNull(message = "ID do Cliente não pode ser nulo")
    private String clienteId;

    @NotNull(message = "ID da Clínica não pode ser nulo")
    private String clinicaId;

    @NotNull(message = "ID do Dentista não pode ser nulo")
    private String dentistaId;

    @NotNull(message = "Tipo de serviço não pode ser nulo")
    private String tipoServico;

    @NotNull(message = "Data da consulta não pode ser nula")
    private LocalDate dataConsulta;

    private Character statusConsulta;

    @Size(max = 250, message = "As observações devem ter no máximo 250 caracteres")
    private String observacoes;

    @Size(max = 250, message = "Os sintomas devem ter no máximo 250 caracteres")
    private String sintomas;

    @Size(max = 250, message = "O tratamento recomendado deve ter no máximo 250 caracteres")
    private String tratamentoRecomendado;

    private Double custo;

    @Size(max = 250, message = "A prescrição deve ter no máximo 250 caracteres")
    private String prescricao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataRetorno;
}
