<h2>TestNG?</h2>


TestNG是一款为Java编程语言设计的测试框架，灵感来自于JUnit和NUnit。
TestNG是一个开源自动化测试框架;TestNG表示下一代
TestNG的主要功能是覆盖范围更广的测试分类，如单元、功能性、端到端，一体化等。
它还有一些新的功能，可以使之更强大和更容易使用，如：注解、具备大型线程池各种策略的运行测试、多线程的代码测试、灵活的测试配置、参数化数据驱动的测试支持，等等。
TestNG支持各种各样的工具和插件，比如Eclipse、IDEA、Maven等等。


<h3>TestNG maven依赖配置</h3>
```
<dependency>
```
```
 <groupId>org.testng</groupId>
```
```
  <artifactId>testng</artifactId>
```
```
  <version>6.8</version>
```
```
  <scope>test</scope>
```
```
</dependency>
```

TestNG的基本注解<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   注解	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      描述<br/>
@BeforeSuite	注解的方法将只运行一次,运行所有测试前此套件中。<br/>
@AfterSuite	注解的方法将只运行一次此套件中的所有测试都运行之后。<br/>
@BeforeClass	注解的方法将只运行一次先行先试在当前类中的方法调用。<br/>
@AfterClass	注解的方法将只运行一次后已经运行在当前类中的所有测试方法。<br/>
@BeforeTest	注解的方法将被运行之前的任何测试方法属于内部类的 <test>标签的运行。<br/>
@AfterTest	注解的方法将被运行后,所有的测试方法,属于内部类的<test>标签的运行。<br/>
@BeforeGroups	组的列表,这种配置方法将之前运行。此方法是保证在运行属于任何这些组第一个测试方法,该方法被调用。<br/>
@AfterGroups	组的名单,这种配置方法后,将运行。此方法是保证运行后不久,最后的测试方法,该方法属于任何这些组被调用。<br/>
@BeforeMethod	注解的方法将每个测试方法之前运行。<br/>
@AfterMethod	被注释的方法将被运行后,每个测试方法。<br/>
@DataProvider	标志着一个方法,提供数据的一个测试方法。注解的方法必须返回一个Object[] [],其中每个对象[]的测试方法的参数列表中可以分配。 该@Test 方法,希望从这个DataProvider的接收数据,需要使用一个dataProvider名称等于这个注解的名字。<br/>
@Factory	作为一个工厂,返回TestNG的测试类的对象将被用于标记的方法。该方法必须返回Object[]。<br/>
@Listeners	定义一个测试类的监听器。<br/>
@Parameters	介绍如何将参数传递给@Test方法。<br/>
@Test	标记一个类或方法作为测试的一部分。<br/>

<h3>TestNG基本用法</h3>
TestNG中如何执行测试？<br/>
1，在java中执行测试方法<br/>
2，执行xml文件 把要执行的case, 放入testng.xml文件中。 右键点击testng.xml,   点Run As


1，了解注解的用法和执行顺序<br/>
测试用例：执行testngAnnotation.xml 这个类<br/>
除了 @Test 注解，TestNG 还有两对常用的注解：@BeforeClass/@AfterClass 和 @BeforeMethod/@AfterMethod<br/>
@BeforeMethod/@AfterMethod 是在 @Test 注解函数执行之前/之后执行的钩子函数。在执行每一个 @Test 注解函数执行之前/之后都会执行 @BeforeMethod/@AfterMethod 注解函数。

@BeforeClass/@AfterClass 的作用和 @BeforeMethod/@AfterMethod 类似，不同的是，@BeforeClass/@AfterClass 是在初始化类的时候执行，这就意味着 @BeforeClass/@AfterClass 只会执行一次，而 @BeforeMethod/@AfterMethod 执行次数和 @Test 注解函数个数一样。

2，普通的单元测试<br/>
测试用例：AppTest<br/>
超时测试（应用场景，请求elk数据关于时长）<br/>
在 @Test 注解中添加 timeOut 参数就可以进行超时测试，@Test(timeOut=10) 
表示测试方法的运行时间应该低于 10ms，如果超时者测试失败。超时测试对于网络连接类的测试相当有用<br/>
异常测试<br/>
异常测试用于测试方法是否有抛出异常，通过 @Test(expected=NullPointerException.class) 来指定方法必须抛出 NullPointerException，如果没有抛出异常或者抛出其他异常则测试失败。

<h3>TestNG特有用法</h3>
二、 TestNG优于JUnit的设计详解

**先了解Testng.xml配置文件结构**

1.分组测试 

将测试方法按照组的方式来测试，一个类里面的部分方法测试

测试用例：groupTestng.xml

组中组

测试用例：groupTestngMetaExcludeGroups.xml

排斥组

可以忽略一个组使用<exclude>标签
测试用例：groupTestngMetaGroups.xml

2.参数化测试

所谓参数化测试就是为测试用例提供参数数据

在大多数情况下，你会遇到这样一个场景，业务逻辑需要一个巨大的不同数量的测试。参数测试，允许开发人员运行同样的测试，一遍又一遍使用不同的值。
TestNG让你直接传递参数测试方法两种不同的方式：

1，使用testng.xml
2，数据提供程序

**传递参数使用testng.xml**

有了这种技术，在testng.xml文件中定义的简单参数，然后在源文件中引用这些参数。让我们看看下面的例子中如何使用这种技术来传递参数。

测试用例：parameterTestng.xml
**
TestNG 对testng.xml 的参数的类型指定的值会自动尝试转换。下面是支持的类型**：

String<br/>
int/Integer<br/>
boolean/Boolean<br/>
byte/Byte<br/>
char/Character<br/>
double/Double<br/>
float/Float<br/>
long/Long<br/>
short/Short<br/>

 **传递参数与数据提供者**

当你需要通过复杂的参数或参数需要创建从Java（复杂的对象，对象读取属性文件或数据库等..），在这种情况下，可以将参数传递使用数据提供者。数据提供者@DataProvider的批注的方法。这个注解只有一个字符串属性：它的名字。如果不提供名称，数据提供者的名称会自动默认方法的名称。数据提供者返回一个对象数组。
让我们看看下面的例子使用数据提供者。

第一个例子是@DataProvider的使用Vector，String或Integer 作为参数，

实例 1在这里 @DataProvider 通过整数和布尔参数。

测试用例：parameterTestngprovider1.xml

第二个例子是关于@DataProvider 的使用对象作为参数。

parameterTestngprovider2.xml


end-------------------------------------------------------------------------------------------------------------

3.依赖测试

当两个测试用例之间存在依赖关系,TestNG支持你使用注解l指定依赖关系

4.多线程测试

并发测试一直是测试的难点,TestNG提供了一套多线程执行测试用例的的方案,给并发测试带来了很大的方便。

5.按优先级顺序测试

@Test 提供了一个很有用的priority属性来指定测试用例执行的优先级,数值越低,优先级越高。这个在测试流程的时候很有用!


**不知道从哪看到的一句话**
<h3>你知道所有bug的共同点吗？那就是它们通过了所有的测试。所以，当你找到一个bug的时候，就等于知道测试哪里还需要改进</h3>

