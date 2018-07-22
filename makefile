##
# makefile
##
# John Van Note
# 2016-01-09
##
# Makefile for my resume and cover letter latex
##

# variables
me=John-Van-Note
resume_doc=$(me)-Resume
letter_doc=$(me)-Cover-Letter
build=pdflatex

resume :
	$(build) $(resume_doc).tex

view : buildresume
	open $(resume_doc).pdf
