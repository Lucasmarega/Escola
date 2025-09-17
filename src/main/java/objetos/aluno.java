/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author lucas.gmpedro
 */
public class aluno {
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    
    public aluno (String nome, String email, String Tel, String dataNascimento){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    
    
  
    public String getNome() {
        return nome;
    }

    
    
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    
     
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    
            
    
    
    
            
    
}
}