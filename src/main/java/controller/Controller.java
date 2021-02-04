package controller;

import webserver.HttpRequest;
import webserver.HttpResponse;

import java.io.IOException;
import java.net.URISyntaxException;

public interface Controller {
    void service(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException, URISyntaxException;
}
