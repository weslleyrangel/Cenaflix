/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc10e3;

import com.uc10e3.view.TelaDeLogin;

/**
 * Ponto de entrada principal da aplicação CENAFLIX.
 * Inicializa o sistema e carrega a primeira interface do usuário.
 * 
 * @author Wesll
 * @version 1.0
 * @since 2023-10-01
 */
public class Cenaflix {

    /**
     * Método principal que inicia a aplicação.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
   public static void main(String[] args) {
        // Inicia a tela de login
        TelaDeLogin telaDeLogin = new TelaDeLogin();
        telaDeLogin.setVisible(true);
    }
}
