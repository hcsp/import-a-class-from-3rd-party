# Java程序的基本结构练习：引用第三方包中的类

[我们的程序](https://github.com/hcsp/import-a-class-from-3rd-party/blob/master/src/main/java/com/github/hcsp/Main.java)中引用了一个第三方包中的类`org.apache.commons.lang3.StringUtils`。请在[`pom.xml`](https://github.com/hcsp/import-a-class-from-3rd-party/blob/master/pom.xml)中添加适当的包声明，
使得程序不再报错。在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn test`)

现在我们在`com.github.hcsp/pet1`包中和``com.github.hcsp/pet2`包中都存在一个名为`Cat`的类。请在[`Home`这个类](https://github.com/hcsp/import-a-class-from-3rd-party/blob/master/pom.xml)中同时引用这两个`Cat`类。在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn test`)

我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [pom.xml](https://github.com/hcsp/import-a-class-from-3rd-party/blob/master/pom.xml)


敬请期待写代码啦的课程

敬请期待
