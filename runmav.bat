set projectLocation=C:\Automation\Mav1\Maven1
 
cd %projectLocation%
 
set classpath=%projectLocation%\target\classes\page;%projectLocation%\lib\*;%projectLocation%\src\main\java\page\
 
java org.testng.TestNG %projectLocation%\testng.xml

pause
 