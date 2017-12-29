<!DOCTYPE html>

<html lang="en">

    <body>
        Date: ${time?date}
        <br>
        Time: ${time?time}
        <br>
        Message: ${message}
        <br>
        path:${request.contextPath}

        <script type="text/javascript" src="${request.contextPath}/libs/jquery-3.2.1.js"></script>
    </body>

</html>