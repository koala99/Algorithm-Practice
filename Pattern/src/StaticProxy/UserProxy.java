package StaticProxy;

public class UserProxy implements IUser {
    private IUser user = new UserImpl();

    @Override
    public void eat(String s) {
        System.out.println("静态代理前置内容");
        user.eat(s);
        System.out.println("静态代理后置内容");
    }
}