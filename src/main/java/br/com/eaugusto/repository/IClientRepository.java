package br.com.eaugusto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.eaugusto.domain.Client;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Aug 6, 2025
 */
public interface IClientRepository extends CrudRepository<Client, Long> {

}
