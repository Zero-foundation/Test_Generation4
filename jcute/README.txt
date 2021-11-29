jCUTE: A Test Generator for Java Programs Using Concolic Execution
===================================================================

The Java Concolic Unit Testing Engine (jCUTE) automatically generates
unit tests for Java programs.  Concolic execution combines randomized
_conc_rete execution with symb_olic_ execution and automatic
constraint solving.  Symbolic execution allows jCUTE to discern inputs
that lead down different execution paths; randomized concrete
execution helps it overcome limitations of the constraint solver, like
the inability to analyze system calls or solve general systems of
non-linear equations.  Through this combination, jCUTE is able to
generate test cases that execute _many_ differente execution paths in
_real_ Java programs.

jCUTE supports multi-threaded programs.  It can discover race
conditions and deadlocks through schedule randomization.

The jCUTE homepage is http://osl.cs.illinois.edu/software/jcute/


Publications
------------

* Koushik Sen and Gul Agha. A race-detection and flipping algorithm
  for automated testing of multi-threaded programs.  In Haifa
  Verification Conference, volume 4383 of Lecture Notes in Computer
  Science, 166--182. Springer, 2006.

* Koushik Sen and Gul Agha. CUTE and jCUTE: concolic unit testing and
  explicit path model-checking tools.  In CAV, volume 4144 of Lecture
  Notes in Computer Science, 419--423. Springer, 2006.

* Koushik Sen, Darko Marinov, and Gul Agha. CUTE: a concolic unit
  testing engine for C. In ESEC/SIGSOFT FSE, 263--272. ACM, 2005.

* Patrice Godefroid, Nils Klarlund, and Koushik Sen. DART: directed
  automated random testing. In PLDI, 213--223. ACM, 2005.



Installation
------------

jCUTE requires an installed and working Java Development Kit (JDK)
version 1.4 or later.  To run jCUTE on a 32-bit system:

* Download the binary distribution from
  http://osl.cs.illinois.edu/software/jcute/
* Unzip the archive file.
* On Linux, run the `setup` script.  Then execute the `jcutegui`
  script.
* On Windows, run the `jcutegui.bat` batch file.


### Compiling the Constraint Solving Library on Linux

jCUTE uses the `lp_solve` linear programming library for
constraint solving.  It comes with pre-compiled 32-bit versions of
this C library which it accesses via the Java Native Interface (JNI).
However, the library and the wrapper were compiled against old
standard libraries (`libstdc++5.so`) that are no longer available on
modern Linux systems.  A potential solution for this is to install an
old 32-bit Linux image into a virtual machine for running jCUTE in it.
Another solution is to compile the libraries on one's system.

#### Compiling lp_solve

* Download `lp_solve_5.1_source.tar.gz` from
  http://sourceforge.net/projects/lpsolve/files/lpsolve/5.1.1.3/
* Unzip the archive into a temporary directory.
* Change into the `lp_solve_5.1/lpsolve51/` sub-directory.
* Build `liblpsolve51.so` by executing `sh ccc`.
* Copy `liblpsolve51.so` into the jCUTE root directory.


#### Compiling the lp_solve Java Wrapper

* Download the Java wrapper source code archive
  `lp_solve_5.1_java.zip` from http://optimum2.mii.lt/lp2jdk/
* Unzip the archive into a temporary directory.
* Change to the `lib/linux/` directory and edit the file `build`:
  - Set the `LPSOLVE_DIR` variable to the path that contains
    `lp_lib.h`; this should be the `lp_solve_5.1/` directory from
    above.
  - Tell the linker where to find `liblpsolve51.so` by adding the
    command line option `-L/path/to/containing/dir/` to the second
    `g++` invocation in the `build` file.  Replace
    `/path/to/containing/dir` with the path containing
    `liblpsolve51.so`.
  - Set the `JDK_DIR` variable to your JDK root directory, for example
    `/opt/java6/` on Arch Linux.
* Run `sh build` to build `liblpsolve51j.so`.
* Copy `liblpsolve51j.so` into the jCUTE root directory.


### 64-bit Systems

The `lp_solve` library compiles and appears to work fine on 64-bit
systems.


License
-------

The jCUTE software is NOT in the public domain.  However, it is freely
available without fee for education, research, and non-profit purposes
as described in the `LICENSE` file.  The third-party libraries used by
jCUTE are licensed as described in their license files.


History
-------

jCUTE was designed and implemented by Koushik Sen around 2006.
