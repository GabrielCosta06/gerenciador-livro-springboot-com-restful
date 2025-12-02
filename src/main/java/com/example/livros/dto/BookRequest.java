package com.example.livros.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

public class BookRequest {
    @Schema(description = "Titulo do livro", example = "Clean Code")
    @NotBlank @Size(max = 200)
    private String titulo;

    @Schema(description = "Autor do livro", example = "Robert C. Martin")
    @NotBlank @Size(max = 120)
    private String autor;

    @Schema(description = "Ano de publicacao (formato YYYY)", example = "2009")
    @Positive @Max(2100)
    private Integer anoPublicacao;

    @Schema(description = "Codigo ISBN que identifica o livro", example = "9780132350884")
    @NotBlank @Size(max = 20)
    private String isbn;

    public BookRequest() {}

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public Integer getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
