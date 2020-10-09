package Negocio;

import javax.persistence.*;

@Entity
@Table(name = "participante")
public abstract class Participante {
    @Id
    @Column(name = "id_participante")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id_participante;
    @Column(name = "nombre")
    protected String nombre;
    @Column(name = "email")
    protected String email;

    public Participante() {}

    protected Participante(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public int getId_participante() {
        return id_participante;
    }

    public void setId_participante(int id_participante) {
        this.id_participante = id_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
