package br.com.eaugusto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Aug 6, 2025
 */
@Entity
@Table(name = "tb_client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
	@SequenceGenerator(name = "client_seq", sequenceName = "sq_client", initialValue = 1, allocationSize = 1)
	private long id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "cpf", nullable = false, length = 14, unique = true)
	private String cpf;

	@Column(name = "telephoneNumber", nullable = false)
	private String telephoneNumber;

	@Column(name = "email", nullable = false, length = 50)
	private String email;

	@Column(name = "address", nullable = false, length = 100)
	private String address;

	@Column(name = "addressNumber", nullable = false)
	private String addressNumber;

	@Column(name = "city", nullable = false, length = 100)
	private String city;

	@Column(name = "state", nullable = false, length = 50)
	private String state;
}
