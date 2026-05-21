<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../CSS/cursos.css">
    <title>Login Realizado</title>
</head>
<body>
    <header>
        <section class="logo">
            <img class="img" src="../imagens/cps-removebg-preview.png">
        </section>
       <ul class="ul1">
            <li class="li-1"><strong><a class="a1" href="../index.html">Início</a></strong>
            </li>

            <li class="li-1"><strong><a class="a1" href="../HTML/cursos.html">Cursos</a></strong>
            </li>

            <li 
            class="li-1"><strong><a class="a1" href="#">Etec</a></strong>
           </li>

            <li
             class="li-1"><strong><a class="a1" href="#">Fatec</a></strong>
            </li>

            <li class="li-1"><strong><a class="a1" href="../HTML/contato.html">Contato</a></strong>
            </li>

            <li class="li-1"><strong><a class="a1" href="../HTML/sobre.html">Sobre</a></strong>
            </li>
        </ul>
    </header>

    <div class="bloco-1">
        <div class="blocopreto">
            <img src="../imagens/image SP ULTRA-HD.jpg" class="sp">
        </div>
    </div>

    <div class="overlay-contato">
        <div class="caixa-contato">
            <h2>Bem-vindo de volta!</h2>
            
            <?php
               
                $email = $_POST["email"];
                $senha = $_POST["senha"];
            ?>
            
            <div style="background-color: #ebebeb; padding: 20px; border-radius: 4px; text-align: left; margin-bottom: 20px;">
                <p style="margin-bottom: 10px;"><strong>Login efetuado com sucesso para o e-mail:</strong></p>

                <p style="color: rgb(146, 20, 20); font-weight: bold;"><?php echo $email; ?></p>

                <hr style="margin: 15px 0; border: 0.5px solid #ccc;">
                
                <p><strong>Sua senha informada:</strong> <?php echo $senha; ?></p>
            </div>

            <div class="centralizar-btn">
                <a href="../index.html" class="btn-enviar">Ir para a Home</a>
            </div>
        </div>
    </div>

</body>
</html>