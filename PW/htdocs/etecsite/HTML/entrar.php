<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../CSS/cursos.css">
    <title>Entrar - ETEC</title>
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
            <h2>Entrar</h2>
            
            <form action="validar_login.php" method="POST">
                <div class="campo">
                    <label>E-mail</label>
                    <input type="email" name="email" placeholder="email@exemplo.com">
                </div>

                <div class="campo">
                    <label>Senha</label>
                    <input type="password" name="senha" placeholder="Sua senha">
                </div>

                <div class="centralizar-btn">
                    <button type="submit" class="btn-enviar" style="border: none; cursor: pointer;">Acessar</button>
                </div>
            </form>
            
            <div style="margin-top: 20px; text-align: center;">
                <p style="font-size: 14px; color: #666;">Não tem conta? <a href="cadastrar.php" style="color: rgb(146, 20, 20);">Cadastre-se</a></p>
            </div>
        </div>
    </div>

</body>
</html>