//package br.com.artigos.serial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExemploStream
{
    public static void main(String[] args)
    {
        // Cria o objeto serializado
        Cliente cliente = new Cliente("vitoria", 'F', "1");
        try
        {
//            C:\Users\vitor\Desktop\padroes,topicos,banco II,SO\Tópicos Avançados em Programação Web
            //Gera o arquivo para armazenar o objeto
            FileOutputStream arquivoGrav =
                    new FileOutputStream("/Users/vitor/Desktop/padroes,topicos,banco II,SO/Tópicos Avançados em Programação Web/x.xml");
            //Classe responsavel por inserir os objetos
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //Grava o objeto cliente no arquivo
            objGravar.writeObject(cliente);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            System.out.println("Objeto gravado com sucesso!");
        }

        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Recuperando objeto: ");
        try
        {
            //Carrega o arquivo
            FileInputStream arquivoLeitura = new FileInputStream ("/Users/vitor/Desktop/padroes,topicos,banco II,SO/Tópicos Avançados em Programação Web/x.xml");
//                / / Classe responsavel por recuperar os objetos do arquivo
            ObjectInputStream objLeitura =
                    new ObjectInputStream(arquivoLeitura);
            System.out.println(objLeitura.readObject());
            objLeitura.close();
            arquivoLeitura.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
