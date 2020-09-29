package supermercadopro;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Juan Pablo
 */
@DatabaseTable
public class Empleado {
    @DatabaseField
    private String nombre;
    @DatabaseField (id = true)
    private long cedula;
    @DatabaseField
    private String correo;
    @DatabaseField
    private String departamento;
    @DatabaseField
    private String cargo;
    @DatabaseField
    private long salario;
    @DatabaseField
    private String password;
    
    public Empleado (){
    }
    
    public Empleado(String nombre, long cedula, String correo, String departamento,
            String cargo, long salario, String password){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.password = password;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
