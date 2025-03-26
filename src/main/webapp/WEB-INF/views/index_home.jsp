<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<head>
<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/profile.css" rel="stylesheet">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://bootswatch.com/cosmo/bootstrap.min.css">
	<link rel="stylesheet" href="${contextPath}/resources/css/w3.css">
</head>
<body>
<<<<<<< HEAD
<div class="mainbody container-fluid">
    <div class="row">
        <div class="navbar-wrapper">
            <div class="container-fluid">
                <div class="navbar navbar-custom navbar-static-top" role="navigation">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span><span
                                    class="icon-bar"></span><span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="${contextPath}/index">VISUAL PATH</a>
                            <i class="brand_network"><small><small>VProfile</small></small></i>
                        </div>
                        <div class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li><a href="#technologies">TECHNOLOGIES</a></li>
                                <li><a href="#about">ABOUT</a></li>
                                <li><a href="#contact">CONTACT</a></li>
                                <li><a href="#">BLOG</a></li>
                            </ul>
                            <div class="navbar-collapse navbar-right collapse">
	                            <ul class="nav navbar-nav">
	                        	 <li><a href="${contextPath}/login">LOGIN</a></li>
	                        	 <li><a href="${contextPath}/registration">SIGN UP</a></li>
	                       	 	</ul>
                            </div>
                            
                         </div>
                         
                    </div>
                </div>
            </div>
 		</div>
	</div>
</div>
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img style='opacity:.8' class="w3-image" src="${contextPath}/resources/Images/header.jpg" alt="Architecture" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>DevOps</b></h1>
  </div>
=======
<div class="container-fluid">
    <nav class="navbar navbar-custom navbar-static-top" role="navigation" style="background-color: #e3f2fd;">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${contextPath}/index">HKH Infotech</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#technologies">Technologies</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                    <li><a href="#">Blog</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${contextPath}">Login</a></li>
                    <li><a href="${contextPath}/registration">Sign up</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="${contextPath}/resources/Images/dev_img.jpeg" alt="Architecture" width="1500" height="800">
>>>>>>> 79694ff (Initial commit for terraform-project)
</header>
<div>
<blockquote><p>
     <h2 align="center" style="font-family: Verdana,sans-serif;color:#1C3B47;">Keep Learning ..</h2>
<<<<<<< HEAD
     <h3 align="center" style="font-family: Verdana,sans-serif;color:#1C3B47;">Learning is a Treasure that will follow it's Owner Everywhere..</h3> 
=======
     <h3 align="center" style="font-family: Verdana,sans-serif;color:#1C3B47;">Learning is a Treasure that will follow it's Owner Everywhere..</h3>
>>>>>>> 79694ff (Initial commit for terraform-project)
</blockquote>
<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">

  <!-- Project Section -->
  <div class="container w3-padding-32" id="technologies">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16" align="center">TECHNOLOGIES</h3>
  </div>

  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
<<<<<<< HEAD
        <img src="${contextPath}/resources/Images/technologies/Ansible_logo.png" alt="DevOps" style="width:150px;height:150px">      
      </div>      
=======
        <img src="${contextPath}/resources/Images/technologies/Ansible_logo.png" alt="DevOps" style="width:150px;height:150px">
      </div>
>>>>>>> 79694ff (Initial commit for terraform-project)
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
         <img src="${contextPath}/resources/Images/technologies/aws.png" alt="DevOps" style="width:200px;height:150px">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <img src="${contextPath}/resources/Images/technologies/git.jpg" alt="DevOps" style="width:150px;height:150px">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <img src="${contextPath}/resources/Images/technologies/jenkins.png" alt="DevOps" style="width:200px;height:150px">
      </div>
    </div>
  </div>

  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <img src="${contextPath}/resources/Images/technologies/docker.png" alt="DevOps" style="width:150px;height:150px">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
<<<<<<< HEAD
        <img src="${contextPath}/resources/Images/technologies/puppet.jpg" alt="DevOps" style="width:150px;height:150px">
=======
        <img src="${contextPath}/resources/Images/technologies/puppet.jpg" alt="DevOps" style="width:200px;height:150px">
>>>>>>> 79694ff (Initial commit for terraform-project)
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <img src="${contextPath}/resources/Images/technologies/Vagrant.png" alt="DevOps" style="width:150px;height:150px">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <img src="${contextPath}/resources/Images/technologies/python-logo.png" alt="DevOps" style="width:200px;height:150px">
      </div>
    </div>
  </div>

  <!-- About Section -->
  <div class="container w3-padding-32" id="about">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16" align="center">ABOUT</h3>
<<<<<<< HEAD
    <div class="w3-content" style="max-width:700px">
	    <p style="text-align:justify;">VisualPath is an IT Educational Institute.Established in 2001,and Institute offers world class quality of education and wide range of courses.VisualPath Institute has a dedicated placement team to help students get job placement in various IT job roles with major companies.
	    </p>
	    <p><strong>Address:</strong>  Flat no: 205, 2nd Floor,NILGIRI Block,Aditya Encalve,Ameerpet, Hyderabad-16</p> 
	    <p><strong>Ph No: </strong>  +91-9704455959,9618245689</p>
		<p><strong>E-Mail ID :</strong>  visualpath999@gmail.com</p>
  	</div>
   </div>
  
  <!-- Contact Section -->
  <div class="container w3-padding-32" id="contact">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16" align="center">CONTACT</h3>
    <p>Lets get in touch and talk about your and our next project.</p>
    <form action="/action_page.php" target="_blank">
=======
    <div class="w3-content" style="max-width:864px">
	     <p style="text-align:justify;">
                    HKH Infotech is a dynamic software company dedicated to delivering innovative technology solutions. Founded with a mission to leverage cutting-edge technology and unparalleled expertise, we specialize in creating high-quality software solutions that drive business success.
                </p>
                <p style="text-align:justify;">
                    Our team is led by seasoned DevOps experts with many years of industry experience. They bring a wealth of knowledge in automating and optimizing the software development lifecycle, ensuring that our projects are efficient, reliable, and scalable.
                </p>
                <p style="text-align:justify;">
                    At HKH Infotech, we focus on understanding our clients' unique needs and providing tailored solutions that meet their objectives. Whether it's custom software development, system integration, or ongoing support, we are committed to excellence and client satisfaction.
                </p>
                <p style="text-align:justify;">
                    With a commitment to staying ahead of technological trends and a passion for innovation, HKH Infotech is your trusted partner in navigating the digital landscape and achieving your business goals.
                </p>
                <p><strong>Address:</strong> Punjagutta Colony Ameerpet, Hyderabad</p>
                <p><strong>Phone:</strong> +91-8001234567</p>
                <p><strong>Email:</strong> contact@hkhinfotech.com</p>
  	</div>
   </div>

  <!-- Contact Section -->
  <div class="container w3-padding-32" id="contact">

    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16" align="center">CONTACT</h3>
    <div class="forms" id="contact-form">
    <p>Lets get in touch and talk about your and our next project.</p>
    <form action="/action_page.php" id="action" target="_blank">
>>>>>>> 79694ff (Initial commit for terraform-project)
      <input class="w3-input" type="text" placeholder="Name" required name="Name">
      <input class="w3-input w3-section" type="text" placeholder="Email" required name="Email">
      <input class="w3-input w3-section" type="text" placeholder="Subject" required name="Subject">
      <input class="w3-input w3-section" type="text" placeholder="Comment" required name="Comment">
      <button class="w3-button w3-black w3-section" type="submit">
        <i class="fa fa-paper-plane"></i> SEND MESSAGE
      </button>
    </form>
<<<<<<< HEAD
  </div>
   
<!-- End page content -->
</div>


<!-- Footer -->
<footer class="w3-center  w3-padding-16" style="background-color:#1C3B47 ">
  <p style="color:#FFFFFF ">Copyright @2017 <a href="#"  target="_blank" class="w3-hover-text-green"> visualpathit.com</a></p>
</footer>
=======
    </div>
  </div>

<!-- End page content -->


>>>>>>> 79694ff (Initial commit for terraform-project)



</body>
</html>

</body>