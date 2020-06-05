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
