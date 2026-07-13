# Log Parser tool

#### How to run
Run Main.java. In the terminal it first asks for a .log file destination. After that the parsing will be done. Three options will show up that you need to choose from them.
you can enter base_report, histogram or exit.

#### Key decisions
In this project I created a Report class that acts as a data holder for my final report. In main class it first asks for a destination, it creates a report object and pass it to the file parser class.
In file parser I used regex patterns to identify main parts of a line of log. Each main part is getting parsed seperately using a static method.
In those methods I preffered to use split() method which is buit-in for java Strings.

In report class I used linkedlists for storing number of requests per hour. And I used a HashMap for storing number of requests for each endpoint.

One challenge for me was to visualize a histogram. The program simply scale large numbers of requests to a number between 0 and 100. Then iterate over them and prints a star for each step.
