/open https://github.com/sormuras/bach/raw/master/BUILDING

run("javac", "-d", "bin", "--module-source-path=src/main", "--module=a,b,c")
run("jdeps", "--module-path=bin", "--add-modules=ALL-MODULE-PATH", "--multi-release=base", "-summary")

/exit
