public class List {
    No start;
    int listSize;

    public void insert(Contact info){
        No no = new No();
        no.info = info;
        no.next = start;
        start = no;
        listSize++;
    }

    public Contact search(int code){
        No no = start;
        while (no != null){
            if(no.info.code == code){
                return no.info;
            }
            no = no.next;
        }
        return null;
    }

    public Contact delete(int code){
        No no = start;
        while (no != null){
            if(no.info.code == code){
                Contact newNo = new Contact("", "", "", "", "");
                no.info = newNo;
                return no.info;
            }
            no = no.next;
        }
        return null;
    }


    public String toString(){
        String out = "";
        No no = start;
        while(no != null){
            out += no.info + " ";
            no = no.next;
        }
        return out;
    }
}
