/open https://github.com/sormuras/bach/raw/1.1/BUILDING

run("javac", "-d", "mods", "--module-source-path=src", "--module=com.greetings,org.astro")
exe("java", "--module-path=mods", "--module", "com.greetings/com.greetings.Main")

run("jdeps", "--module-path=mods", "--add-modules=com.greetings,org.astro", "-summary")

/exit
