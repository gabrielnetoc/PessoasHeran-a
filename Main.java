/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0479
 */
public class Horista extends Funcionario{ 

    public Horista(String matricula, String cargo, String setor, int salarioHoraExtra, String nome, String cpf, String datanascimento) {
        super(matricula, cargo, setor, salarioHoraExtra, nome, cpf, datanascimento);
        
    }
        
   
   
        
    
    
   
        
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0479
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        
   
        Assalariado a = new Assalariado("21365", "Programador", "Desenvolvimento Mobiel", 3251.00, 48, 4, "Gabrel", "236524959", "07/01/1998");
        
        System.out.println("Salário:  "+a.getSalarioHoraExtra());
        
    }
    
}

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0479
 */
public class Assalariado extends Funcionario {

    public Assalariado(String matricula, String cargo, String setor, double salarioFixo, int horasSemana, double horaExtra, String nome, String cpf, String datanascimento) {
        super(matricula, cargo, setor, salarioFixo, horasSemana, horaExtra, nome, cpf, datanascimento);
    }

   
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0479
 */
public class Funcionario extends Pessoa {
    
    //Atributos
    
    private String matricula;
    private String cargo;
    private String setor;
    private double salarioFixo;
    private int horasSemana;
    private double horaExtra;
    private double salarioHoraExtra;
    private int qdtHora;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getSalarioHoraExtra() {
        return salarioHoraExtra;
    }

    public void setSalarioHoraExtra(double salarioHoraExtra) {
        this.salarioHoraExtra = salarioHoraExtra;
    }

    public int getQdtHora() {
        return qdtHora;
    }

    public void setQdtHora(int qdtHora) {
        this.qdtHora = qdtHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    private double valorHora= 44.5;
    
    //Getters e Setters

 
    
    
    //Construtor Horista 

    public Funcionario(String matricula, String cargo, String setor, int salarioHoraExtra, String nome, String cpf, String datanascimento) {
        super(nome, cpf, datanascimento);
        this.matricula = matricula;
        this.cargo = cargo;
        this.setor = setor;
        this.salarioHoraExtra = salarioHoraExtra;
    }
    
    //Construtor Asslariado

    public Funcionario(String matricula, String cargo, String setor, double salarioFixo, int horasSemana, double horaExtra,  String nome, String cpf, String datanascimento) {
        super(nome, cpf, datanascimento);
        this.matricula = matricula;
        this.cargo = cargo;
        this.setor = setor;
        this.salarioFixo = salarioFixo;
        this.horasSemana = horasSemana;
        this.horaExtra = horaExtra;
       
    }

    

  
    public void CalculaHoraExtra(){
        
        double valorHoraExtra = (valorHora + (valorHora*0.5));
        this.salarioHoraExtra = valorHoraExtra*this.horaExtra;
        System.out.println("Salário c/ HoraExtra: "+this.salarioHoraExtra);
    }
    public double CalculaSalario(){
        return this.salarioFixo+this.salarioHoraExtra;
    }
    
}
