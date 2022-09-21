package Social_Media_Task;

public interface hasGroups {
    /*
    Groups interface

• Create an interface hasGroups with the following actions:

 - joinGroup(String group);
 - leaveGroup(String group);

• Add a variable in Facebook to count the number of groups they are in and
implement the 2 methods from Groups interface.
 - joinGroup prints "%usersName has joined %group" and increment the total
number of groups
 - leaveGroup prints "%usersName has left %group" and decrement the total
number of groups
     */

    void joinGroup(String group);
    void leaveGroup(String group);

}
