package Oct14;

import java.io.FileWriter;
import java.io.IOException;

class CustomerRepository
{
    private Database database;
    private Logger logger;

    public CustomerRepository(Database database)
    {
        this.database = database;
    }
    public CustomerRepository(Logger logger)
    {
        this.logger = logger;
    }

    public void Add(String CustomerName)
    {
        database.AddRow("Customer", CustomerName);
    }
}

class Database
{
    public void AddRow(String Table, String Value)
    {
        //connect to DB and insert row
    }

}

class Logger
{
    private FileWriter fileWriter;
    public Logger(){
        //initiate fileWriter
    }
    public void Log(String logType, String message)  {
        try {
            fileWriter.write(logType + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
