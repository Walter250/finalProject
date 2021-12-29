
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
        <title>Sign Up Form</title>
    </head>
    <body>
        <div class="container py-5">
  <div class="col-md-6 offset-md-3 mt-5">
    <div class="card shadow">
      <div class="card-body p-4">
        <h3 class="font-weight-normal text-center mb-5">REGISTER</h3>
        <form action="../doctor/SignupProcess.jsp" method="POST" class="mb-5">
            <div class="form-group">
            <input class="form-control" type="text" name="names" placeholder="NAMES">
            </div>
            <div class="form-group">
            <input class="form-control" type="text" name="email" placeholder="EMAIL">
            </div>
            <div class="form-group">
            <input class="form-control" type="text" name="phone" placeholder="Phone number">
            </div>
            <div class="form-group">
            <input class="form-control" type="password" name="password" placeholder="Password">
            </div>
            <div class="form-group">
            <input class="form-control" type="password" name="password2" placeholder="Confirm password">
            </div>
            <div class="form-group">
            <button class="btn btn-info btn-block my-5">Register</button>
            </div>
            </form>

      </div>
    </div>
  </div>
</div>
    </body>
</html>

