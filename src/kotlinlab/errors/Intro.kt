package kotlinlab.errors

/**
 * Errors are issues in the programs and codes
 *
 * Types of errors:
 * 1. Compile time errors is is an issue that prevents a program from successfully compiling.
 * These errors can include typos, incorrect method invocations, or mismatched variable declarations. Compile-time errors are different from run-time errors, which occur after the program has compiled and is running. Compile-time errors are typically easier to identify and fix because they prevent the program from running at all. Modern IDEs with static code analyzers can help programmers spot and correct compile-time errors before attempting to compile the program. This can save time and effort in the debugging process.
 *
 * 2. Runtime errors also known as a bug, is a type of error that occurs when a program is running, as opposed to compile-time errors that are caught during the compilation process.
 * Run-time errors can cause a program to behave unexpectedly or even stop its execution. There are two kotlinlab.main subtypes of run-time errors: logic errors and unhandled exceptions. Logic errors occur when a program produces an incorrect result due to incorrect code, such as outputting hi! instead of the expected hello!. Unhandled exceptions include errors such as division by zero, file not found, and others.
 *
 *
 * Example of compile-time error
 * fun main() {
 *   printn("Hello!")
 *   }
 *
 * Static code analyzer is a tool that helps to spot compile-time errors before the program compilation.
 * Compile-time errors are typically easier to identify and fix because they prevent the program from running at all. These errors include typos and incorrect method invocations. A static code analyzer in Integrated Development Environments (IDEs) can help programmers to spot and correct compile-time errors before attempting to compile the program. This can save time and effort in the debugging process. Additionally, modern IDEs with static code analyzers can highlight warnings about more complex errors and weak places in your code, as well as provide tips on how to improve the code.
 */