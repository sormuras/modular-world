/open https://github.com/sormuras/bach/raw/1.1/BUILDING

run("javac", "-d", "bin/java-8/a", "--release=8", "src/main/a/java-8/a/A.java", "src/main/a/java-8/a/Main.java")
run("javac", "-d", "bin/java-9", "--release=9", "--module-source-path=src/main/*/java-9", "--patch-module=a=bin/java-8/a", "--module=a")
run("javac", "-d", "bin/java-11", "--release=11", "--module-source-path=src/main/*/java-11", "--patch-module=a=bin/java-8/a", "--module=a")

run("jar", "--verbose", "--create", "--file=bin/a.jar", "-C", "bin/java-8/a", ".", "--release", "9", "-C", "bin/java-9/a", ".", "--release", "11", "-C", "bin/java-11/a", ".")
run("jar", "--describe-module", "--file=bin/a.jar", "--release", "999")

run("jdeps", "--add-modules=a", "--module-path=bin", "--multi-release=999", "-summary")
run("jdeps", "--module-path=bin", "--multi-release=999", "--check=a")

/exit
