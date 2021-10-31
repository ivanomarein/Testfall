package user;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {


    //Skapa ett test för en tänkt klass User autogenerera klassen ifrån testklassen

    //Uppdatera testen så att User har följande attribut: userName, password

    @Test
    public void testCreateUser() {

        //Arrange

        String userName = "Staff";
        String password = "qwerty123";

        User myUser = new User(userName, password);


        //Act


        //Assert


    }


    //Skriv test som hämtar att userName

    @Test
    public void testGetUserNameStaff() {

        //Arrange

        String userName = "Staff";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        String actual = myUser.getUserName();

        //Assert
        String expected = "Staff";

        assertEquals(expected, actual);

    }

    @Test
    public void testGetUserNameAberg() {

        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        String actual = myUser.getUserName();

        //Assert
        String expected = "Aberg";

        assertEquals(expected, actual);

    }


    @Test
    public void testChangeUserName() {

        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updateUserName("Staff");

        String actual = myUser.getUserName();

        //Assert
        String expected = "Staff";

        assertEquals(expected, actual);

    }


    @Test
    public void testChangeUserName3Characters() {

        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updateUserName("Hej");

        String actual = myUser.getUserName();

        //Assert
        String expected = "Aberg";

        assertEquals(expected, actual);

    }

    @Test
    public void testChangeUserName4Characters() {

        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updateUserName("abcd");

        String actual = myUser.getUserName();

        //Assert
        String expected = "abcd";

        assertEquals(expected, actual);

    }

    @Test
    public void testChangePassword() {
        //Skriv test som gör det möjligt att uppdatera lösenordet.
        //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt
        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updatePassword("321ytrewq");

        String actual = myUser.getPassword();

        //Assert
        String expected = "321ytrewq";

        assertEquals(expected, actual);

    }


    @Test
    public void testChangePasswordShortPassword() {
        //Skriv test som gör det möjligt att uppdatera lösenordet.
        //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt
        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updatePassword("qwerty");

        String actual = myUser.getPassword();

        //Assert
        String expected = "qwerty123";

        assertEquals(expected, actual);

    }

    @Test
    public void testChangePasswordLongPassword() {
        //Skriv test som gör det möjligt att uppdatera lösenordet.
        //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt
        //Arrange

        String userName = "Aberg";
        String password = "qwerty123";

        User myUser = new User(userName, password);

        //Act
        myUser.updatePassword("123456789012345678901");

        String actual = myUser.getPassword();

        //Assert
        String expected = "qwerty123";

        assertEquals(expected, actual);

    }













}
