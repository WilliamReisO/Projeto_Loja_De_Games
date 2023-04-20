package com.generation.LojaDeGames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


	@Entity
	@Table(name = "tb_produto")
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotBlank(message = "O atributo Titulo Obrigatório!")
		@Size(min = 1, max = 50, message = "O atributo Titulo deve conter no mínimo 05 e no máximo 50 caracteres")
		private String titulo;

		@NotBlank(message = "O atributo Desenvolvedor é Obrigatório!")
		@Size(min = 1, max = 500, message = "O atributo texto deve conter no mínimo 05 e no máximo 50 caracteres")
		private String desenvolvedor; 
		
		@NotBlank(message = "O atributo Descriçao é Obrigatório!")
		@Size(min = 1, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		
		private BigDecimal valor ;
		
		
		
		@UpdateTimestamp
		private LocalDateTime data;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}


		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDesenvolvedor() {
			return desenvolvedor;
		}

		public void setDesenvolvedor(String desenvolvedor) {
			this.desenvolvedor = desenvolvedor;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		public LocalDateTime getData() {
			return data;
		}

		public void setData(LocalDateTime data) {
			this.data = data;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		

}
