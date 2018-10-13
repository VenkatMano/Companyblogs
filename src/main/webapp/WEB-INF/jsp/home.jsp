<%-- 
    Document   : hello
    Created on : Feb 4, 2018, 4:45:36 PM
    Author     : Venkatesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="${pageContext.request.contextPath}/resources/js/angular.min.js"/></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Solutions</title>
</head>
<body style = "background-color: antiquewhite">        
    <div class="mdl-layout__header mdl-layout__header--waterfall">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <span class="mdl-layout-title mdl-color-text--yellow-A100" style="font-size:40px;font-style: italic;font-family: Times New Roman;font-stretch:semi-condensed">The Solutions</span>
            <div style="margin-left: 700px">
                <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" style="background-color: lightblue"><span style="color: indigo;font-style: oblique;font-family: Times New Roman">${userName}</span></button>
                <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent" style="background-color: lightblue"><span style="color: indigo;font-style: oblique;font-family: Times New Roman">Sign Out</span></button>
                
            </div>
            <!-- Add spacer, to align navigation to the right -->               
            <!-- Navigation -->

        </div>
    </div>       
    <div>
        <h3 style="font-family:'Times New Roman'">Expose, Gain and Solve</h3>
    </div>
    <div>
        <p style="font-family:'Times New Roman';font-size:20px">With Solutions you can expose any of the doubts to the peoples in your organization and gain 
            knowledge by seeing already solved questions and also you can solve the questions asked by your companions. This is the place
            only for knowledge seekers and problem solvers.</p>
    </div>
    <div class="mdl-grid">
        <div class="mdl-cell mdl-cel--3-col">
            <div class="mdl-card mdl-shadow--2dp demo-card-square" style="background-color:blanchedalmond">
                <div class="mdl-card__title mdl-card--expand">
                    <h2 class="mdl-card__title-text">Expose</h2>
                </div>
                <div class="mdl-card__supporting-text">
                    Expose your doubts as questions to get precise answer from our users
                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent mdl-js-ripple-effect"style="background-color: chocolate" onclick="location.href='/companyblogs/expose'">
                        Post Doubts
                    </button>
                </div>
            </div>
        </div>
        <!-- Square card -->
        <div class="mdl-cell mdl-cel--3-col">
            <div class="mdl-card mdl-shadow--2dp demo-card-square" style="background-color:blanchedalmond">
                <div class="mdl-card__title mdl-card__accent mdl-card--expand">
                    <h2 class="mdl-card__title-text">Knowledge Entrepreneur</h2>
                </div>
                <div class="mdl-card__supporting-text">
                    Gain knowledge from knowing the answers of solved questions
                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent mdl-js-ripple-effect"style="background-color: chocolate">
                        Solved
                    </button>
                </div>
            </div>
        </div>
        <!-- Square card -->
        <div class="mdl-cell mdl-cel--3-col">
            <div class="mdl-card mdl-shadow--2dp demo-card-square"style="background-color:blanchedalmond">
                <div class="mdl-card__title mdl-card--expand">
                    <h2 class="mdl-card__title-text">Solve</h2>
                </div>
                <div class="mdl-card__supporting-text">
                    Solve doubts and make yourself proud by answering questions of our user.
                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent mdl-js-ripple-effect"style="background-color: chocolate">
                        Questions
                    </button>
                </div>
            </div>
        </div>



    </div>
<!--                  <td><button class = "mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
                  <i class = "material-icons">add</i></button></td>
               <td><button class = "mdl-button mdl-js-button mdl-button--raised mdl-button--accent">
                  <i class = "material-icons">add</i></button></td>
               <td><button class = "mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">
                  <i class = "material-icons">add</i></button></td>
            </tr-->
</body>
</html>
