

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link href="../DataTables/datatables.min.css" rel="stylesheet" type="text/css"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>APPOINTMENTS</title>
    </head>
    <body>
        
        <table id="mytable" class="table table-striped table-hover" style="margin-top: 40px">
          <thead>
            <th scope="col">patient</th>
            <th scope="col">date</th>
           
            </thead>  
        </table>
        
    <div class="container py-5" id="frm" style="display: none;">
             <div class="col-md-6 offset-md-3 mt-5" >
    <div class="card shadow">
      <div class="card-body p-4">
        <h3 class="font-weight-normal text-center mb-5">Edit</h3>
        <form action="../patient/EditProcess.jsp" method="POST" class="mb-5">
            <div class="form-group">
                <input class="form-control" type="text" name="names" id="names" placeholder="names">
            </div>
     
            <div class="form-group">
                <input class="form-control" type="date" name="date" id="date" placeholder="Date">
            </div>
            
           
            <div class="form-group">
            <button class="btn btn-info btn-block my-5">Update</button>
            </div>
            </form>
      </div>
    </div>
  </div>
</div>
        
        <script src="../jquery/jquery.js" type="text/javascript"></script>
        <script src="../DataTables/datatables.min.js" type="text/javascript"></script>
        <script>
            var personID =null;
            function displadata(){
                $('#mytable').dataTable().fnDestroy();
                $.ajax({
                    url:"http://localhost:8080/Appointment/doctor/APIList.jsp",
                    type:'GET',
                    dataType:'JSON',
                    
                    success: function(data){
                        console.log(data);
                        $('#mytable').dataTable({
                            "aaData":data,
                            "scrollx": true,
                            "aoColumns":[
                           
                                {"sTitle":"patient",mData:"patient"},
                                {"sTitle":"date",mData:"date"}
                               
                              
                            ]
                        });
                    }
                });
            }
            displadata();
            
                
        
        </script>
    </body>
</html>
