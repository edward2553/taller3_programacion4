import java.util.ArrayList;

public class TestPerson {
    public void savePerson(Person person, ArrayList<Person> arrPerson){
        arrPerson.add(person);
    }
    public void showErrorWhileWroteEmail(ArrayList<Person> arrPerson){
        System.out.println();
        System.out.println("Porcentaje de personas que se equivocaron al escribir el correo");
        int cont = 0;
        for (int i = 0; i < arrPerson.size(); i++){
            if(arrPerson.get(i).getEmailWroteError()){
                cont++;
            }
        }
        System.out.println(cont);
        System.out.println("El porcentaje es: " + cont * 100 / arrPerson.size() + "%");
    }

    public void showPersonWithDocumentTypeCEAndPas(ArrayList<Person> arrPerson){
        System.out.println();
        System.out.println("Cantidad de personas que tienen como tipo de documento cedula de extranjeria y pasaporte");
        int contCedExt = 0;
        int contPas = 0;
        for (int i = 0; i < arrPerson.size(); i++){
            if(arrPerson.get(i).getDocumentType().equals("Cedula de extranjeria")){
                contCedExt++;
            }
            if(arrPerson.get(i).getDocumentType().equals("Pasaporte")){
                contPas++;
            }
        }

        System.out.println("La cantidad de personas que tienen como tipo de documento cedula de extranjeria son: "+ contCedExt);
        System.out.println("La cantidad de personas que tienen como tipo de documento pasaporte son: "+ contPas);
    }

    public void showPromNationaOther(ArrayList<Person> arrPerson){
        System.out.println();
        System.out.println("Porcentaje de personas tienen como nacionalidad otro");
        int cont = 0;
        for (int i = 0; i < arrPerson.size(); i++){
            if(arrPerson.get(i).getNacionality().equals("Otro")){
                cont++;
            }
        }
        System.out.println("El porcentaje es: " + cont * 100 / arrPerson.size() + "%");
    }
}
