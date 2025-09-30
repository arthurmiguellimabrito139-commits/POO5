public class Cliente {
   private String nome;
   private String email;
    
     public Cliente(String nome, String email) {
         this.email = email;
         this.nome = nome;
     }
     
     public void setNome() {
        this.nome = nome; 
    }

    public void setPreco() {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: " + this.getEmail());
    }

}
