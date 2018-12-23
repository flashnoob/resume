##
# makefile
##
# John Van Note
# 2016-01-09
##
# Makefile for my resume and cover letter latex
##

# variables
resume_name=JohnVanNoteResume
resume_src=./out/$(resume_name)
resume_target=$(resume_name)
build=pdflatex

clean :
	mvn clean

compile : clean
	mvn compile

run : compile
	mvn exec:java -Dexec.mainClass="com.jvn.Main"

resume : run
	$(build) $(resume_src).tex

view : resume
	open $(resume_target).pdf
