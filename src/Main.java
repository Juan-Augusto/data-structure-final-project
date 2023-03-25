import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menuDisplay;
        int selectHashOption, iterator, allItems;
        System.out.println("Selecione quantos itens você deseja ter na sua lista: ");
        Scanner itemsQuantity = new Scanner(System.in);
        allItems = itemsQuantity.nextInt();
        iterator = 0;
        Hash hash = new Hash(allItems);

        menuDisplay = "------------------------------\n" +
                "|           Agenda            |\n" +
                "------------------------------\n" +
                "|   1 -  Inserir dado        |\n"+
                "|   2 -  Listar dados        |\n"+
                "|   3 -  Pesquisar dado      |\n"+
                "|   4 -  Excluir dado        |\n"+
                "|   5 -  Encerrar            |\n"+
                "------------------------------\n"+
                "Selecione uma opção: ";



        System.out.println(menuDisplay);

        Scanner optionReader = new Scanner(System.in);
        selectHashOption = optionReader.nextInt();
        while(selectHashOption != 5){
            if(selectHashOption == 1){
                if(iterator < allItems){
                System.out.println("Insira o nome: ");
                Scanner userInput = new Scanner(System.in);
                String currentName;
                currentName = userInput.next();

                System.out.println("Insira o telefone: ");
                Scanner phoneNumberInput = new Scanner(System.in);
                String currentPhoneNumber;
                currentPhoneNumber = phoneNumberInput.next();

                System.out.println("Insira a data de nascimento: ");
                Scanner birthDateInput = new Scanner(System.in);
                String currentBirthDate;
                currentBirthDate = birthDateInput.next();

                System.out.println("Insira o email: ");
                Scanner emailInput = new Scanner(System.in);
                String currentEmail;
                currentEmail = emailInput.next();

                System.out.println("Insira o celular: ");
                Scanner cellphoneNumberInput = new Scanner(System.in);
                String currentCellphoneNumber;
                currentCellphoneNumber = cellphoneNumberInput.next();

                hash.insert(new Contact(
                        currentName.toLowerCase(),
                        currentPhoneNumber,
                        currentBirthDate,
                        currentEmail,
                        currentCellphoneNumber
                ));
                iterator++;
                }else{
                    System.out.println("Impossível adicionar mais itens do que a quantidade selecionada.");
                }
            } else if (selectHashOption == 2) {
                System.out.println(hash);
            } else if (selectHashOption == 3) {
                Contact searchResult;
                System.out.println("Digite o nome que você quer pesquisar: ");
                Scanner searchNameInput = new Scanner(System.in);
                searchResult = hash.search(searchNameInput.next());
                System.out.println("Resultado da sua pesquisa: " + searchResult);
            }else if(selectHashOption == 4){
                String deleteResult;
                System.out.println("Digite o nome que você quer pesquisar: ");
                Scanner deleteNameInput = new Scanner(System.in);
                deleteResult = deleteNameInput.next();
                hash.delete(deleteResult);
                System.out.println("Deletado: " + hash);
            }else{
                System.out.println("Opção inválida");
            }
            System.out.println(menuDisplay);
            selectHashOption =  optionReader.nextInt();
        }

    }
}