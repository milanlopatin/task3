
import ru.dexsys.database.operations.DatabaseOperations;

import java.io.IOException;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        //DatabaseOperations.createStudentsTable();
        //DatabaseOperations.fillStudentsTable();
        DatabaseOperations.showStudentsTable();
    }
}
