/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.util.ArrayList;
import model.entities.Comentario;
import model.entities.Publicacion;
import model.entities.Usuario;

/**
 *
 * @author agustin
 */
public interface ComentarioDAO {
    public ArrayList<Publicacion> publicacionesComentablesPara(Usuario u);
    public boolean agregar(Comentario comentario);
    public ArrayList<Comentario> listar();
}
