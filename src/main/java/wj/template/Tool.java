package wj.template;

import wj.template.loader.MultiFileResourceLoader;

import java.io.StringWriter;
import java.util.*;

public class Tool {
    public static void main(String[] args) {
        //1. 创建一个默认的 JetEngine
        TemplateEngine templateEngine = TemplateEngine.create();

//        String[] filepaths = {"E:/Users/Administrator/Documents/MyTemplate/src/main/resources",
//                              "E:/Users/Administrator/Documents/MyTemplate/src/main/java"};
//        MultiFileResourceLoader multiFileResourceLoader
//                = new MultiFileResourceLoader(filepaths);
//        templateEngine.setTemplateLoaders(multiFileResourceLoader);

        //2. 获取一个模板对象 (从默认的 classpath 下面)
        Template template = templateEngine.getTemplate("users.jetx");
        //3. 创建 context 对象
        Map<String, Object> context = new HashMap<String, Object>();
        User user = new User("张三", "zhangsan@qq.com");
        context.put("user", user);
        context.put("test", "test");

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("HELLO WORLD", null));
        books.add(new Book("Sello java", new Date()));
        user.setBooks(books);
        //4. 渲染模板到自定义的 Writer
        StringWriter writer = new StringWriter();
        template.render(context, writer);
        // 5. 打印结果
        System.out.println(writer.toString());
    }
}
