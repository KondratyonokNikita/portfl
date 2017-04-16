package com.portfl.constants;

/**
 * Created by Vlad on 06.03.17.
 */
public class Constants {

    public static final class cloud {
        public static final String CLOUD_PUBLIC_ID = "public_id";
        public static final String CLOUD_FILE = "temp.jpg";
        public static final String CLOUD_NAME = "cloud_name";
        public static final String CLOUD_API_KEY="api_key";
        public static final String CLOUD_API_SECRET="api_secret";
    }

    public static final class Views {
        public static final String HOME_PAGE = "home";
        public static final String LOGIN_PAGE = "login";
        public static final String REGISTRATION_PAGE = "registration";
        public static final String PROFILE_PAGE="profile";
        public static final String PHOTO_PAGE="photo";
    }

    public static final class Redirect {
        public static final String TO_HOME = "redirect:/";
    }

    public static final class Packages {
        public static final String CONTROLLERS = "com.pashkevich.app.web.controller";
        public static final String SERVICES = "com.pashkevich.app.service";
        public static final String DAO = "com.pashkevich.app.dao";
        public static final String LISTENERS = "com.pashkevich.app.listeners";
    }

    public static final class Regex {
        public static final String FIRST_NAME = "([A-Z]{1}[a-z]{1,10})|([А-Я]{1}[а-я]{1,10})";
        public static final String LAST_NAME = "([A-Z]{1}[a-z]{1,10})|([А-Я]{1}[а-я]{1,10})";
        public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        public static final String PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        public static final String USERNAME = "([a-z]{4,10})";
    }

    public static final class Common {
        public static final int ONE = 1;
        public static final String EMPTY = "";
    }

}
