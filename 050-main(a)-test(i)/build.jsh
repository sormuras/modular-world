/open https://github.com/sormuras/bach/raw/1.1/BUILDING

get("lib", "org.junit.jupiter", "junit-jupiter-api", "5.5.1")
get("lib", "org.junit.platform", "junit-platform-commons", "1.5.1")
get("lib", "org.apiguardian", "apiguardian-api", "1.1.0")
get("lib", "org.opentest4j", "opentest4j", "1.2.0")

var sourcePath = String.join(File.pathSeparator, "src/*/main/java", "src/*/test/java")
var modulePath = String.join(File.pathSeparator, "bin", "lib")

run("javac", "--module=a,i", "--module-path=lib", "--module-source-path=" + sourcePath, "-d", "bin")
run("jdeps", "--add-modules=a,i", "--module-path=" + modulePath, "--multi-release=base", "-summary")
run("jdeps", "--check=a,i", "--module-path=" + modulePath, "--multi-release=base")

/exit
