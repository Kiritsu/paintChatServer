package paintChatServer;

import paintChatServer.enums.LogLevel;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * This class represents a server that will accept clients and broadcast packets all over the different clients.
 * @author Allan Mercou, Mathieu Lagnel, Gabriel Cousin
 * @version 1.0
 */
public class Server {
    /**
     * Represents the list of every client.
     */
    private ArrayList<Socket> clients;

    /**
     * ServerSocket that will handle client's connections and sending/receiving packets.
     */
    private ServerSocket serverSocket;

    /**
     * Service that will handle client's connection.
     */
    private ClientAcceptorService clientAcceptorService;

    /**
     * Service that will handle client's timeout.
     */
    private ClientTimeoutService clientTimeoutService;

    /**
     * Indicates whether the server must be stopped.
     */
    private boolean quitRequested;

    /**
     * IPAddress of the server. (doesn't really matter because we're running under localhost)
     */
    private String address;

    /**
     * Port of the server.
     */
    private short port;

    /**
     * Creates a new server.
     * @param address Address of the server.
     * @param port Port of the server.
     * @throws IOException If an I/O error occurs when creating the socket.
     */
    public Server(String address, short port) throws IOException {
        this.clients = new ArrayList<>();
        this.clientAcceptorService = new ClientAcceptorService(this);
        this.clientTimeoutService = new ClientTimeoutService(this);

        this.quitRequested = false;

        this.address = address;
        this.port = port;

        this.serverSocket = new ServerSocket(this.port);

        Logger.println(LogLevel.Info, "paintChatServer.Server", "paintChatServer.Server initialized.");
    }

    /**
     * Starts the server and starts the different services.
     * @throws IOException If an I/O error occurs when listening.
     */
    public void startServer() throws IOException {
        this.clientAcceptorService.start();
        this.clientTimeoutService.start();

        Logger.println(LogLevel.Info, "paintChatServer.Server", "paintChatServer.Server started.");
    }

    /**
     * Adds a client to our list of clients.
     * @param client Instance of a client.
     */
    public void addClient(Socket client) {
        if (!this.clients.contains(client)) {
            this.clients.add(client);

            Logger.println(LogLevel.Debug, "paintChatServer.Server",
                    "A client has been added.");
        } else {
            Logger.println(LogLevel.Error, "paintChatServer.Server",
                    "Unable to add a client to the ArrayList because it already contains it. (shouldn't happen.)");
        }
    }

    public void broadcastPacket() {

    }

    /**
     * Returns the different clients.
     */
    public ArrayList<Socket> getClients() {
        return this.clients;
    }

    /**
     * Updates our list of clients to only keep connected and active sockets.
     */
    public void updateClients(ArrayList<Socket> clients) {
        this.clients = new ArrayList<>(clients);
    }

    /**
     * Returns the server socket.
     */
    public ServerSocket getServerSocket() {
        return this.serverSocket;
    }

    /**
     * Indicates if cancellation is requested.
     */
    public boolean isQuitRequested() {
        return this.quitRequested;
    }

    /**
     * Gets a String representation of the current server.
     */
    @Override
    public String toString() {
        return "paintChatServer.Server bound to " + address + ":" + port + " | " + clients.size() + " clients connected.";
    }

    public static void main(String[] args) throws IOException {
        new Server("localhost", (short) 8000).startServer();
    }
}