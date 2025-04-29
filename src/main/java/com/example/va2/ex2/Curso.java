package com.example.va2.ex2;

public class Curso {
    private String curso;
    private int cargaHorario;

    public Curso(String curso, int cargaHorario){
        this.curso = curso;
        this.cargaHorario = cargaHorario;
    }

    public String getcurso(){
        return curso;
    }
    public int getcargaHorario(){
        return cargaHorario;
    }
    
    public void exibirDados(){
        System.out.println("Escolheu o curso de " + getcurso() + " com carga horario de " + getcargaHorario());
    }
}
