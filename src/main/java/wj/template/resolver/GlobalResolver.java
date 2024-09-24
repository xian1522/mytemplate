package wj.template.resolver;

public class GlobalResolver {

    private MethodInvokerResolver methodInvokerResolver;

    public GlobalResolver() {
        this.methodInvokerResolver = new MethodInvokerResolver();
    }

   public void registerMethods(Class<?> cls) {
        methodInvokerResolver.registerMethods(cls);
   }

    public MethodInvokerResolver getMethodInvokerResolver() {
        return methodInvokerResolver;
    }
}
