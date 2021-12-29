

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
         <link rel="stylesheet" type="text/css" href="../css/font-awesome.css">
        <title>BOOK</title>
    </head>
    
    <body>
         <div class="container py-5">
  <div class="col-md-6 offset-md-3 mt-5">
    <div class="card shadow">
      <div class="card-body p-4">
        <h3 class="font-weight-normal text-center mb-5">BOOK APPOINTMENT</h3>
        <form action="../patient/bookingProcess.jsp" method="POST" class="mb-5">
            
            <div class="form-group">
            <input class="form-control" type="text" name="names">
            </div>
            <div class="form-group">
            <input class="form-control" type="date" name="dt" placeholder="Date">
            </div>
            <div class="form-group">
            <button class="btn btn-info btn-block my-5">BOOK</button>
            </div>
            </form>
      </div>
    </div>
  </div>
</div>
    </body>
</html>
