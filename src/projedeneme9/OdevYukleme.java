package projedeneme9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OdevYukleme extends JFrame {

    private JTextField textField1;
    private JButton dosyaSeçButton;

    public static void kullanıcıArayuzu() {
        final JFrame jf1 = new JFrame();
        jf1.setTitle("Kullanıcı Girişi");
        jf1.setBounds(435, 170, 1000, 700);
        Color rnk = new Color(210, 210, 210);
        jf1.getContentPane().setBackground(rnk);
        jf1.getContentPane().setLayout(null);
        jf1.setVisible(true);
        jf1.setResizable(false);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JButton buton1 = new JButton("Akademisyen Girişi");
        final JButton buton2 = new JButton("Öğrenci Girişi");
        jf1.getContentPane().add(buton1);
        jf1.getContentPane().add(buton2);

        Color rnk1 = new Color(15, 15, 15);
        Color rnk2 = new Color(186, 162, 151);
        buton1.setBackground(rnk1);
        buton1.setForeground(rnk2);
        buton2.setBackground(rnk1);
        buton2.setForeground(rnk2);

        buton1.setBounds(350, 175, 300, 150);
        buton2.setBounds(350, 325, 300, 150);

        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == buton1) {
                    jf1.dispose();
                }

                Color rnk1 = new Color(255, 255, 255);
                Color rnk2 = new Color(15, 15, 15);

                final JFrame jf2 = new JFrame();
                jf2.setTitle("Kullanıcı Bilgileri");
                jf2.setBounds(435, 170, 1000, 700);
                Color rnk = new Color(210, 210, 210);
                jf2.getContentPane().setBackground(rnk);
                jf2.getContentPane().setLayout(null);
                jf2.setVisible(true);
                jf2.setResizable(false);
                jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton geri = new JButton("Geri");
                jf2.getContentPane().add(geri);
                geri.setBackground(rnk1);
                geri.setForeground(rnk2);
                geri.setBounds(10, 10, 100, 40);

                geri.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jf2.hide();
                        jf1.getClass();
                        jf1.setVisible(true);
                    }
                });

                JLabel lb = new JLabel("KULLANICI ADI");
                jf2.getContentPane().add(lb);
                lb.setBackground(rnk1);
                lb.setForeground(rnk2);
                lb.setBounds(300, 140, 100, 25);

                final JTextField text1 = new JTextField(20);
                jf2.getContentPane().add(text1);
                text1.setBackground(rnk1);
                text1.setForeground(rnk2);
                text1.setBounds(600, 140, 100, 25);

                JLabel lb2 = new JLabel("ŞİFRE");
                jf2.getContentPane().add(lb2);
                lb2.setBackground(rnk1);
                lb2.setForeground(rnk2);
                lb2.setBounds(300, 200, 100, 25);

                final JPasswordField text2 = new JPasswordField(5);
                jf2.getContentPane().add(text2);
                text2.setBackground(rnk1);
                text2.setForeground(rnk2);
                text2.setBounds(600, 200, 100, 25);

                final JCheckBox sifreGöster = new JCheckBox("Şifre Göster");
                jf2.getContentPane().add(sifreGöster);
                sifreGöster.setBackground(rnk1);
                sifreGöster.setForeground(rnk2);
                sifreGöster.setBounds(600, 300, 100, 25);

                sifreGöster.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (sifreGöster.isSelected()) {
                            text2.setEchoChar((char) 0);
                        } else {
                            text2.setEchoChar('*');
                        }
                    }
                });

                final JButton butonGiris = new JButton("Giriş");
                jf2.getContentPane().add(butonGiris);
                butonGiris.setBackground(rnk1);
                butonGiris.setForeground(rnk2);
                butonGiris.setBounds(300, 300, 100, 25);

                butonGiris.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String ogrencino1 = "01";
                        String ogrencisifre1 = "01";
                        String ogrencino2 = "02";
                        String ogrencisifre2 = "02";

                        if (text1.getText().equals(ogrencino1) && text2.getText().equals(ogrencisifre1)) {

                            if (e.getSource() == butonGiris) {
                                jf2.dispose();
                            }

                            final JFrame jf3 = new JFrame();
                            jf3.setTitle("Dersler");
                            jf3.setBounds(435, 170, 1000, 700);
                            Color rnk = new Color(210, 210, 210);
                            jf3.getContentPane().setBackground(rnk);
                            jf3.getContentPane().setLayout(null);
                            jf3.setVisible(true);
                            jf3.setResizable(false);
                            jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                            Color rnk1 = new Color(255, 255, 255);
                            Color rnk2 = new Color(15, 15, 15);

                            final JButton cikis = new JButton("Çıkış");
                            jf3.getContentPane().add(cikis);
                            cikis.setBackground(rnk1);
                            cikis.setForeground(rnk2);
                            cikis.setBounds(10, 10, 100, 40);

                            cikis.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    jf3.hide();
                                    jf2.getClass();
                                    jf2.setVisible(true);
                                }
                            });

                            final JButton buton4 = new JButton("Nesne Tabanlı Programlama");
                            jf3.getContentPane().add(buton4);
                            buton4.setBackground(rnk1);
                            buton4.setForeground(rnk2);
                            buton4.setBounds(300, 150, 200, 100);

                            buton4.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton4) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf4 = new JFrame();
                                    jf4.setTitle("Nesne Tabanlı Programlama");
                                    jf4.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf4.getContentPane().setBackground(rnk);
                                    jf4.getContentPane().setLayout(null);
                                    jf4.setVisible(true);
                                    jf4.setResizable(false);
                                    jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf4.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf4.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton akd_ky = new JButton("Kaynak Yükle");
                                    akd_ky.setBounds(350, 175, 300, 150);
                                    akd_ky.setBackground(rnk1);
                                    akd_ky.setForeground(rnk2);
                                    jf4.getContentPane().add(akd_ky);

                                    akd_ky.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

                                            if (e.getSource() == akd_ky) {
                                                jf4.dispose();
                                            }
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Nesne Tabanlı Programlama";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            final File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            final JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf5 = new JFrame();
                                            jf5.setTitle("Nesne Tabanlı Programlama");
                                            jf5.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf5.getContentPane().setBackground(rnk);
                                            jf5.getContentPane().add(dosyaSecButon);
                                            jf5.getContentPane().add(gonderButon);
                                            jf5.getContentPane().add(isimLabel);
                                            jf5.getContentPane().add(dosyaLabel);
                                            jf5.getContentPane().add(isimText);
                                            jf5.getContentPane().add(dosyaListesi);
                                            jf5.getContentPane().add(DosyalarLabel);
                                            jf5.getContentPane().add(basariliLabel);
                                            jf5.getContentPane().add(geri);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf5.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf5.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf5.setVisible(true);
                                            jf5.setResizable(false);
                                            jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf5.hide();
                                                    jf4.getClass();
                                                    jf4.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf5);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            dosyaListesi.addListSelectionListener(new ListSelectionListener() {
                                                @Override
                                                public void valueChanged(ListSelectionEvent e) {
                                                    if (Desktop.isDesktopSupported()) {
                                                        try {
                                                            File myFile = new File("C:/Dosyalar/Ogrenci/Nesne Tabanlı Programlama/" + listOfFiles[dosyaListesi.getSelectedIndex()].getName());
                                                            if (myFile.exists()) {
                                                                Desktop.getDesktop().open(myFile);
                                                            }

                                                        } catch (IOException ex) {

                                                        }
                                                    }
                                                }
                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Nesne Tabanlı Programlama\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });
                                        }
                                    });

                                    final JButton akd_oy = new JButton("Ödev Oluştur");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf4.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

  //Bu kısmın koduyla akademisyen ödev yüklemesi yapacak.                                       
   /* yeni dosyayı jf6 yap. */                                        }
                                    });

                                }
                            });

                            final JButton buton5 = new JButton("Ayrık Yapılar");
                            jf3.getContentPane().add(buton5);
                            buton5.setBackground(rnk1);
                            buton5.setForeground(rnk2);
                            buton5.setBounds(500, 150, 200, 100);

                            buton5.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton5) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf7 = new JFrame();
                                    jf7.setTitle("Ayrık Yapılar");
                                    jf7.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf7.getContentPane().setBackground(rnk);
                                    jf7.getContentPane().setLayout(null);
                                    jf7.setVisible(true);
                                    jf7.setResizable(false);
                                    jf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf7.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf7.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton akd_ky = new JButton("Kaynak Yükle");
                                    akd_ky.setBounds(350, 175, 300, 150);
                                    akd_ky.setBackground(rnk1);
                                    akd_ky.setForeground(rnk2);
                                    jf7.getContentPane().add(akd_ky);

                                    akd_ky.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

                                            if (e.getSource() == akd_ky) {
                                                jf7.dispose();
                                            }
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Ayrık Yapılar";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            final File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            final JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf8 = new JFrame();
                                            jf8.setTitle("Ayrık Yapılar");
                                            jf8.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf8.getContentPane().setBackground(rnk);
                                            jf8.getContentPane().add(dosyaSecButon);
                                            jf8.getContentPane().add(gonderButon);
                                            jf8.getContentPane().add(isimLabel);
                                            jf8.getContentPane().add(dosyaLabel);
                                            jf8.getContentPane().add(isimText);
                                            jf8.getContentPane().add(dosyaListesi);
                                            jf8.getContentPane().add(DosyalarLabel);
                                            jf8.getContentPane().add(basariliLabel);
                                            jf8.getContentPane().add(geri);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf8.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf8.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf8.setVisible(true);
                                            jf8.setResizable(false);
                                            jf8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf8.hide();
                                                    jf7.getClass();
                                                    jf7.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf7);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            dosyaListesi.addListSelectionListener(new ListSelectionListener() {
                                                @Override
                                                public void valueChanged(ListSelectionEvent e) {
                                                    if (Desktop.isDesktopSupported()) {
                                                        try {
                                                            File myFile = new File("C:/Dosyalar/Ogrenci/Ayrık Yapılar/" + listOfFiles[dosyaListesi.getSelectedIndex()].getName());
                                                            if (myFile.exists()) {
                                                                Desktop.getDesktop().open(myFile);
                                                            }

                                                        } catch (IOException ex) {

                                                        }
                                                    }
                                                }
                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Ayrık Yapılar\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });
                                        }
                                    });

                                    final JButton akd_oy = new JButton("Ödev Oluştur");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf7.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

                                            /* yeni dosyayı jf9 yap. */
                                        }
                                    });

                                }
                            });

                        } else {
                            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı");
                        }

                    }
                });

            }
        });

        /* ÖĞRENCİ ARAYÜZÜ  */
        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == buton2) {
                    jf1.dispose();

                }

                final JFrame jf2 = new JFrame();
                jf2.setTitle("Kullanıcı Bilgileri");
                jf2.setBounds(435, 170, 1000, 700);
                Color rnk = new Color(210, 210, 210);
                jf2.getContentPane().setBackground(rnk);
                jf2.getContentPane().setLayout(null);
                jf2.setVisible(true);
                jf2.setResizable(false);
                jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Color rnk1 = new Color(255, 255, 255);
                Color rnk2 = new Color(15, 15, 15);

                JLabel lb = new JLabel("KULLANICI ADI");
                jf2.getContentPane().add(lb);
                lb.setBackground(rnk1);
                lb.setForeground(rnk2);
                lb.setBounds(300, 140, 100, 25);

                final JTextField text1 = new JTextField(20);
                jf2.getContentPane().add(text1);
                text1.setBackground(rnk1);
                text1.setForeground(rnk2);
                text1.setBounds(600, 140, 100, 25);

                JLabel lb2 = new JLabel("ŞİFRE");
                jf2.getContentPane().add(lb2);
                lb2.setBackground(rnk1);
                lb2.setForeground(rnk2);
                lb2.setBounds(300, 200, 100, 25);

                final JPasswordField text2 = new JPasswordField(5);
                jf2.getContentPane().add(text2);
                text2.setBackground(rnk1);
                text2.setForeground(rnk2);
                text2.setBounds(600, 200, 100, 25);

                final JCheckBox sifreGöster = new JCheckBox("Şifre Göster");
                jf2.getContentPane().add(sifreGöster);
                sifreGöster.setBackground(rnk1);
                sifreGöster.setForeground(rnk2);
                sifreGöster.setBounds(600, 300, 100, 25);

                sifreGöster.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (sifreGöster.isSelected()) {
                            text2.setEchoChar((char) 0);
                        } else {
                            text2.setEchoChar('*');
                        }
                    }
                });

                JButton geri = new JButton("Geri");
                jf2.getContentPane().add(geri);
                geri.setBackground(rnk1);
                geri.setForeground(rnk2);
                geri.setBounds(10, 10, 100, 40);

                geri.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jf2.hide();
                        jf1.getClass();
                        jf1.setVisible(true);
                    }
                });

                final JButton buton3 = new JButton("Giriş");
                jf2.getContentPane().add(buton3);
                lb.setBackground(rnk1);
                lb.setForeground(rnk2);
                buton3.setBounds(300, 300, 100, 25);

                buton3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String ogrencino1 = "01";
                        String ogrencisifre1 = "01";
                        String ogrencino2 = "02";
                        String ogrencisifre2 = "02";

                        if (text1.getText().equals(ogrencino1) && text2.getText().equals(ogrencisifre1)) {

                            if (e.getSource() == buton3) {
                                jf2.dispose();
                            }

                            final JFrame jf3 = new JFrame();
                            jf3.setTitle("Dersler");
                            jf3.setBounds(435, 170, 1000, 700);
                            Color rnk = new Color(210, 210, 210);
                            jf3.getContentPane().setBackground(rnk);
                            jf3.getContentPane().setLayout(null);
                            jf3.setVisible(true);
                            jf3.setResizable(false);
                            jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                            Color rnk1 = new Color(255, 255, 255);
                            Color rnk2 = new Color(15, 15, 15);

                            final JButton cikis = new JButton("Çıkış");
                            jf3.getContentPane().add(cikis);
                            cikis.setBackground(rnk1);
                            cikis.setForeground(rnk2);
                            cikis.setBounds(10, 10, 100, 40);

                            cikis.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    jf3.hide();
                                    jf2.getClass();
                                    jf2.setVisible(true);
                                }
                            });
                            /* *********************************************************  */
                            final JButton buton4 = new JButton("Nesne Tabanlı Programlama");
                            jf3.getContentPane().add(buton4);
                            buton4.setBackground(rnk1);
                            buton4.setForeground(rnk2);
                            buton4.setBounds(300, 150, 200, 100);

                            buton4.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton4) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf4 = new JFrame();
                                    jf4.setTitle("Nesne Tabanlı Programlama");
                                    jf4.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf4.getContentPane().setBackground(rnk);
                                    jf4.getContentPane().setLayout(null);
                                    jf4.setVisible(true);
                                    jf4.setResizable(false);
                                    jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf4.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf4.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton akd_ky = new JButton("Kaynaklar");
                                    akd_ky.setBounds(350, 175, 300, 150);
                                    akd_ky.setBackground(rnk1);
                                    akd_ky.setForeground(rnk2);
                                    jf4.getContentPane().add(akd_ky);

                                    akd_ky.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

                                            if (e.getSource() == akd_ky) {
                                                jf4.dispose();
                                            }
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Nesne Tabanlı Programlama";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            final File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            final JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf5 = new JFrame();
                                            jf5.setTitle("Nesne Tabanlı Programlama");
                                            jf5.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf5.getContentPane().setBackground(rnk);
                                            jf5.getContentPane().add(dosyaSecButon);
                                            jf5.getContentPane().add(gonderButon);
                                            jf5.getContentPane().add(isimLabel);
                                            jf5.getContentPane().add(dosyaLabel);
                                            jf5.getContentPane().add(isimText);
                                            jf5.getContentPane().add(dosyaListesi);
                                            jf5.getContentPane().add(DosyalarLabel);
                                            jf5.getContentPane().add(basariliLabel);
                                            jf5.getContentPane().add(geri);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf5.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf5.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf5.setVisible(true);
                                            jf5.setResizable(false);
                                            jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf5.hide();
                                                    jf4.getClass();
                                                    jf4.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf5);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            dosyaListesi.addListSelectionListener(new ListSelectionListener() {
                                                @Override
                                                public void valueChanged(ListSelectionEvent e) {
                                                    if (Desktop.isDesktopSupported()) {
                                                        try {
                                                            File myFile = new File("C:/Dosyalar/Ogrenci/Nesne Tabanlı Programlama/" + listOfFiles[dosyaListesi.getSelectedIndex()].getName());
                                                            if (myFile.exists()) {
                                                                Desktop.getDesktop().open(myFile);
                                                            }

                                                        } catch (IOException ex) {

                                                        }
                                                    }
                                                }
                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Nesne Tabanlı Programlama\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });
                                        }
                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf4.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf6 yap. */                                        }
                                    });

                                }

                            });

                            final JButton buton5 = new JButton("Ayrık Yapılar");
                            jf3.getContentPane().add(buton5);
                            buton5.setBackground(rnk1);
                            buton5.setForeground(rnk2);
                            buton5.setBounds(500, 150, 200, 100);

                            buton5.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton5) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf7 = new JFrame();
                                    jf7.setTitle("Ayrık Yapılar");
                                    jf7.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf7.getContentPane().setBackground(rnk);
                                    jf7.getContentPane().setLayout(null);
                                    jf7.setVisible(true);
                                    jf7.setResizable(false);
                                    jf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf7.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf7.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton akd_ky = new JButton("Kaynaklar");
                                    akd_ky.setBounds(350, 175, 300, 150);
                                    akd_ky.setBackground(rnk1);
                                    akd_ky.setForeground(rnk2);
                                    jf7.getContentPane().add(akd_ky);

                                    akd_ky.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {

                                            if (e.getSource() == akd_ky) {
                                                jf7.dispose();
                                            }
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Ayrık Yapılar";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            final File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            final JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf8 = new JFrame();
                                            jf8.setTitle("Ayrık Yapılar");
                                            jf8.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf8.getContentPane().setBackground(rnk);
                                            jf8.getContentPane().add(dosyaSecButon);
                                            jf8.getContentPane().add(gonderButon);
                                            jf8.getContentPane().add(isimLabel);
                                            jf8.getContentPane().add(dosyaLabel);
                                            jf8.getContentPane().add(isimText);
                                            jf8.getContentPane().add(dosyaListesi);
                                            jf8.getContentPane().add(DosyalarLabel);
                                            jf8.getContentPane().add(basariliLabel);
                                            jf8.getContentPane().add(geri);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf8.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf8.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf8.setVisible(true);
                                            jf8.setResizable(false);
                                            jf8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf8.hide();
                                                    jf7.getClass();
                                                    jf7.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf7);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            dosyaListesi.addListSelectionListener(new ListSelectionListener() {
                                                @Override
                                                public void valueChanged(ListSelectionEvent e) {
                                                    if (Desktop.isDesktopSupported()) {
                                                        try {
                                                            File myFile = new File("C:/Dosyalar/Ogrenci/Ayrık Yapılar/" + listOfFiles[dosyaListesi.getSelectedIndex()].getName());
                                                            if (myFile.exists()) {
                                                                Desktop.getDesktop().open(myFile);
                                                            }

                                                        } catch (IOException ex) {

                                                        }
                                                    }
                                                }
                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Ayrık Yapılar\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });
                                        }
                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf7.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf9 yap. */
                                        }
                                    });

                                }

                            });

                            final JButton buton6 = new JButton("Bilgisayar Destekli Teknik Resim");
                            jf3.getContentPane().add(buton6);
                            buton6.setBackground(rnk1);
                            buton6.setForeground(rnk2);
                            buton6.setBounds(300, 250, 200, 100);
                            buton6.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton6) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf10 = new JFrame();
                                    jf10.setTitle("Bilgisayar Destekli Teknik Resim");
                                    jf10.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf10.getContentPane().setBackground(rnk);
                                    jf10.getContentPane().setLayout(null);
                                    jf10.setVisible(true);
                                    jf10.setResizable(false);
                                    jf10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf10.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf10.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton ogr_ky = new JButton("Kaynaklar");
                                    ogr_ky.setBounds(350, 175, 300, 150);
                                    ogr_ky.setBackground(rnk1);
                                    ogr_ky.setForeground(rnk2);
                                    jf10.getContentPane().add(ogr_ky);

                                    ogr_ky.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            if (e.getSource() == ogr_ky) {
                                                jf10.dispose();
                                            }
                                            /* yeni dosyayı jf11 yap. */
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Bilgisayar Destekli Teknik Resim";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf11 = new JFrame();
                                            jf11.setTitle("Bilgisayar Destekli Teknik Resim");
                                            jf11.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf11.getContentPane().setBackground(rnk);
                                            jf11.getContentPane().add(dosyaSecButon);
                                            jf11.getContentPane().add(gonderButon);
                                            jf11.getContentPane().add(geri);
                                            jf11.getContentPane().add(isimLabel);
                                            jf11.getContentPane().add(dosyaLabel);
                                            jf11.getContentPane().add(isimText);
                                            jf11.getContentPane().add(dosyaListesi);
                                            jf11.getContentPane().add(DosyalarLabel);
                                            jf11.getContentPane().add(basariliLabel);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf11.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf11.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf11.setVisible(true);
                                            jf11.setResizable(false);
                                            jf11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf11.hide();
                                                    jf10.getClass();
                                                    jf10.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf11);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Bilgisayar Destekli Teknik Resim\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });

                                        }

                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf10.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf12 yap. */
                                        }
                                    });

                                }

                            });
                            final JButton buton12 = new JButton("Sayısal Tasarım");
                            jf3.getContentPane().add(buton12);
                            buton12.setBackground(rnk1);
                            buton12.setForeground(rnk2);
                            buton12.setBounds(500, 250, 200, 100);
                            buton12.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton12) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf13 = new JFrame();
                                    jf13.setTitle("Ayrık Yapılar");
                                    jf13.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf13.getContentPane().setBackground(rnk);
                                    jf13.getContentPane().setLayout(null);
                                    jf13.setVisible(true);
                                    jf13.setResizable(false);
                                    jf13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf13.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf13.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton ogr_ky = new JButton("Kaynaklar");
                                    ogr_ky.setBounds(350, 175, 300, 150);
                                    ogr_ky.setBackground(rnk1);
                                    ogr_ky.setForeground(rnk2);
                                    jf13.getContentPane().add(ogr_ky);

                                    ogr_ky.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            if (e.getSource() == ogr_ky) {
                                                jf13.dispose();
                                            }
                                            /* yeni dosyayı jf14 yap. */
                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Sayısal Tasarım";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf14 = new JFrame();
                                            jf14.setTitle("Sayısal Tasarım");
                                            jf14.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf14.getContentPane().setBackground(rnk);
                                            jf14.getContentPane().add(dosyaSecButon);
                                            jf14.getContentPane().add(geri);
                                            jf14.getContentPane().add(gonderButon);
                                            jf14.getContentPane().add(isimLabel);
                                            jf14.getContentPane().add(dosyaLabel);
                                            jf14.getContentPane().add(isimText);
                                            jf14.getContentPane().add(dosyaListesi);
                                            jf14.getContentPane().add(DosyalarLabel);
                                            jf14.getContentPane().add(basariliLabel);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf14.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf14.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf14.setVisible(true);
                                            jf14.setResizable(false);
                                            jf14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf14.hide();
                                                    jf13.getClass();
                                                    jf13.setVisible(true);
                                                }
                                            });

                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf14);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Sayısal Tasarım\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });

                                        }

                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf13.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf15 yap. */
                                        }
                                    });

                                }

                            });
                            final JButton buton8 = new JButton("Diferansiyel Denklemler");
                            jf3.getContentPane().add(buton8);
                            buton8.setBackground(rnk1);
                            buton8.setForeground(rnk2);
                            buton8.setBounds(300, 350, 200, 100);
                            buton8.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton8) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf16 = new JFrame();
                                    jf16.setTitle("Ayrık Yapılar");
                                    jf16.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf16.getContentPane().setBackground(rnk);
                                    jf16.getContentPane().setLayout(null);
                                    jf16.setVisible(true);
                                    jf16.setResizable(false);
                                    jf16.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf16.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf16.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton ogr_ky = new JButton("Kaynaklar");
                                    ogr_ky.setBounds(350, 175, 300, 150);
                                    ogr_ky.setBackground(rnk1);
                                    ogr_ky.setForeground(rnk2);
                                    jf16.getContentPane().add(ogr_ky);

                                    ogr_ky.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            if (e.getSource() == ogr_ky) {
                                                jf16.dispose();
                                            }
                                            /* yeni dosyayı jf17 yap. */ JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Diferansiyel Denklemler";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf17 = new JFrame();
                                            jf17.setTitle("Diferansiyel Denklemler");
                                            jf17.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf17.getContentPane().setBackground(rnk);
                                            jf17.getContentPane().add(dosyaSecButon);
                                            jf17.getContentPane().add(gonderButon);
                                            jf17.getContentPane().add(geri);
                                            jf17.getContentPane().add(isimLabel);
                                            jf17.getContentPane().add(dosyaLabel);
                                            jf17.getContentPane().add(isimText);
                                            jf17.getContentPane().add(dosyaListesi);
                                            jf17.getContentPane().add(DosyalarLabel);
                                            jf17.getContentPane().add(basariliLabel);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf17.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf17.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf17.setVisible(true);
                                            jf17.setResizable(false);
                                            jf17.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf17.hide();
                                                    jf16.getClass();
                                                    jf16.setVisible(true);
                                                }
                                            });

                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf17);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Diferansiyel Denklemler\\" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });

                                        }

                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf16.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf18 yap. */
                                        }
                                    });

                                }

                            });
                            final JButton buton9 = new JButton("Lineer Cebir");
                            jf3.getContentPane().add(buton9);
                            buton9.setBackground(rnk1);
                            buton9.setForeground(rnk2);
                            buton9.setBounds(500, 350, 200, 100);
                            buton9.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == buton9) {
                                        jf3.dispose();
                                    }

                                    final JFrame jf19 = new JFrame();
                                    jf19.setTitle("Ayrık Yapılar");
                                    jf19.setBounds(435, 170, 1000, 700);
                                    Color rnk = new Color(210, 210, 210);
                                    jf19.getContentPane().setBackground(rnk);
                                    jf19.getContentPane().setLayout(null);
                                    jf19.setVisible(true);
                                    jf19.setResizable(false);
                                    jf19.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                    Color rnk1 = new Color(255, 255, 255);
                                    Color rnk2 = new Color(15, 15, 15);

                                    JButton geri = new JButton("Geri");
                                    jf19.getContentPane().add(geri);
                                    geri.setBackground(rnk1);
                                    geri.setForeground(rnk2);
                                    geri.setBounds(10, 10, 100, 40);

                                    geri.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            jf19.hide();
                                            jf3.getClass();
                                            jf3.setVisible(true);
                                        }
                                    });

                                    final JButton ogr_ky = new JButton("Kaynaklar");
                                    ogr_ky.setBounds(350, 175, 300, 150);
                                    ogr_ky.setBackground(rnk1);
                                    ogr_ky.setForeground(rnk2);
                                    jf19.getContentPane().add(ogr_ky);

                                    ogr_ky.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            if (e.getSource() == ogr_ky) {
                                                jf19.dispose();
                                            }
                                            /* yeni dosyayı jf20 yap. */

                                            JButton dosyaSecButon = new JButton("Dosya Seç");
                                            JButton gonderButon = new JButton("Gönder");
                                            JButton geri = new JButton("Geri");
                                            Color rnk1 = new Color(255, 255, 255);
                                            Color rnk2 = new Color(15, 15, 15);
                                            JLabel isimLabel = new JLabel("İsim");
                                            final JLabel dosyaLabel = new JLabel("Dosya seçiniz");
                                            JLabel DosyalarLabel = new JLabel("Gönderilen Dosyalar");
                                            final JLabel basariliLabel = new JLabel("Başarıyla gönderildi.");
                                            DefaultListModel model = new DefaultListModel();

                                            String path = "C:\\Dosyalar\\Ogrenci\\Lineer Cebir";
                                            String files;
                                            String fileNames = "";
                                            File folder = new File(path);
                                            File[] listOfFiles = folder.listFiles();

                                            for (int i = 0; i < listOfFiles.length; i++) {
                                                if (listOfFiles[i].isFile()) {
                                                    BasicFileAttributes attr = null;
                                                    try {
                                                        attr = Files.readAttributes(listOfFiles[i].toPath(), BasicFileAttributes.class);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                    String desen = "EEEEE dd MMMMM yyyy HH:mm:ss";
                                                    SimpleDateFormat simpleDateFormat
                                                            = new SimpleDateFormat(desen, new Locale("tr", "TR"));

                                                    String date = simpleDateFormat.format(new Date(attr.creationTime().toMillis()));

                                                    files = listOfFiles[i].getName() + " - " + date;
                                                    model.add(i, files);

                                                }
                                            }
                                            JList dosyaListesi = new JList(model);

                                            final JTextArea isimText = new JTextArea();
                                            final JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                            jfc.setDialogTitle("Dosya Seçiniz");
                                            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                            final File[] file = new File[1];
                                            final JFrame jf20 = new JFrame();
                                            jf20.setTitle("Lineer Cebir");
                                            jf20.setBounds(435, 170, 900, 550);
                                            Color rnk = new Color(210, 210, 210);
                                            jf20.getContentPane().setBackground(rnk);
                                            jf20.getContentPane().add(dosyaSecButon);
                                            jf20.getContentPane().add(gonderButon);
                                            jf20.getContentPane().add(isimLabel);
                                            jf20.getContentPane().add(geri);
                                            jf20.getContentPane().add(dosyaLabel);
                                            jf20.getContentPane().add(isimText);
                                            jf20.getContentPane().add(dosyaListesi);
                                            jf20.getContentPane().add(DosyalarLabel);
                                            jf20.getContentPane().add(basariliLabel);
                                            basariliLabel.setForeground(Color.GREEN);
                                            basariliLabel.setVisible(false);
                                            geri.setBackground(rnk1);
                                            geri.setForeground(rnk2);
                                            geri.setBounds(10, 10, 100, 25);
                                            dosyaListesi.setBounds(350, 80, 500, 400);
                                            DosyalarLabel.setBounds(350, 50, 500, 20);
                                            jf20.getContentPane().add(jfc);
                                            isimText.setBackground(rnk1);
                                            isimText.setForeground(rnk2);
                                            isimText.setBounds(80, 80, 150, 20);
                                            jf20.getContentPane().setLayout(null);
                                            isimLabel.setBounds(50, 80, 100, 15);
                                            dosyaLabel.setBounds(50, 120, 250, 15);
                                            dosyaSecButon.setBackground(rnk1);
                                            dosyaSecButon.setForeground(rnk2);
                                            dosyaSecButon.setBounds(50, 150, 100, 25);
                                            basariliLabel.setBounds(50, 180, 200, 25);
                                            gonderButon.setBackground(rnk1);
                                            gonderButon.setForeground(rnk2);
                                            gonderButon.setBounds(170, 150, 100, 25);
                                            jf20.setVisible(true);
                                            jf20.setResizable(false);
                                            jf20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            geri.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jf20.hide();
                                                    jf19.getClass();
                                                    jf19.setVisible(true);
                                                }
                                            });
                                            dosyaSecButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    jfc.showOpenDialog(jf20);
                                                    file[0] = jfc.getSelectedFile();

                                                    String filePath = file[0].getAbsolutePath();
                                                    dosyaLabel.setText(filePath);
                                                }

                                            });
                                            gonderButon.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    int i = file[0].getName().length() - 4;
                                                    int j = file[0].getName().length();
                                                    String fileName = file[0].getName().substring(i, j);
                                                    File dest = new File("C:\\Dosyalar\\Ogrenci\\Lineer Cebir" + isimText.getText() + fileName);
                                                    try {
                                                        Files.copy(file[0].toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                                        basariliLabel.setText("Dosya Başarıyla Gönderildi");
                                                        basariliLabel.setVisible(true);
                                                    } catch (IOException ex) {
                                                        ex.printStackTrace();
                                                    }
                                                }
                                            });

                                        }

                                    });

                                    final JButton akd_oy = new JButton("Ödevler");
                                    akd_oy.setBounds(350, 325, 300, 150);
                                    akd_oy.setBackground(rnk1);
                                    akd_oy.setForeground(rnk2);
                                    jf19.getContentPane().add(akd_oy);

                                    akd_oy.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            /* yeni dosyayı jf21 yap. */
                                        }
                                    });
                                }

                            });

                        } else {
                            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı");
                        }

                    }
                });

            }
        });

    }

    public static void main(String[] args) {

        JFrame jf = new JFrame();

        kullanıcıArayuzu();
    }
}
