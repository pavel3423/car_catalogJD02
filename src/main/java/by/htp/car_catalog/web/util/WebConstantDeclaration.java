package by.htp.car_catalog.web.util;

public class WebConstantDeclaration {
    // Request command
    public static final String REQUEST_PARAM_ACTION = "action";
    public static final String REQUEST_PARAM_USER = "user";
    public static final String REQUEST_PARAM_ALL_BRANDS = "brands";
    public static final String REQUEST_PARAM_USER_LOGIN = "login";
    public static final String REQUEST_PARAM_USER_PASSWORD = "password";
    public static final String REQUEST_PARAM_USER_EMAIL = "email";
    public static final String REQUEST_PARAM_CAR_BRAND = "brand";
    public static final String REQUEST_PARAM_CAR_MODEL = "model";
    public static final String REQUEST_PARAM_CAR_MODELS = "models";
    public static final String REQUEST_PARAM_CARS = "cars";

    public static final String REQUEST_MSG = "msg";

    // Action command
    public static final String ACTION_NAME_MAIN = "main_action";
    public static final String ACTION_NAME_LOGIN = "login_action";
    public static final String ACTION_NAME_SIGNUP = "signup_action";
    public static final String ACTION_NAME_PROFILE = "profile_action";

    // Page command
    public static final String PAGE_USER_MAIN = "/WEB-INF/page/user/main.jsp";
    public static final String PAGE_USER_LOGIN = "/WEB-INF/page/user/login.jsp";
    public static final String PAGE_USER_SIGNUP = "/WEB-INF/page/user/signup.jsp";
    public static final String PAGE_USER_PROFILE = "/WEB-INF/page/user/profile.jsp";
    public static final String PAGE_CAR_MODELS = "/WEB-INF/page/car/models.jsp";
    public static final String PAGE_CAR_VIEW = "/WEB-INF/page/car/carView.jsp";

    public static final String PAGE_USER_ERROR = "/WEB-INF/page/user/error.jsp";

    private WebConstantDeclaration() {
    }
}
