public class Author {
    String name;
    String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName(String name) {

        return name;
    }


    public String getSurname(String surname) {

        return surname;
    }


    public String fullName() {

        return name + " " + surname;
    }
    public String toString(){
        return this.name + " " + this.surname;
        }
        public boolean equals (ObJect 0){
        if (this == 0){
            return true;
        }
        if (0 == null || getClass() !=0 getClass()){
            return false;
            }
        Author author = (Author) 0;
        return Objects.equals (name, author name && objects.equals (surname, author.surname));
        }
}

        public int hashCode() {
            return objects.hash(name, surname);
        }
}
public Author[]removeDuplicates (Author [] author){
        Author[]result=new Author[author.length];
        int k=0;
        for(int i=0;i<author.length;i++){
        boolean duplicateFound=false;
        for(int j=i+1;j<authors.length;j++){
        if(authors[i].equals(authors[j])){
        }
        duplicateFound=true;
        break;
        }
        if(!duplicateFound){
        }
        result
        }[k]=authors[i];
        k++;
        }

        return result;

        int null||count = 0;
        for (Author author: result){
        if (author == null){
        }
        nullCount +=1;
        }
        }

