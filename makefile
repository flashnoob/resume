##
# makefile
##
# John Van Note
# 2016-01-09
##
# Makefile for my resume and cover letter latex
##

# variables
resume_src=./out/JohnVanNoteResume
build=pdflatex

resume :
	$(build) $(resume_src).tex

view : resume
	open $(resume_doc).pdf
