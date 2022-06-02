import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;



// minha ideia pra conseguir fazer foi separar tudo por método e resolver cada coisa separada
    public class menu
    {

        public static void main(String[] args) throws IOException // esse método é o que acontece depois que o usuário escolhe uma opção
        {

            int menuOption;

            do
            {
                menuOption = menuInteracao();

                switch (menuOption)
                {

                    case 1: // vou fazer um metodo só pra essa parte
                        option1();
                        break;

                    case 2: // vou fazer um metodo só pra essa parte
                        option2();
                        break;

                    case 3: // vou fazer um metodo só pra essa parte
                        option3();
                        break;

                    default:

                }

            } while (menuOption > 0);

            System.out.println("End of program run.");

        }

        public static int menuInteracao() // o menu para o user escolher uma opção
        {
            int option;

            Scanner menuOptions = new Scanner(System.in);

            System.out.println("Iterative menu.");

            do
            {

                System.out.println("Choose one of the options below:");
                System.out.println("1 - consult drug by name.");
                System.out.println("2 - consult drug by barcode.");
                System.out.println("3 - consult data list of tax credit concession (PIS/COFINS).");
                System.out.println("0 - Exit the program.");

                option = menuOptions.nextInt();

                if (!((option >= 0) && (option <= 3)))
                    System.out.println("Invalid option. Please try again or press 0.");

            } while ((option < 0) || (option > 3));

            return option;
        }

        public static String option1() throws IOException //para q o usuario possa digitar o nome
        {
            BufferedReader br= new BufferedReader(new FileReader("C:\\\\Users\\\\yuri_\\\\Desktop\\\\DellItAcademy\\\\TA_PRECO_MEDICAMENTO.csv"));

            String line;

            Scanner in = new Scanner (System.in);
            System.out.println("Enter the drug name: ");
            String medName;
            medName = in.nextLine();

            while((line = br.readLine()) !=null)
            {
                String[] sorted = line.split(";");

                String vnt = sorted[38] ;
                if (line.contains(medName.toUpperCase()) && vnt.equals("Sim"))
                {
                    System.out.println("Drug name: "+sorted[0]);
                    System.out.println("Product: "+sorted[8]);
                    System.out.println("Drug presentation: " +sorted[9]);
                    System.out.println("PF without tax:" +sorted[13]);
                }
            }
            return medName;
        }

        public static String option2() throws IOException // user digita barcode
        {
            BufferedReader br= new BufferedReader(new FileReader("C:\\\\Users\\\\yuri_\\\\Desktop\\\\DellItAcademy\\\\TA_PRECO_MEDICAMENTO.csv"));

            String line;

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the barcode: ");
            String barCode;
            barCode = in.nextLine();

            while((line = br.readLine()) !=null)
            {
                String[] sorted = line.split(";");

                if (line.contains(barCode))
                {
                    System.out.println("Drug name: "+sorted[0]);
                    System.out.println("CNPJ: "+sorted[1]);
                    System.out.println("LABORATORIO: "+sorted[2]);
                    System.out.println("CODIGO GGREM: "+sorted[3]);
                    System.out.println("REGISTRO: "+sorted[4]);
                    System.out.println("CÓDIGO EAN 1: "+sorted[5]);
                    System.out.println("CÓDIGO EAN 2: "+sorted[6]);
                    System.out.println("CÓDIGO EAN 3: "+sorted[7]);
                    System.out.println("PRODUTO: "+sorted[8]);
                    System.out.println("APRESENTACAO: "+sorted[9]);
                    System.out.println("CLASSE TERAPEUTICA: "+sorted[10]);
                    System.out.println("TIPO DE PRODUTO (STATUS DO PRODUTO): "+sorted[11]);
                    System.out.println("REGIME DE PRECO: "+sorted[12]);
                    System.out.println("PF Sem Impostos: "+sorted[13]);
                    System.out.println("PF 0%: "+sorted[14]);
                    System.out.println("PF 12%: "+sorted[15]);
                    System.out.println("PF 17%: "+sorted[16]);
                    System.out.println("PF 17% ALC: "+sorted[17]);
                    System.out.println("PF 17,5%: "+sorted[18]);
                    System.out.println("PF 17,5% AL: "+sorted[19]);
                    System.out.println("PF 18%: "+sorted[20]);
                    System.out.println("PF 18% ALC: "+sorted[21]);
                    System.out.println("PF 20%: "+sorted[22]);
                    System.out.println("PMC 0%: "+sorted[23]);
                    System.out.println("PMC 12%: "+sorted[24]);
                    System.out.println("PMC 17%: "+sorted[25]);
                    System.out.println("PMC 17% ALC: "+sorted[26]);
                    System.out.println("PMC 17,5%: "+sorted[27]);
                    System.out.println("PMC 17,5% ALC: "+sorted[28]);
                    System.out.println("PMC 18%: "+sorted[29]);
                    System.out.println("PMC 18% ALC: "+sorted[30]);
                    System.out.println("PMC 20%: "+sorted[31]);
                    System.out.println("RESTRICAO HOSPITALAR: "+sorted[32]);
                    System.out.println("CAP: "+sorted[33]);
                    System.out.println("CONFAZ 87: "+sorted[34]);
                    System.out.println("ICMS 0%: "+sorted[35]);
                    System.out.println("ANALISE RECURSAL: "+sorted[36]);
                    System.out.println("LISTA DE CONCESSAO DE CREDITO TRIBUTARIO (PIS/COFINS): "+sorted[37]);
                    System.out.println("COMERCIALIZACAO 2020: "+sorted[38]);
                    System.out.println("TARJA: "+sorted[39]);
                    System.out.println();

                }
                }


            return barCode;
        }

        public static String option3() // um grafico?? tabela
        {
            String graffic = "";
            return graffic;
        }
    }
