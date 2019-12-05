/open https://github.com/sormuras/bach/raw/1.1/BUILDING

run("javac", "-d", "mods", "--module-source-path=src", "--module=com.greetings")
exe("java", "--module-path=mods", "--module", "com.greetings/com.greetings.Main")

run("jdeps", "--module-path=mods", "--add-modules=com.greetings", "-summary")

/exit
