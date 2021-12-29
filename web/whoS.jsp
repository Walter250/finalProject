
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <title>WHO ARE YOU</title>
    </head>
    <body>
        <div class="container py-5">
  <div class="col-md-6 offset-md-3 mt-5">
    <div class="card shadow">
      <div class="card-body p-4">
        <h3 class="font-weight-normal text-center mb-5">WHO ARE YOU?</h3>
        <form action="nextS" class="mb-5">
            
            <div class="form-group">
            <label>CHOOSE:</label>
                    <select class="form-control" name="choice">
                        <option value="patient">PATIENT</option>
                        <option value="doctor">DOCTOR</option>
                    </select>
            </div>
            <div class="form-group">
            <button class="btn btn-info btn-block my-5">NEXT</button>
            </div>
            </form>

      </div>
    </div>
  </div>
</div>
    </body>
</html>

