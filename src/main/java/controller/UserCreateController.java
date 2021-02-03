package controller;

import db.DataBase;
import model.User;
import utils.FileIoUtils;
import utils.IOUtils;
import webserver.HttpRequest;
import webserver.HttpResponse;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class UserCreateController extends AbstractController {
    private static final String INDEX_URL = "/index.html";

    @Override
    public void doPost(HttpRequest httpRequest, HttpResponse httpResponse) {
        User user = new User(
                httpRequest.getParameter("userId"),
                httpRequest.getParameter("password"),
                httpRequest.getParameter("name"),
                httpRequest.getParameter("email")
        );
        DataBase.addUser(user);
        httpResponse.sendRedirect(INDEX_URL);
    }
}
