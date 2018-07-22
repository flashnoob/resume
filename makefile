##
# makefile
##
# John Van Note
# 2016-01-09
##
# Makefile for my resume and cover letter latex
##

# variables
me=John_Van_Note
resume_doc=$(me)_Resume
letter_doc=$(me)_Cover_Letter
build=pdflatex

resume :
	$(build) $(resume_doc).tex

view : resume
	open $(resume_doc).pdf
