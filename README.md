# Extra Evidence Projecct
## MainLoopDemo

This program serves as a barebones demonstration for formal observation of Off-Task behaviors in a classroom setting as described by *Charles Madsen* and *Clifford Madsen* in their book *Teaching / Discipline; A Positive Approach for Educational Development. Fifth Edition*. The demonstation is made specifically for MUE 4392 as a presentation of the early stages of this program. The program's inspiration comes from *SCRIBE* (Simple Computer Recording Interface for Behavioral Evauation) developed by *Robert Duke* at the *University of Texas*. This program is open-source and does not serve as a suitable replacement for any version of SCRIBE released.

To operate program, user should select the interval time in seconds when prompted. The user will observe for set time, and will record behaviors by typing in the console either 'P' 'N' 'M' or 'O'.
- P = On Task
- N = Off Task (Noise)
- M = Off Task (Motor)
- O = Off Task (Other)
Quit the program by typing 'Q'.


---

## Requirements
- Java SE 8 or higher must be installed on machine.

---

# Installation

**Windows 11/10/8:** 
1. Download the zip file and extract.
2. Simply open the file **`MainLoopDemo.bat`**.

**Mac**
1. Download the zip file and extract.
2. Right click unzipped folder and click on open Terminal.
3. Copy and paste the following commands into terminal to run program.
~~~
javac MainLoopDemo.java
java MainLoopDemo
~~~

**Linux/Unix Systems**
1. Download zip file.
2. unzip file archive.
3. If `GNU Make` is installed, type the following command.
~~~
make run
~~~


4. If not, run the following commands.

~~~
javac MainLoopDemo.java
java MainLoopDemo
~~~



