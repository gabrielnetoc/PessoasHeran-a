/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0479
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private String datanascimento;
    private String cidade;
    private String endereco;
    private int idade; 
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf, String datanascimento, String cidade, String endereco, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.cidade = cidade;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf, String datanascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
    }

    public Pessoa(String nome, String cpf, String datanascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.telefone = telefone;
    }
    

   
    
    
}
