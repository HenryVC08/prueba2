function enviarDatos(){
    var usuario = document.getElementById("user").value;
    var pass = document.getElementById("password").value;

    window.location.href ="http://localhost:8080/inicioSesion/" + usuario + "/" + pass;

}