# Java-Client-REST

Here's an example of how the Java app works with the REST API on the Raspberry Pi
It's perhaps more complicated than it needs to be, but it's so that we can swap out dummy data for the real thing with ease.


The **static main()** is in **src/main/Runner.java**
- it is simply a testing class to go through all the calls to the server to make sure they all do what they need to

# The logic

The **AgentDB.java** class is an adapter that fits between the GUI and the database. 
You must pass it an AgentData type so that it knows what to do with the data (get it from the dummy data or the REST API)
- dummy.AgentData
- REST.AgentData

The AgentDB class has the following methods to interact with:
- Agent getAgent(int agentId)
- ArrayList<Agent> getAgentList()
- String insertAgent(Agent agent)
- String insertAgent(Agent agent)
- String deleteAgent(int agentId)

# Usage

To use this, simply instantiate the AgentDB class with an AgentData type in its constructor:
```java
AgentDB db = new AgentDB(new data.dummy.AgentData);

Agent agent = db.getAgent(1);

ArrayList<Agent> list = db.getAgentList();

String message = db.insertAgent(agent);

message = db.updateAgent(agent);

message = db.deleteAgent(1);
