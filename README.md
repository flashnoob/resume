# Resume

This the source code for my resume in LaTeX and also the functionality to support a cover letter.

## Build Process

In order to build the resume from source, execute the following:
```
make resume
```

## Prerequisites

There are a few prerequisites that need to be installed/configured to complete the build process:

* [Java](https://www.java.com/en/ "Duh")
* [Apache Maven](https://maven.apache.org/ "Apache Maven")
* [GNU Make](https://www.gnu.org/software/make/ "GNU Make")
* [pdflatex](http://www.math.rug.nl/~trentelman/jacob/pdflatex/pdflatex.html "pdflatex")

## Technologies Used

### Apache Maven

I use Maven to build the Java modules of the project. For more on Maven, see [here](https://maven.apache.org/ "Apache Maven")

### GNU Make

I am using a makefile to control the build process for the entire build cycle of the resume (cleaning, building from source, converting to 
a PDF). For more info on makefiles, check [here](https://www.gnu.org/software/make/ "GNU Make").

### The Jackson Project

The Jackson Project is used to parse JSON (and XML) data and bind it to POJO Resume objects to de-couple the data and its implementation. 
For more information on the Jackson Project see [here](https://github.com/FasterXML/jackson "The Jackson Project") 

### Project Lombok

Project Lombok is a build tool used to reduce boilerplate code in java, see here [here](https://projectlombok.org/ "Project Lombok"). I'm a 
little iffy on if I should use it because it requires a plugin for IntelliJ to prevent my IDE from yelling at me. But for now, it's part of 
the project.

### The LaTeX Project

LaTeX is a document preparation system that uses plain text and translates into formatted text, see 
[here](https://www.latex-project.org/ "The LaTex Project"). This way I can build the resume PDF programmatically, and have the implementation be independent of the resume itself.

To be transparent, the LaTeX modules included in this project are largely ripped (all credit due) from here
[here](https://www.sharelatex.com/templates/cv-or-resume?&nocdn=true "ShareLaTeX").
