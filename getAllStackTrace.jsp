<%@ page import="java.util.Map"%>

<html>
<head>
</head>

<body>
<pre>
<%
    for (Map.Entry<Thread, StackTraceElement[]> stackTrace : Thread.getAllStackTraces().entrySet()) {
        Thread thread = (Thread) stackTrace.getKey();
        StackTraceElement[] stack = (StackTraceElement[]) stackTrace.getValue();
        if (thread.equals(Thread.currentThread())) {
            continue;
        }
        out.print("\nThread: " + thread.getName() + "\n");
        for (StackTraceElement element : stack) {
            out.print("\t" + element + "\n");
        }
    }
%>
</pre>
</body>
</html>
