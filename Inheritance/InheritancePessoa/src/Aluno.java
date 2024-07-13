public class Aluno extends Pessoa{

    private int mat;
    private String curso;


    public void cancelarmat(){
        System.out.println("matricula será cancelada");
    }


    public int getmat() {
        return mat;
    }


    public void setmat(int mat) {
        this.mat = mat;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    

}
