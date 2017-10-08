# useBeanIO
How to use BeanIO to read fixed length file

# Sample fixed format file 
Fixed format Borehole data can be found at the following link.

https://www.data.boem.gov/Well/Files/5010.zip

Details of the file is given at the following link.

https://www.data.boem.gov/Main/HtmlPage.aspx?page=borehole

# Purpose
To demonstrate the use of BeanIO to parse fixed format file

# POM 
Search the maven repository for the latest BeanIO and use in the pom file

<!-- https://mvnrepository.com/artifact/org.beanio/beanio -->
<dependency>
    <groupId>org.beanio</groupId>
    <artifactId>beanio</artifactId>
    <version>2.1.0</version>
</dependency>


# Steps
- create Borehole bean
- create mapping file : Borehole.xml
- Handle bad data ("some of the numeric fields have # as place holder, since it is a fixed format file)
- use BeanReader 
