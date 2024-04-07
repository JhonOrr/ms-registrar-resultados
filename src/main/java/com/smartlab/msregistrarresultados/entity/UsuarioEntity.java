package com.smartlab.msregistrarresultados.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
@Entity
@Table(name = "usuario")
@Data
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;
    @Column(name = "nombres", nullable = false, length = 25)
    private String nombres;
    @Column(name = "ape_pat", nullable = false, length = 25)
    private String apellidoPaterno;
    @Column(name = "ape_mat", nullable = false, length = 25)
    private String apellidoMaterno;
    @Column(name = "estado", nullable = false)
    private Integer estado;
    @Column(name = "usua_create", length = 45)
    private String usuaCrea;
    @Column(name = "date_create")
    private Timestamp dateCreate;
    @Column(name = "usua_modif", length = 45)
    private String usuaModif;
    @Column(name = "date_modif")
    private Timestamp dateModif;
    @Column(name = "usua_delete", length = 45)
    private String usuaDelet;
    @Column(name = "date_delete")
    private Timestamp dateDelet;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role;
    @Column(name="email")
    private String email;
    // Relacion con cliente
    @Column(name = "id_cliente")
    private Integer cliente;
}
