<%-- 
    Document   : galeria
    Created on : 28/11/2021, 06:20:14 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <script src="https://kit.fontawesome.com/eb496ab1a0.js" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">
    <title>Galeria de imagenes</title>
    <link rel="stylesheet" href="Estilos/galeriaStyles.css">
</head>

<body>
    <header>
        <div class="contenedor-principal">
            <div class="logo">
                <img src="http://www.moonlighthotel.gr/wp-content/uploads/2018/12/logo.png" alt=""
                    style="filter: brightness(0.1)">
            </div>
            <div class="contenedor-menu">
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="habitaciones.jsp">Habitaciones</a></li>
                    <li><a href="galeria.jsp">Galeria</a></li>
                    <li><a href="servicios.jsp">Servicios</a></li>
                    <li><a href="ubicacion.jsp">Ubicacion</a></li>
                </ul>
            </div>
            <div class="boton-registrar">
                <a href="login.jsp"><button class="btn_registrar">Reservar</button></a>
            </div>
        </div>
    </header>
    <div class="galeria">
        <h1>Galeria de imagenes</h1>
        <div class="linea"></div>
        <div class="contenedor-imagenes">
            <div class="imagen">
                <img src="https://media-cdn.tripadvisor.com/media/photo-s/06/db/47/10/hotel-paracas-a-luxury.jpg"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://i.pinimg.com/originals/27/2c/73/272c733d4241fed427fb9410b4c57557.jpg" alt="">
            </div>
            <div class="imagen">
                <img src="http://www.moonlighthotel.gr/wp-content/uploads/2018/11/slide3.jpg" alt="">
            </div>
            <div class="imagen">
                <img src="https://www.hilton.com/im/en/CUZGIGI/7574847/img-0032.jpg?impolicy=crop&cw=3840&ch=2150&gravity=NorthWest&xposition=0&yposition=205&rw=768&rh=430"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://www.hilton.com/im/en/CUZGIGI/7574892/img-0236-.jpg?impolicy=crop&cw=3840&ch=2150&gravity=NorthWest&xposition=0&yposition=205&rw=768&rh=430"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://cache.marriott.com/marriottassets/marriott/LIMSI/limsi-interior-5280-hor-clsc.jpg?downsize=1440px:*"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://gestion.pe/resizer/n7XNBExYPhnam_wlHE3jwpHLViQ=/620x0/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/M3I5MOR26JAY7FOCV33BZ3LHUU.jpg"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://www.kayak.es/rimg/himg/80/5c/f0/leonardo-197275666-ALTA_RES_DSC6114_O-640855.jpg?width=1366&height=768&crop=true"
                    alt="">
            </div>
            <div class="imagen">
                <img src="https://www.hilton.com/im/en/CUZGIGI/7506534/conservatory-lounge-day.jpg?impolicy=crop&cw=5760&ch=3225&gravity=NorthWest&xposition=0&yposition=307&rw=768&rh=430"
                    alt="">
            </div>

        </div>
    </div>
    <footer class="pie-pagina">
        <div class="grupo-1">
            <div class="box">
                <figure>
                    <a href="#">
                        <img src="http://www.moonlighthotel.gr/wp-content/uploads/2018/12/logo.png"
                            alt="Logo del hotel Moonlight">
                    </a>
                </figure>
            </div>
            <div class=" box">
                <h2>SOBRE NOSOTROS</h2>
                <p>Queremos aprobar... no nos jale profe</p>
                <p>Cevicheria, cevicheria la lomita!!</p>
            </div>
            <div class="box">
                <h2>SIGUENOS</h2>
                <div class="red-social">
                    <a href="#" class="fa fa-facebook"></a>
                    <a href="#" class="fa fa-instagram"></a>
                    <a href="#" class="fa fa-twitter"></a>
                    <a href="#" class="fa fa-youtube"></a>
                </div>
            </div>
        </div>
        <div class="grupo-2">
            <small>&copy; 2021 <b>Partido Nacional Socialista Obrero Aleman</b> - Todos los Derechos Reservados.</small>
        </div>
    </footer>
</body>

</html>