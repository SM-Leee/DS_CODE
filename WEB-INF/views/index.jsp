<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>dsproject sourcecode page</title>
        <style type="text/css">
        * { 
            margin: 0; 
            padding: 0;
        }
        h1 {
        	margin: 0 1rem;
        }
        .wrapper {
            display: flex;
        }
        .wrapper2 {
        	display: flex;
        	justify-content: space-between;
        }
        .box {
            margin: 1rem;
            flex: 1;
        }
        .box > h2 {
            text-align: center;
            border: 1px solid black;
        }
        a {
            padding-left: 2rem;
        }
        .link {
            margin-bottom: 1rem;
        }
        .copybtn {
        	text-align: center;
        	width: 4rem;
        	border-radius: 5px;
        	right: 0;
        	line-height: 100%;
        }
        .copybtn:active {
        	background-color: gray;
        }
        .copyurl {
        	display: none;
        }
        </style>
    </head>
    <body>
        <h1>dsproject sourcecode page</h1>
        <div class="wrapper">
            <!-- js link -->
            <jsp:include page="/WEB-INF/views/includes/js.jsp"/>
            

            <!-- css link -->
            <jsp:include page="/WEB-INF/views/includes/css.jsp"/>
            

            <!-- image link -->
            <jsp:include page="/WEB-INF/views/includes/image.jsp"/>
            
        </div>
        <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
        <script>
        $('.copybtn').click(function(){	
        	var urlAddress= $(this).next()
        	urlAddress.css('display','block').select();
        	document.execCommand("Copy");
        	urlAddress.css('display','none');
        });
        </script>
    </body>
</html>