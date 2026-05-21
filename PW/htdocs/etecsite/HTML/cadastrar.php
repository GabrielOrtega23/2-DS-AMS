<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../CSS/cursos.css">
    <title>Cadastro - ETEC</title>
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
            <h2>Cadastro</h2>
            
            <form action="confirmacao.php" method="POST">
                <div class="campo">
                    <label>Nome Completo</label>
                    <input type="text" name="nome" placeholder="Seu nome completo">
                </div>

                <div class="campo">
                    <label>E-mail</label>
                    <input type="email" name="email" placeholder="email@exemplo.com">
                </div>

                <div class="campo">
                    <label>Senha</label>
                    <input type="password" name="senha" placeholder="Crie uma senha">
                </div>

                <div class="centralizar-btn">
                    <button type="submit" class="btn-enviar" style="border: none; cursor: pointer;">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>

</body>
</html>