package br.com.fiap.challenge.gateways.repository;

import br.com.fiap.challenge.domains.Sinistro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinistroRepository extends JpaRepository<Sinistro, String> {
}
