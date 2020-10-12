<%@page contentType="text/html" pageEncoding="ISO-8859-15"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <!-- div de centrage -->
        <div>
            
            <!-- fichiers inclus -->
            <!-- POSSIBLE PASSAGE DE PARAMETRES TRAITES PAR LES FICHIERS INCLUS -->
            <jsp:include page="../haut.jsp"/>
            <jsp:include page="../navigation.jsp"/>
      
   
        
        <div class ="containers" id="main">
      
            
            <form action="themes" method="post" >
                <p>Voulez-vous vraiment supprimer le theme ${requestScope.theme.libelle} ?</p>
                
                <input type="hidden" name="action" value="${requestScope.action}"/>
                <input type="hidden" name="id" value="${requestScope.theme.idTheme}"/>
            
                <p><input type="image" src="MEDIAS/GO.jpg" /> <a href="themes"><img src="MEDIAS/ICO_DELETE.png"/></a></p>
                <p></p>
                
            </form>

        </div>
        
            
            
        </div>
        
        
    </body>
</html>

