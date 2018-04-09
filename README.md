# Simple Csv Converter


Application that convert any CSV file into desired format and print it to console. It MUST support following output formats: JSON,XML and Table.

Here you can find possible scenarios of running complete application:

> java -jar app.jar  
> App should exit and display message "No input file defined"

> java -jar app.jar file.csv  
> App should display data from given file in table (default output format)

> java -jar app.jar json file.csv  
> App should display data from given file as JSON

> java -jar app.jar xml file.csv  
> App should display data from given file as XML

As you can see, if only one argument is passed to application then it's path to CSV file. When there are two (or more arguments) then the first one is output format and the second one path to CSV file.
If no format is specified, table is default output format.
