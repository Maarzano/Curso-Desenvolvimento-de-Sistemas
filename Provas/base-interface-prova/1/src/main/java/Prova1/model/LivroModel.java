package Prova1.model;

import java.time.LocalDate;

import Prova1.Enums.GeneroLivro;
import Prova1.Enums.StatusLivro;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livros")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;


    @ManyToOne
    @JoinColumn(name = "bibliotecario_id", referencedColumnName = "id")
    public BibliotecarioModel bibliotecarioResponsavel;

    @Column(name = "titulo", nullable = false)
    public String titulo;

    @Column(name = "autor", nullable = false)
    public String autor;

    @Column(name = "genero", nullable = false)
    @Enumerated(EnumType.STRING)
    public GeneroLivro genero;

    @Column( name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    public StatusLivro status = StatusLivro.DISPONIVEL;

    @Column(name = "data_cadastro", nullable = false)
    public LocalDate dataCadastro = LocalDate.now();
}
