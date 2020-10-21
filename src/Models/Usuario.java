
package Models;


public class Usuario {
        private int id=0;
        private String login;
        private String senha;
        private String nome;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean isUser(){
        if(this.nome == null || this.id == 0){
            return false;
        }else{
            return true;
        }
        
    }
        
        
}
