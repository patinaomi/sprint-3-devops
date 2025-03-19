package br.com.fiap.challenge.gateways.repository;

import br.com.fiap.challenge.domains.FormularioDetalhado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioDetalhadoRepository extends JpaRepository<FormularioDetalhado, String> {
}
