public class Tecnico extends Pessoa{
private boolean registroProfissional;

public void praticar(){
    this.registroProfissional = true;
}

public boolean isRegistroProfissional() {
    return registroProfissional;
}

public void setRegistroProfissional(boolean registroProfissional) {
    this.registroProfissional = registroProfissional;
}


}
