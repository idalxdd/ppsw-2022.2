package br.upe.ppsw.jabberpoint.view;

import java.awt.Frame;
import javax.swing.JOptionPane;

public class AboutBox {

  public static void show(Frame parent) {
    JOptionPane.showMessageDialog(parent,
        "JabberPoint é um programa de apresentação de slides básico escrito em Java(tm).\n"
            + "Ele é disponibilizado como uma cópia livre desde que você mantenha esta informação de splash screen intacta.\n"
            + "Copyright (c) 1995-now by Ian F. Darwin, ian@darwinsys.com.\n"
            + "Adaptada por Helaine Barreiros fpara Universidade de Pernambuco, 2021 -- now.\n"
            + "A cópia original do autor está disponível em http://www.darwinsys.com/",
        "Sobre JabberPoint", JOptionPane.INFORMATION_MESSAGE);
  }
}
