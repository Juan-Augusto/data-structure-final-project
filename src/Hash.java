public class Hash {
    int operator;
    List[] vetor;

    public List[] getVetor() {
        return vetor;
    }

    Hash(int operator){
        this.operator = operator;
        vetor = new List[operator];
        for(int i = 0; i < operator; i++){
            vetor[i] = new List();
        }
    }

    void insert(Contact contact){
        int key = contact.code % operator;
        vetor[key].insert(contact);
    }

    Contact search(String name){
        int code;
        code = Contact.stringToNumber(name);
        return  vetor[code % operator].search(code);
    }

    Contact delete(String name){
        int code;
        code = Contact.stringToNumber(name);
        return vetor[code % operator].delete(code);
    }


    public String toString(){
        String out = "";
        for (int i = 0; i < operator; i++){
            out += "" + i + ": ";
            out += vetor[i % operator] + "\n";
        }
        return out;
    }




}
