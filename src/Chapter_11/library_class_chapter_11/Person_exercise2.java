package Chapter_11.library_class_chapter_11;

/**
 * Created by bnamora on 2/27/17.
 */
public class Person_exercise2 {
        private String name;
        private String address;
        private String phoneNumber;
        private String email;

        public Person_exercise2(){
        }

        public Person_exercise2(String name, String address, String phoneNumber, String email){
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName(){
            return name;
        }

        public String getAddress(){
            return address;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }

        public String getEmail(){
            return email;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email){
            this.email = email;
        }

        @Override
        public String toString(){
            return "name is "+name+" class Person";
        }
}
