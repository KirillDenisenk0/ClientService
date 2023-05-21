package lesson_13;

import java.util.Objects;

public class Client {

    private int numberOfClient;
    private String nameOfClient;


    public Client(int numberOfClient, String nameOfClient) {
        this.nameOfClient = nameOfClient;
        this.numberOfClient = numberOfClient;
    }

    public Client(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nameOfClient, client.nameOfClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfClient);
    }

    @Override
    public String toString() {
        return nameOfClient;
    }

    public int getNumberOfClient() {
        return numberOfClient;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }
}
