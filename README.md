# modular-world
Collection of modular Java projects

## build and check

For each project...

1. Launch your build tool to compile all modular jars.
2. Run `jdeps --module-path ${HERE BE MODULES} --add-modules=ALL-MODULE-PATH --multi-release base -summary`
3. Compare the output of the former `jdeps` run with the `jdeps-summary.txt` stored per project.
