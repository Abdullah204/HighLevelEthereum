import Contracts.Contract;
import Methods.Event;
import Steps.FireEvent;
import Variables.EventInteger;
import Variables.EventVariable;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestContract  {
    Uint value = new Uint(7);
    Event valueSet = new Event("ValueSet", new EventVariable[]{new EventInteger("val", false, 7, false)});

    public TestContract() throws Exception {
    }

//    public TestContract(String contractName) throws Exception {
//        super(contractName);
//    }

    public void setValue(Uint val) {
        value = val;
        new FireEvent("valueSet", new String[]{"value"});
    }

    public Uint getValue() {
        return value;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IOException {
//        Class<?> clazz = TestContract.class;
//        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
//        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
//        File file = new File("src/main/java/TestContract.java");
//        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjects(file);
//        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, compilationUnits);
//        task.call();
//        ClassReader reader = new ClassReader("TestContract");
//        ClassNode classNode = new ClassNode();
//        reader.accept(classNode, 0);
////        MethodNode methodNode = null;
//        for (MethodNode method : classNode.methods) {
//            // create a StringWriter and a PrintWriter to collect the text output
//            if(method==null) continue;
//            System.out.println(method);
//            StringWriter stringWriter = new StringWriter();
//            PrintWriter printWriter = new PrintWriter(stringWriter);
//
//// create a Textifier object to convert bytecode instructions to text
//            Textifier textifier = new Textifier();
//
//// create a TraceMethodVisitor to visit the method's bytecode and print the text output
//            TraceMethodVisitor traceMethodVisitor = new TraceMethodVisitor(textifier);
//
//// visit the method's bytecode with the TraceMethodVisitor
//            method.accept(traceMethodVisitor);
//
//// get the collected text output as a string
//            String methodText = stringWriter.toString();
//
//// print the method text to the console
//            System.out.println(methodText);
//        }
////        if (methodNode != null) {
////            System.out.println("MethodNode instructions: " + methodNode.instructions);
////            StringWriter stringWriter = new StringWriter();
////            PrintWriter printWriter = new PrintWriter(stringWriter);
////            Textifier textifier = new Textifier();
////            textifier.print(printWriter);
////            TraceMethodVisitor visitor = new TraceMethodVisitor(null,textifier);
////            methodNode.accept(visitor);
////            String methodText = stringWriter.toString();
////            System.out.println();
////            System.out.println("text:" + methodText);
////            System.out.println();
////        }
/*function buyToken(address _seller, uint256 _tokenId, uint256 _price) public payable {
        require(msg.value == _price, "Insufficient payment");
        require(ownerOf(_tokenId) == _seller, "Seller is not the owner of token");
        safeTransferFrom(_seller, msg.sender, _tokenId);
        payable(_seller).transfer(msg.value);
    }*/
//
//    }

    public void myMethod(int arg1, String arg2) {
        // Method implementation
        arg1 = 12;
        arg2 = "fasdaa";
    }

//    public static void main(String[] args) throws Exception {
//        try {
//            ClassReader reader = new ClassReader("TestContract");
//            StringWriter sw = new StringWriter();
//            TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(System.out));
//            reader.accept(tcv, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws Exception {
        TestContract obj = new TestContract();
        Method method = obj.getClass().getDeclaredMethod("myMethod", int.class, String.class);
        // Get the source code for the method
        String sourceCode = getSourceCode2(method);


        // Print the source code
        System.out.println(sourceCode);
    }

    private static String getSourceCode(Method method) throws Exception {
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        System.out.println(methodName);
        Path classPath = Paths.get(System.getProperty("user.dir"), "src/main/java");
        URLClassLoader classLoader = new URLClassLoader(new URL[] {classPath.toUri().toURL()});
        Class<?> clazz = classLoader.loadClass(className);
//        System.out.println(classPath.toUri().toURL());
        // Read the source file for the class
        String sourceFileName = clazz.getSimpleName() + ".java";

//        System.out.println(sourceFileName);
        URL sourceFileUrl = new URL("file:/Users/abdullahahmad/Documents/GitHub/EthereumFrameWork/src/main/java/TestContract.java");
//        System.out.println(sourceFileUrl);
        String sourceCode = new Scanner(sourceFileUrl.openStream(), "UTF-8").useDelimiter("\\A").next();

        // Extract the source code for the method
        String methodSourceCode = "";
        String[] lines = sourceCode.split("\\r?\\n");
        boolean inMethod = false;
        int i = 0;
        for (String line : lines) {
            if (!inMethod) {
                if (line.contains(methodName)) {
                    inMethod = true;
                    methodSourceCode += line + "\n";
                }
            } else {
                if (line.contains("{")) {
                    int bracketCount = 1;
                    methodSourceCode += line + "\n";
                    while (bracketCount > 0) {
                        line = lines[++i];
                        if (line.contains("{")) {
                            bracketCount++;
                        }
                        if (line.contains("}")) {
                            bracketCount--;
                        }
                        methodSourceCode += line + "\n";
                    }

                    break;
                } else {
                    methodSourceCode += line + "\n";
                }
            }
            i++;
        }

        return methodSourceCode;
    }

    private static String getSourceCode2(Method method) throws Exception {
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
//        System.out.println(methodName);
        Path classPath = Paths.get(System.getProperty("user.dir"), "src/main/java");
        URLClassLoader classLoader = new URLClassLoader(new URL[] {classPath.toUri().toURL()});
        Class<?> clazz = classLoader.loadClass(className);
//        System.out.println(classPath.toUri().toURL());
        // Read the source file for the class
        String sourceFileName = clazz.getSimpleName() + ".java";

//        System.out.println(sourceFileName);
        URL sourceFileUrl = new URL("file:/Users/abdullahahmad/Documents/GitHub/EthereumFrameWork/src/main/java/TestContract.java");
//        System.out.println(sourceFileUrl);
        String sourceCode = new Scanner(sourceFileUrl.openStream(), "UTF-8").useDelimiter("\\A").next();

        // Extract the source code for the method
        String methodSourceCode = "";
        String[] lines = sourceCode.split("\\r?\\n");

        for (int i = 0 ; i<lines.length ; i++) {
                if (lines[i].contains(" " + methodName)){
                    int bc = 0;
                    boolean beg = true;
                    while(bc>0 || beg){
                        methodSourceCode += lines[i] + "\n";
                        if(lines[i].contains("{")){
                            beg = false;
                            bc++;
                        }
                        if(lines[i].contains("}"))
                            bc--;
                        i++;

                    }
                }


        }

        return methodSourceCode;
    }
}






class Uint {
    int val;

    public Uint(int val) {
        this.val = val;
    }
}
