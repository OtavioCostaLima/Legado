/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.dao;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author root
 */
public class SegurancaDAO {

    public int back(String data, String hora) {
        int ret = 0;
//        macOs_X();
        String data1 = data.replaceAll("/", "-");
        String hora1 = hora.replaceAll(":", ";");
        boolean pesquisa;
        JFileChooser arquivo = new JFileChooser(new File("C:\\"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Backup", "backup");
        arquivo.setFileFilter(filter);
        arquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (arquivo.showSaveDialog(null) != JFileChooser.APPROVE_OPTION) {
//            LookAndFeel();
            return 1;
        } else {
            pesquisa = true;
        }
        if (pesquisa) {
            final List<String> comandos = new ArrayList<>();
            comandos.add("C:\\Program Files\\PostgreSQL\\9.3\\bin\\pg_dump.exe");
            comandos.add("-h");
            comandos.add("localhost");
            comandos.add("--port");
            comandos.add("5432");
            comandos.add("--username");
            comandos.add("postgres");
            comandos.add("--format");
            comandos.add("custom");
            comandos.add("--no-owner");
            comandos.add("--section");
            comandos.add("pre-data");
            comandos.add("--section");
            comandos.add("data");
            comandos.add("--section");
            comandos.add("post-data");
            comandos.add("--encoding");
            comandos.add("UTF8");
            comandos.add("--inserts");
            comandos.add("--column-inserts");
            comandos.add("--no-privileges");
            comandos.add("--no-tablespaces");
            comandos.add("--use-set-session-authorization");
            comandos.add("--quote-all-identifiers");
            comandos.add("--no-unlogged-table-data");
            comandos.add("-f");
            comandos.add(arquivo.getSelectedFile().getAbsolutePath() + "\\Backup_" + data1 + "_" + hora1 + ".backup");
            comandos.add("fazenda_cafs");
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        System.err.println(line);
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                ret = 4;
            } catch (IOException | InterruptedException e) {
                ret = 2;
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Erro ao Realizar Backup !!!\nErro: " + e.getMessage(), "Mensagem", 2);
            }
        }
//        LookAndFeel();
        return ret;
    }

    public int restaurar() {
//        macOs_X();
        int ret = 0;
        boolean pesquisa;
        JFileChooser arquivo = new JFileChooser(new File("C:\\"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Backup", "backup");
        arquivo.setFileFilter(filter);
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (arquivo.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
//            LookAndFeel();
            return 1;
        } else {
            pesquisa = true;
        }
        if (pesquisa) {
            final List<String> comandos = new ArrayList<>();
            comandos.add("C:\\Program Files\\PostgreSQL\\9.3\\bin\\pg_restore.exe");
            comandos.add("-i");
            comandos.add("-h");
            comandos.add("localhost");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-d");
            comandos.add("fazenda_cafs");
            comandos.add("-v");
            comandos.add("-c");
            comandos.add(arquivo.getSelectedFile().getAbsolutePath());
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        System.err.println(line);
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                ret = 4;
                // JOptionPane.showMessageDialog(null, "Restore realizado com sucesso !!! \nLocalizado na pasta do programa!\n" + arquivo.getSelectedFile().getAbsolutePath());
            } catch (IOException | InterruptedException e) {
                ret = 2;
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Erro ao Realizar Restauracao !!!\nErro: " + e.getMessage(), "Mensagem", 2);
            }
        }
//        LookAndFeel();
        return ret;
    }
}
