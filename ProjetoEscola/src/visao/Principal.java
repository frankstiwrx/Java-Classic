/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelos.Aluno;
import modelos.Notas;
import modelos.Turma;

        
/**
 *
 * @author frank
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Sistema Escolar.");
        
        
        String materiaGlobal = JOptionPane.showInputDialog(null, "Insira a Disciplina da Turma: ");
        int quantidadeAlunosGlobal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de alunos da Turma: "));
        double mediaBaseGlobal = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a média base da Turma: "));
        String codigoTurmaGlobal = JOptionPane.showInputDialog(null, "Insira o código da Turma: ");
        
        
        Turma turma1 = new Turma();
        
        turma1.setMateria(materiaGlobal);
        turma1.setQuantidadeAlunos(quantidadeAlunosGlobal);
        turma1.setMediaBase(mediaBaseGlobal);
        turma1.setCodigoTurma(codigoTurmaGlobal);
        
        String nomeGlobal = JOptionPane.showInputDialog(null, "Insira o nome do Aluno: ");
        int idadeGlobal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do Aluno: "));
        String cpfGlobal = JOptionPane.showInputDialog(null, "Insira o CPF do Aluno: ");
        String codigoMatriculaGlobal = JOptionPane.showInputDialog(null, "Insira o código de matrícula do Aluno: ");
        Aluno aluno = new Aluno();
        aluno.setNome(nomeGlobal);
        aluno.setIdade(idadeGlobal);
        aluno.setCpf(cpfGlobal);
        aluno.setCodigoMatricula(codigoMatriculaGlobal);
        
        double nota1global = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a primeira nota do aluno: "));

        double nota2global = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a segunda nota do aluno: "));

        double nota3global = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a terceira nota do aluno: "));

        Notas nota = new Notas();
        nota.setNota1(nota1global);
        nota.setNota2(nota2global);
        nota.setNota3(nota3global);
        
       
        
        int auxiliar = 10;
        
        while(auxiliar!=0){
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Exibir Dados da Turma.\n2. Exibir Dados do Aluno.\n3. Exibir notas do Aluno\n4. Exibir Situação do Aluno.\n0. Sair"));
            if(auxiliar==1){
                JOptionPane.showMessageDialog(null,turma1);
            }
            else if(auxiliar==2){
                JOptionPane.showMessageDialog(null,aluno);
            }
            else if(auxiliar==3){
                JOptionPane.showMessageDialog(null,nota);
            }
            else if(auxiliar==4){
                
                
            }
            
            
        }
            
        }
        
        
        
        
        
        }

