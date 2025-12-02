package com.example.livros.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class BookResponse {
    @Schema(description = "Identificador unico do livro", example = "1")
    private Long id;

    @Schema(description = "Titulo do livro", example = "Clean Code")
    private String titulo;

    @Schema(description = "Autor do livro", example = "Robert C. Martin")
    private String autor;

    @Schema(description = "Ano de publicacao (formato YYYY)", example = "2009")
    private Integer anoPublicacao;

    @Schema(description = "Codigo ISBN que identifica o livro", example = "9780132350884")
    private String isbn;

    public BookResponse() {}

    public BookResponse(Long id, String titulo, String autor, Integer anoPublicacao, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Integer getAnoPublicacao() { return anoPublicacao; }
    public String getIsbn() { return isbn; }

    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
