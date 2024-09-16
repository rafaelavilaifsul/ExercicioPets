class Pet {
    // atributos
    private String nome;
    private String tipo;
    private int idade;
    private String nomeTutor;
    private String telefoneTutor;

    public Pet(String nome, String tipo, int idade, String nomeTutor, String telefoneTutor) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.nomeTutor = nomeTutor;
        this.telefoneTutor = telefoneTutor;
    }

    public String toString() {
        String s = "";
        s += "Pet: " + this.nome;
        s += ", " + this.tipo;
        s += ", " + this.idade + " anos.";
        s += " Dono/tutor: " + this.nomeTutor;
        s += ", " + this.telefoneTutor + ".";
        return s;
    }
}