##
# makefile
##
# John Van Note
# 2016-01-09
##
# Makefile for my resume latex
##

.SILENT: clean compile run resume view

resume_name=JohnVanNoteResume
resume_src=./out/$(resume_name).tex
resume_target=$(resume_name).pdf
build_pdf=pdflatex
mvn=mvn -q

clean :
	echo "Cleaning up"
	$(mvn) clean

compile : clean
	echo "Compiling from source"
	$(mvn) compile

run : compile
	echo "Building Resume"
	$(mvn) exec:java -Dexec.mainClass="com.jvn.Main"

resume : run
	echo "Converting $(resume_src) to PDF"
	$(build_pdf) $(resume_src) > /dev/null

view : resume
	echo "Opening $(resume_target)"
	open $(resume_target)
