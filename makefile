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
resume=$(me)-Resume
letter=$(me)-Cover-Letter
build=pdflatex

buildresume :
	$(build) $(resume).tex

view : buildresume
	open $(resume).pdf
