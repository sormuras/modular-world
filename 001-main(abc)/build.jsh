/open https://github.com/sormuras/bach/raw/1.1/BUILDING

run("javac", "-d", "bin", "--module-source-path=src/main", "--module=a,b,c")
run("jdeps", "--module-path=bin", "--add-modules=a,b,c", "-summary")

/exit
