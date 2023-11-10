set projectLocation=D:\Testwork space\TestNg\
cd %projectLocations
set classpath=%projectLocations%\bin;%projectLocations%\lib\*
java org.testng.TestNg %projectLocations%\testing.xml